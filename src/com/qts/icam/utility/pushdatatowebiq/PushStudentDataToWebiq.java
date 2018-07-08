package com.qts.icam.utility.pushdatatowebiq;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.json.JSONArray;
import org.json.JSONObject;

import com.qts.icam.model.WebIQTransaction;
import com.qts.icam.model.AcademicYear;
import com.qts.icam.model.Student;
import com.qts.icam.service.PushService;

import javax.naming.Context;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;


public class PushStudentDataToWebiq {
	
	private static List<Student> studentList = new ArrayList<Student>();
	
	private static String uri = "http://apps.sainikschoolpurulia.com/api/webiq/v1/sendBasicDetailsOfCadet";
	private static String portalUserName = "adminwebservice@qtsin.net";
	private static String portalPassWord = "!Q2w3e4r";
	
	private static PushService pushService = new PushService();
	
	public static void main(String[] args){
		
		PushStudentDataToWebiq pushStudentDataToWebiq = new PushStudentDataToWebiq();
		
		try {
			
			AcademicYear academicYear = pushService.getCurrentAcademicYear();
			
			studentList = pushService.getStudentList();
			Student stu = new Student();
			//stu.setRoll("4638");
			studentList.add(stu);
			int noOfStudents = (null != studentList) ? studentList.size() : 0;
			System.out.println("Size of student list : " +  noOfStudents);
			
			if(null != studentList){
				for(Student cadet : studentList){
					
					Student student = pushService.getStudentDetails(cadet.getRoll());
					
					String standardName = pushService.getStandardNameforCourse(student.getCourseId());
					
					JSONObject jsonObj = pushStudentDataToWebiq.createCadetDetailsJson(student, standardName, academicYear);
					System.out.println("Cadet Details JSON : " +  jsonObj.toString());
					
					String status = pushStudentDataToWebiq.sendJsonData(jsonObj);
					
					if(status.equalsIgnoreCase("Successful")){
						JSONObject jsonReq = pushStudentDataToWebiq.createLdapJson(student);
						String jsonReponse = pushStudentDataToWebiq.createUser(jsonReq);
						
						if(jsonReponse.equalsIgnoreCase("success")){
							System.out.println("Cadet login crested in LDAP for Roll Number  : " +  cadet.getRoll());
						}
					}
					
					System.out.println("Cadet Data push to Webiq " + status + "  for Cadet having Roll Number : " +  cadet.getRoll());
				}
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	private String sendJsonData(JSONObject jsonObj) throws Exception{
		
		String status = null;
		WebIQTransaction webIQTran= null;
		
		URL url = new URL(uri);
		HttpURLConnection connection = null;
		OutputStreamWriter out = null;
		String json_response = "";
		InputStreamReader in = null;
		BufferedReader br = null;
		
		try{
			connection = (HttpURLConnection)url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);
			connection.setRequestMethod("POST");
			out = new OutputStreamWriter(connection.getOutputStream());
			out.write(jsonObj.toString());
			out.close();
			
			
			in = new InputStreamReader(connection.getInputStream());
			br = new BufferedReader(in);
			String text = "";
			while((text = br.readLine())!= null){
				json_response += text;
			}
		}catch(Exception e){
			//** Could be connection Issue **//*
			e.printStackTrace();

			//Could be Connection Failure then also insert into the webiq_transaction_details table
			webIQTran = new WebIQTransaction();
			webIQTran.setUpdatedBy("superadmin");
			webIQTran.setUri(uri);
			webIQTran.setRequestJSON(jsonObj.toString());
			webIQTran.setResponseJSON(json_response);
			webIQTran.setStatus(false);

			pushService.addWebIQTransaction(webIQTran);
			
			status = "Failed";
		}
		System.out.println("JSON response:::"+ json_response);
		//String json_response = "{\"status\" : \"200\"}";
		if((!json_response.isEmpty())){
			
			JSONObject object = new JSONObject(json_response);
			String intStatus = object.get("status").toString();
			int statusFromJsonResponse = Integer.parseInt(intStatus);
			
			if(statusFromJsonResponse==200){
				
				//If call to the API is successful, then insert into the webiq_transaction_details table 
				webIQTran = new WebIQTransaction();
				webIQTran.setUri(uri);
				webIQTran.setUpdatedBy("superadmin");
				webIQTran.setRequestJSON(jsonObj.toString());
				webIQTran.setResponseJSON(json_response);
				webIQTran.setStatus(true);
				
				status = "Successful";
				
			}else{
				
				//If Failure then also insert into the webiq_transaction_details table
				webIQTran = new WebIQTransaction();
				webIQTran.setUpdatedBy("superadmin");
				webIQTran.setUri(uri);
				webIQTran.setRequestJSON(jsonObj.toString());
				webIQTran.setResponseJSON(json_response);
				webIQTran.setStatus(false);
				
				status = "Failed";
			}
			
			try{
			pushService.addWebIQTransaction(webIQTran);
			}catch(Exception e){
				e.printStackTrace();
			}
			
			
		}
		return status;
	}
	
	private JSONObject createLdapJson(Student student) throws Exception{
		JSONObject ldapJsonObj = new JSONObject();
		//String jsonReq = "{\"firstName\":" + "\"" + student.getResource().getFirstName() + "\"," + "\"lastName\":" +  "\"" + student.getResource().getLastName() + "\"," + "\"userName\":" +  "\"" + student.getRoll() + "\"," + "\"password\": \"welcome\", \"organization\": \"ss-purulia\", \"serviceUserName\": \"test\", \"servicePassword\": \"test\"}";		
		ldapJsonObj.put("userName",student.getUserId());
		ldapJsonObj.put("password","welcome");
		ldapJsonObj.put("organization","ss-purulia");
		ldapJsonObj.put("firstName", student.getResource().getFirstName());
		ldapJsonObj.put("lastName", student.getResource().getLastName());
		ldapJsonObj.put("serviceUserName","test");
		ldapJsonObj.put("servicePassword","test");
		return ldapJsonObj;
	}
	
	private JSONObject createCadetDetailsJson(Student student, String standardName, AcademicYear academicYear) throws Exception{
		
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("username",portalUserName);
		jsonObj.put("password",portalPassWord);
		jsonObj.put("standard",standardName);
		jsonObj.put("courseCode",student.getCourseId());
		
		jsonObj.put("admissionDrive" , "ADIXIXL-D1");
		jsonObj.put("formId", "NA");
		jsonObj.put("academicsSession", academicYear.getAcademicYearName());
		
		jsonObj.put("rollNumber", student.getUserId());
		jsonObj.put("firstName", student.getResource().getFirstName());
		jsonObj.put("middleName", student.getResource().getMiddleName());
		jsonObj.put("lastName", student.getResource().getLastName());
		jsonObj.put("contactNumber", student.getResource().getMobile());
		jsonObj.put("dateOfBirth",student.getResource().getDateOfBirth());	
		jsonObj.put("admissisonDate",student.getDateOfAdmission());	
		jsonObj.put("gender", student.getResource().getGender());
		jsonObj.put("bloodGroup", student.getResource().getBloodGroup());
		if(null!=student.getResource().getCategory()) {
			jsonObj.put("category", student.getResource().getCategory());
		}else {
			jsonObj.put("category", "GENERAL");
		}
		//jsonObj.put("category", "GENERAL");
		
		jsonObj.put("religion", student.getResource().getReligion());
		jsonObj.put("motherTongue", student.getResource().getMotherTongue());
		jsonObj.put("aadharNumber", student.getResource().getAadharCardNo());
		jsonObj.put("nationality", student.getResource().getNationality());
		jsonObj.put("childId", student.getResource().getChildId());
		
		jsonObj.put("house", student.getHouseData().getHouseName());
		jsonObj.put("stateOfDomicile", student.getStateOfDomicile());
		jsonObj.put("scholarship", student.getScholarship());
		jsonObj.put("bankName", student.getResource().getBankName());
		jsonObj.put("branch", student.getResource().getBankBranch());
		jsonObj.put("accountNumber", student.getResource().getAccountNumber());
		jsonObj.put("medicalStatus", student.getResource().getMedicalStatus());
		jsonObj.put("email", student.getResource().getEmailId());
		
		/*JSONObject profileImage = new JSONObject();
		Image image = student.getResource().getImage();
		
		long fileSize = image.getImageData().getSize();
		String fileName = image.getImageData().getOriginalFilename();
		String contentType = image.getImageData().getContentType();
		String encodedContents = encodeImage(image.getImageData().getBytes());
		
		profileImage.put("fileName",fileName);
		profileImage.put("fileSize",fileSize);
		profileImage.put("imageBytes",encodedContents);
		profileImage.put("fileType",contentType);
		profileImage.put("conderType","BASE64");
		
		jsonObj.put("profileImage1", profileImage);*/
		
		jsonObj.put("fatherFirstName", student.getResource().getFatherFirstName());
		jsonObj.put("fatherMiddleName", student.getResource().getFatherMiddleName());
		jsonObj.put("fatherLastName", student.getResource().getFatherLastName());
		jsonObj.put("fatherInDefence", student.getResource().getFatherInDefence());
		jsonObj.put("fatherServiceStatus", student.getResource().getFatherServiceStatus());
		jsonObj.put("fatherDefenceCategory", student.getResource().getFatherDefenceCategory());
		jsonObj.put("fatherRank", student.getResource().getFatherRank());
		jsonObj.put("fatherMobile", student.getResource().getFatherMobile());
		jsonObj.put("fatherEmail", student.getResource().getFatherEmail());
	
		jsonObj.put("motherFirstName", student.getResource().getMotherFirstName());
		jsonObj.put("motherMiddleName", student.getResource().getMotherMiddleName());
		jsonObj.put("motherLastName", student.getResource().getMotherLastName());
		jsonObj.put("motherMobile", student.getResource().getMotherMobile());
		jsonObj.put("motherEmail", student.getResource().getMotherEmail());
		
		jsonObj.put("guardianFirstName", student.getGuardianFirstName());
		jsonObj.put("guardianMiddleName", student.getGuardianMiddleName());
		jsonObj.put("guardianLastName", student.getGuardianLastName());
		jsonObj.put("guardianMobile", student.getGuardianMobile());
		jsonObj.put("guardianEmail", student.getGuardianEmail());
		
		jsonObj.put("fatherIncome", student.getFatherIncome());
		jsonObj.put("motherIncome", student.getMotherIncome());
		jsonObj.put("studentIncome", student.getStudentIncome());
		jsonObj.put("familyIncome", student.getFamilyIncome());
		
		JSONArray addressDetails = new JSONArray();
		JSONObject jsonObjAddress = new JSONObject();
		if(null!= student.getAddress()) {
			if(null!=student.getAddress().getPresentAddressLine()) {
				jsonObjAddress.put("presentAddressLine", student.getAddress().getPresentAddressLine());
			}else {
				jsonObjAddress.put("presentAddressLine","");
			}
			if(null!=student.getAddress().getPermanentAddressLandmark())
			jsonObjAddress.put("presentAddressLandmark", student.getAddress().getPermanentAddressLandmark()); 
			if(null!=student.getAddress().getPresentAddressCityVillage())
			jsonObjAddress.put("presentAddressCityVillage", student.getAddress().getPresentAddressCityVillage());
			if(null!=student.getAddress().getPresentAddressPinCode())
			jsonObjAddress.put("presentAddressPinCode", student.getAddress().getPresentAddressPinCode());
			if(null!=student.getAddress().getPresentAddressDistrict())
			jsonObjAddress.put("presentAddressDistrict", student.getAddress().getPresentAddressDistrict());
			if(null!=student.getAddress().getPresentAddressState())
			jsonObjAddress.put("presentAddressState", student.getAddress().getPresentAddressState());
			if(null!=student.getAddress().getPermanentAddressCountry())
			jsonObjAddress.put("presentAddressCountry", student.getAddress().getPermanentAddressCountry());
			if(null!=student.getAddress().getPermanentAddressPostOffice())
			jsonObjAddress.put("presentAddressPostOffice", student.getAddress().getPermanentAddressPostOffice());
			if(null!=student.getAddress().getPermanentAddressPoliceStation())
			jsonObjAddress.put("presentAddressPoliceStation", student.getAddress().getPermanentAddressPoliceStation());
			
			if(null!=student.getAddress().getPermanentAddressLine())
			jsonObjAddress.put("permanentAddressLine", student.getAddress().getPermanentAddressLine()); 
			if(null!=student.getAddress().getPermanentAddressLandmark())
			jsonObjAddress.put("permanentAddressLandmark", student.getAddress().getPermanentAddressLandmark()); 
			if(null!=student.getAddress().getPermanentAddressCityVillage())
			jsonObjAddress.put("permanentAddressCityVillage", student.getAddress().getPermanentAddressCityVillage());
			if(null!=student.getAddress().getPermanentAddressPinCode())
			jsonObjAddress.put("permanentAddressPinCode", student.getAddress().getPermanentAddressPinCode());
			if(null!=student.getAddress().getPermanentAddressDistrict())
			jsonObjAddress.put("permanentAddressDistrict", student.getAddress().getPermanentAddressDistrict());
			if(null!=student.getAddress().getPermanentAddressState())
			jsonObjAddress.put("permanentAddressState", student.getAddress().getPermanentAddressState());
			if(null!=student.getAddress().getPermanentAddressCountry())
			jsonObjAddress.put("permanentAddressCountry", student.getAddress().getPermanentAddressCountry());
			if(null!=student.getAddress().getPermanentAddressPostOffice())
			jsonObjAddress.put("permanentAddressPostOffice", student.getAddress().getPermanentAddressPostOffice());
			if(null!=student.getAddress().getPermanentAddressPoliceStation())
			jsonObjAddress.put("permanentAddressPoliceStation", student.getAddress().getPermanentAddressPoliceStation());
			
			if(null!=student.getAddress().getGuardianAddressLine())
			jsonObjAddress.put("guardianAddressLine", student.getAddress().getGuardianAddressLine()); 
			if(null!=student.getAddress().getGuardianAddressLandmark())
			jsonObjAddress.put("guardianAddressLandmark", student.getAddress().getGuardianAddressLandmark()); 
			if(null!=student.getAddress().getGuardianAddressCityVillage())
			jsonObjAddress.put("guardianAddressCityVillage", student.getAddress().getGuardianAddressCityVillage());
			if(null!=student.getAddress().getGuardianAddressPinCode())
			jsonObjAddress.put("guardianAddressPinCode", student.getAddress().getGuardianAddressPinCode());
			if(null!=student.getAddress().getGuardianAddressDistrict())
			jsonObjAddress.put("guardianAddressDistrict", student.getAddress().getGuardianAddressDistrict());
			if(null!=student.getAddress().getGuardianAddressState())
			jsonObjAddress.put("guardianAddressState", student.getAddress().getGuardianAddressState());
			if(null!=student.getAddress().getGuardianAddressCountry())
			jsonObjAddress.put("guardianAddressCountry", student.getAddress().getGuardianAddressCountry());
			if(null!=student.getAddress().getGuardianAddressPostOffice())
			jsonObjAddress.put("guardianAddressPostOffice", student.getAddress().getGuardianAddressPostOffice());
			if(null!=student.getAddress().getGuardianAddressPoliceStation())
			jsonObjAddress.put("guardianAddressPoliceStation", student.getAddress().getGuardianAddressPoliceStation());
		}
		addressDetails.put(jsonObjAddress);
		jsonObj.put("address", addressDetails);
		
		if(null!=student.getResource().getFoodPreference())
		jsonObj.put("foodPreference", student.getResource().getFoodPreference());
		if(null!=student.getResource().getFirstPickUpPlace())
		jsonObj.put("firstPickUpPlace", student.getResource().getFirstPickUpPlace());
		if(null!=student.getResource().getHobbies())
		jsonObj.put("hobbies", student.getResource().getHobbies());
		if(null!=student.getResource().getPersonalIdentificationMark())
		jsonObj.put("personalIdentificationMark", student.getResource().getPersonalIdentificationMark());
		
		if(null!=student.getPreviousSchoolName())
		jsonObj.put("previousSchoolName", student.getPreviousSchoolName());
		if(null!=student.getPreviousSchoolWebsite())
		jsonObj.put("previousSchoolWebsite", student.getPreviousSchoolWebsite());
		if(null!=student.getPreviousSchoolAddress())
		jsonObj.put("previousSchoolAddress", student.getPreviousSchoolAddress());
		if(null!=student.getPreviousSchoolPhone())
		jsonObj.put("previousSchoolPhone", student.getPreviousSchoolPhone());
		if(null!=student.getPreviousSchoolEmail())
		jsonObj.put("previousSchoolEmail", student.getPreviousSchoolEmail());
		if(null!=student.getPreviousAchivement())
		jsonObj.put("previousAchivement", student.getPreviousAchivement());
		
		return jsonObj;
		
	}
	
	private String encodeImage(byte[] imageByteArray) {
        return Base64.encodeBase64String(imageByteArray);
    }
	
	private String createUser(JSONObject jsonReq) {
		
		System.out.println(jsonReq);
		String jsonRes = "fail";
		
		try{
			
			/*String hostname = "apps.sainikschoolpurulia.com";
			String port = "10389";
			
			final JSONObject obj = new JSONObject(jsonReq);
			
			String firstName = obj.getString("firstName");
			String lastName = obj.getString("lastName");
			String userName = obj.getString("userName");
			String password = obj.getString("password");
			String baseDN = obj.getString("organization");
			String serviceUserName = obj.getString("serviceUserName");
			String servicePassword = obj.getString("servicePassword");
		
			// Create a container set of attributes
	        Attributes container = new BasicAttributes();
	        
	        // Create the objectclass to add
	        Attribute objClasses = new BasicAttribute("objectClass");
	        objClasses.add("top");
	        objClasses.add("person");
	        objClasses.add("organizationalPerson");
	        objClasses.add("inetOrgPerson");
	        
	        // Assign the username, first name, and last name
	        String cnValue = new StringBuffer(firstName).append(" ").append(lastName).toString();
	        Attribute cn = new BasicAttribute("cn", cnValue);
	        Attribute givenName = new BasicAttribute("givenName", firstName);
	        Attribute sn = new BasicAttribute("sn", lastName);
	        Attribute uid = new BasicAttribute("uid", userName);
	        
	        // Add password
	        Attribute userPassword = new BasicAttribute("userPassword", password);
	        
	        // Add these to the container
	        container.put(objClasses);
	        container.put(uid);
	        container.put(cn);
	        container.put(sn);
	        container.put(givenName);
	        container.put(userPassword);
	        
	        String url = "ldap://" + hostname + ":" + port;
			Hashtable env = new Hashtable();
			env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
			env.put(Context.PROVIDER_URL, url);
			env.put(Context.SECURITY_AUTHENTICATION, "simple");
			env.put(Context.SECURITY_PRINCIPAL, "uid=admin,ou=system");
			env.put(Context.SECURITY_CREDENTIALS, "secret");
			
			DirContext context = new InitialDirContext(env);

	        // Create the entry
	        context.createSubcontext(getUserDN(userName, baseDN), container);
			 
	        jsonRes = "success";*/
			
			final String ldapURI = "http://apps.sainikschoolpurulia.com/api/ldap/rest/createUser";
			System.out.println("URI:::"+ldapURI);
			System.out.println("JSON for LDAP:"+jsonReq.toString());
			URL ldapURL = new URL(ldapURI);
			HttpURLConnection ldapConnection = null;
			OutputStreamWriter ldapOut = null;
			String ldap_json_response = "";
			InputStreamReader ldapIn = null;
			BufferedReader ldapBr = null;
			
			ldapConnection = (HttpURLConnection)ldapURL.openConnection();
			ldapConnection.setDoOutput(true);
			ldapConnection.setRequestProperty("Content-Type", "application/json");
			ldapConnection.setConnectTimeout(5000);
			ldapConnection.setReadTimeout(5000);
			ldapConnection.setRequestMethod("POST");
			ldapOut = new OutputStreamWriter(ldapConnection.getOutputStream());
			ldapOut.write(jsonReq.toString());
			ldapOut.close();
						
			ldapIn = new InputStreamReader(ldapConnection.getInputStream());
			ldapBr = new BufferedReader(ldapIn);
			String text = "";
			while((text = ldapBr.readLine())!= null){
					ldap_json_response += text;
			}
			System.out.println("JSON RESPONSE: "+ldap_json_response);
			
			JSONObject ldapResponseObject = new JSONObject(ldap_json_response);
			String message = (String)ldapResponseObject.get("message");
			System.out.println("Message from JSON response:"+message);
			if(message.equalsIgnoreCase("success")){
				jsonRes = "success";
				System.out.println("The LDAP User Creation was successful");
			}else{
				System.out.println("The LDAP User Creation was a failure");
			}			 
		}catch(Exception e){
			e.printStackTrace();
		}
		return jsonRes;
	}
	
	private String getUserDN(String username, String baseDN) {
        return new StringBuffer()
                .append("uid=")
                .append(username)
                .append(",")
                .append("ou=users,o=" + baseDN)
                .toString();
    }
}
