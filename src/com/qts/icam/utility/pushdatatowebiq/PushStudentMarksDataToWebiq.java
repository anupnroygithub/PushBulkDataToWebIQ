package com.qts.icam.utility.pushdatatowebiq;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.qts.icam.model.AcademicYear;
import com.qts.icam.model.Exam;
import com.qts.icam.model.Student;
import com.qts.icam.model.StudentResult;
import com.qts.icam.model.Subject;
import com.qts.icam.model.WebIQTransaction;
import com.qts.icam.service.PushService;

public class PushStudentMarksDataToWebiq {

	private static String uri = "http://apps.sainikschoolpurulia.com/api/webiq/v1/sendExamMarksOfCadet";
	private static String portalUserName = "adminwebservice@qtsin.net";
	private static String portalPassWord = "!Q2w3e4r";
	
	private static List<Student> studentList = new ArrayList<Student>();
	
	private static PushService pushService = new PushService();
	
	private static String standard = "XI";
	private static String section = "B";
	private static String examCode = "M1";
	private static String examName = null;
	private static String subject = "COMPUTER SCIENCE";
	//"ENGLISH","HINDI HIGHER","BENGALI HIGHER","HINDI LOWER","BENGALI LOWER","MATHEMATICS","SCIENCE","SOCIAL SCIENCE"
	//"ENGLISH","MATHEMATICS","SCIENCE","HINDI","BENGALI","SOCIAL SCIENCE"
	//"ENGLISH","MATHEMATICS","PHYSICS","CHEMISTRY","BIOLOGY","COMPUTER SCIENCE"
	public static void main(String[] args){
		
		PushStudentMarksDataToWebiq pushStudentMarksDataToWebiq = new PushStudentMarksDataToWebiq();
		
		try {
			
			AcademicYear academicYear = pushService.getCurrentAcademicYear();
			
			StudentResult studentResult = new StudentResult();
			studentResult.setAcademicYear(academicYear.getAcademicYearCode());
			studentResult.setStandard(standard);
			studentResult.setSection(section);
			studentResult.setExam(examCode);
			studentResult.setSubject(subject);
			
			Exam exam = new Exam();
			exam.setStandardCode(standard);
			exam.setExamCode(examCode);
			examName = pushService.getExamNameForCode(exam);
			
			List<StudentResult> studentResultList = pushService.getStudentResult(studentResult);
			studentResult = null;
			
			JSONObject jsonObj = pushStudentMarksDataToWebiq.createCadetMarksJson(studentResultList, academicYear.getAcademicYearCode());
			System.out.println("Cadet Marks Details JSON : " +  jsonObj.toString());
			
			String status = pushStudentMarksDataToWebiq.sendJsonData(jsonObj);
			System.out.println("Cadet Marks Data pushed to Webiq " + status );
				
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
			/*webIQTran = new WebIQTransaction();
			webIQTran.setUpdatedBy("superadmin");
			webIQTran.setUri(uri);
			webIQTran.setRequestJSON(jsonObj.toString());
			webIQTran.setResponseJSON(json_response);
			webIQTran.setStatus(false);

			pushService.addWebIQTransaction(webIQTran);
			
			status = "Failed";*/
		}
		System.out.println("JSON response:::"+ json_response);
		//String json_response = "{\"status\" : \"200\"}";
		if((!json_response.isEmpty())){
			
			JSONObject object = new JSONObject(json_response);
			String intStatus = object.get("status").toString();
			int statusFromJsonResponse = Integer.parseInt(intStatus);
			
			if(statusFromJsonResponse==200){
				
				//If call to the API is successful, then insert into the webiq_transaction_details table 
				/*webIQTran = new WebIQTransaction();
				webIQTran.setUri(uri);
				webIQTran.setUpdatedBy("superadmin");
				webIQTran.setRequestJSON(jsonObj.toString());
				webIQTran.setResponseJSON(json_response);
				webIQTran.setStatus(true);
				
				status = "Successful";*/
				
			}else{
				
				//If Failure then also insert into the webiq_transaction_details table
				/*webIQTran = new WebIQTransaction();
				webIQTran.setUpdatedBy("superadmin");
				webIQTran.setUri(uri);
				webIQTran.setRequestJSON(jsonObj.toString());
				webIQTran.setResponseJSON(json_response);
				webIQTran.setStatus(false);
				
				status = "Failed";*/
			}
			
			/*try{
				pushService.addWebIQTransaction(webIQTran);
			}catch(Exception e){
				e.printStackTrace();
			}*/
			
			
		}
		return status;
	}
	
	private JSONObject createCadetMarksJson( List<StudentResult> studentResultList, String academicYear) throws Exception{
		
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("username", portalUserName);
		jsonObj.put("password", portalPassWord);
		jsonObj.put("standard",standard);
		jsonObj.put("section",section);
		jsonObj.put("subject",subject);
		jsonObj.put("exam",examName);
		jsonObj.put("academicYear",academicYear);
		
		JSONArray studentsArr = new JSONArray();
		for (StudentResult studentResult : studentResultList) {
	         JSONObject studentJSON = new JSONObject();
	         studentJSON.put("rollNumber", studentResult.getRollNumber());
	         studentJSON.put("name", studentResult.getName());
	         studentJSON.put("theoryTotal", studentResult.getTheory());
	         studentJSON.put("practicalTotal", studentResult.getPractical());
	         studentJSON.put("theoryObtained", studentResult.getTheoryObtainedChar());
	         studentJSON.put("practicalObtained", studentResult.getPracticalObtainedChar());
	         studentJSON.put("status", studentResult.getPassFail());
	         studentsArr.put(studentJSON);
	    }
		
		jsonObj.put("students", studentsArr);
		
		return jsonObj;
		
	}
}
