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
	
	private static String uri = "http://demoapi.sayakonline.com/v1/sendBasicDetailsOfCadet";
	private static String portalUserName = "adminwebservice@qtsin.net";
	private static String portalPassWord = "!Q2w3e4r";
	
	private static PushService pushService = new PushService();
	
	public static void main(String[] args){
		
		PushStudentDataToWebiq pushStudentDataToWebiq = new PushStudentDataToWebiq();
		
		try {
			
			AcademicYear academicYear = pushService.getCurrentAcademicYear();
			
			studentList = pushService.getStudentList();
			Student stu = new Student();
			//stu.setRoll("5092");
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
						String jsonReq = pushStudentDataToWebiq.createLdapJson(student);
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
	
	private String createLdapJson(Student student) throws Exception{
		
		String jsonReq = "{\"firstName\":" + "\"" + student.getResource().getFirstName() + "\"," + "\"lastName\":" +  "\"" + student.getResource().getLastName() + "\"," + "\"userName\":" +  "\"" + student.getRoll() + "\"," + "\"password\": \"welcome\", \"organization\": \"ss-purulia\", \"serviceUserName\": \"test\", \"servicePassword\": \"test\"}";
				
		
		return jsonReq;
		
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
		
		//jsonObj.put("category", student.getResource().getCategory());
		jsonObj.put("category", "GENERAL");
		
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
		jsonObjAddress.put("presentAddressLine", student.getAddress().getPresentAddressLine()); 
		jsonObjAddress.put("presentAddressLandmark", student.getAddress().getPermanentAddressLandmark()); 
		jsonObjAddress.put("presentAddressCityVillage", student.getAddress().getPresentAddressCityVillage());
		jsonObjAddress.put("presentAddressPinCode", student.getAddress().getPresentAddressPinCode());
		jsonObjAddress.put("presentAddressDistrict", student.getAddress().getPresentAddressDistrict());
		jsonObjAddress.put("presentAddressState", student.getAddress().getPresentAddressState());
		jsonObjAddress.put("presentAddressCountry", student.getAddress().getPermanentAddressCountry());
		jsonObjAddress.put("presentAddressPostOffice", student.getAddress().getPermanentAddressPostOffice());
		jsonObjAddress.put("presentAddressPoliceStation", student.getAddress().getPermanentAddressPoliceStation());
		
		jsonObjAddress.put("permanentAddressLine", student.getAddress().getPermanentAddressLine()); 
		jsonObjAddress.put("permanentAddressLandmark", student.getAddress().getPermanentAddressLandmark()); 
		jsonObjAddress.put("permanentAddressCityVillage", student.getAddress().getPermanentAddressCityVillage());
		jsonObjAddress.put("permanentAddressPinCode", student.getAddress().getPermanentAddressPinCode());
		jsonObjAddress.put("permanentAddressDistrict", student.getAddress().getPermanentAddressDistrict());
		jsonObjAddress.put("permanentAddressState", student.getAddress().getPermanentAddressState());
		jsonObjAddress.put("permanentAddressCountry", student.getAddress().getPermanentAddressCountry());
		jsonObjAddress.put("permanentAddressPostOffice", student.getAddress().getPermanentAddressPostOffice());
		jsonObjAddress.put("permanentAddressPoliceStation", student.getAddress().getPermanentAddressPoliceStation());
		
		jsonObjAddress.put("guardianAddressLine", student.getAddress().getGuardianAddressLine()); 
		jsonObjAddress.put("guardianAddressLandmark", student.getAddress().getGuardianAddressLandmark()); 
		jsonObjAddress.put("guardianAddressCityVillage", student.getAddress().getGuardianAddressCityVillage());
		jsonObjAddress.put("guardianAddressPinCode", student.getAddress().getGuardianAddressPinCode());
		jsonObjAddress.put("guardianAddressDistrict", student.getAddress().getGuardianAddressDistrict());
		jsonObjAddress.put("guardianAddressState", student.getAddress().getGuardianAddressState());
		jsonObjAddress.put("guardianAddressCountry", student.getAddress().getGuardianAddressCountry());
		jsonObjAddress.put("guardianAddressPostOffice", student.getAddress().getGuardianAddressPostOffice());
		jsonObjAddress.put("guardianAddressPoliceStation", student.getAddress().getGuardianAddressPoliceStation());
		
		addressDetails.put(jsonObjAddress);
		jsonObj.put("address", addressDetails);
		
		jsonObj.put("foodPreference", student.getResource().getFoodPreference());
		jsonObj.put("firstPickUpPlace", student.getResource().getFirstPickUpPlace());
		jsonObj.put("hobbies", student.getResource().getHobbies());
		jsonObj.put("personalIdentificationMark", student.getResource().getPersonalIdentificationMark());
		
		jsonObj.put("previousSchoolName", student.getPreviousSchoolName());
		jsonObj.put("previousSchoolWebsite", student.getPreviousSchoolWebsite());
		jsonObj.put("previousSchoolAddress", student.getPreviousSchoolAddress());
		jsonObj.put("previousSchoolPhone", student.getPreviousSchoolPhone());
		jsonObj.put("previousSchoolEmail", student.getPreviousSchoolEmail());
		jsonObj.put("previousAchivement", student.getPreviousAchivement());
		
		return jsonObj;
		
	}
	
	private String encodeImage(byte[] imageByteArray) {
        return Base64.encodeBase64String(imageByteArray);
    }
	
	private String createUser(String jsonReq) {
		
		System.out.println(jsonReq);
		String jsonRes = null;
		
		try{
			
			String hostname = "";
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
			 
	        jsonRes = "success";
			 
			}catch(Exception e){
				jsonRes = "failed";
				e.printStackTrace();
			}
		System.out.println(jsonRes);
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
