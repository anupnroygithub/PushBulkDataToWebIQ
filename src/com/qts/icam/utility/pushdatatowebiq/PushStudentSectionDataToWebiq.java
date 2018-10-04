package com.qts.icam.utility.pushdatatowebiq;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.qts.icam.model.AcademicYear;
import com.qts.icam.model.Section;
import com.qts.icam.model.Student;
import com.qts.icam.model.WebIQTransaction;
import com.qts.icam.model.Standard;
import com.qts.icam.service.PushService;

public class PushStudentSectionDataToWebiq {
	
	private static String uri = "http://demoapi.sayakonline.com/v1/updateStandardSectionForCadet";
	private static String portalUserName = "adminwebservice@qtsin.net";
	private static String portalPassWord = "!Q2w3e4r";
	
	private static PushService pushService = new PushService();

	public static void main(String[] args){
		
		PushStudentSectionDataToWebiq pushStudentSectionDataToWebiq = new PushStudentSectionDataToWebiq();
		Student student = null;
		
		try {
			
			List<Standard> standardList = pushService.getStandardsWithSection();
			
			for(Standard standard : standardList){
				
				String standardName = standard.getStandardName();
				List<Section> sectionList = standard.getSectionList();
				
				for(Section section : sectionList){
					student = new Student();
					student.setStandard(standardName);
					student.setSection(section.getSectionName());
					
					List<Student> studentList = pushService.getStudentsToAssignSection(student);
					
					JSONObject jsonObj = pushStudentSectionDataToWebiq.createCadetSectionDetailsJson(standardName, section.getSectionName(), studentList);
					System.out.println("Cadet Details JSON : " +  jsonObj.toString());
					
					String status = pushStudentSectionDataToWebiq.sendJsonData(jsonObj);
					
					System.out.println("Cadet Section push to Webiq " + status + "  for Cadet having Roll Number : " +  student.getRollNumber());
				}
			}
			
		}catch (Exception e) {
			
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
	
	private JSONObject createCadetSectionDetailsJson(String standardName, String sectionName, List<Student> studentList) throws Exception{
		
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("username",portalUserName);
		jsonObj.put("password",portalPassWord);
		jsonObj.put("standard",standardName);
		jsonObj.put("section",sectionName);
		JSONArray rollNumberArray = new JSONArray();
		for(Student student: studentList){
			// creating a JSON Array and adding the roll numbers in it 
			rollNumberArray.put(student.getRollNumber());
		}
		jsonObj.put("rollNumbers", rollNumberArray);
		return jsonObj;
	}
}
