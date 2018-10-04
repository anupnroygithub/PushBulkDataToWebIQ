package com.qts.icam.utility.pushdatatowebiq;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.json.JSONArray;
import org.json.JSONObject;

import com.qts.icam.model.StudentHistoryData;
import com.qts.icam.model.StudentResult;
import com.qts.icam.service.PushService;

public class PushHistoryStudentMarksData {

	private static String uri = "http://apps.sainikschoolpurulia.com/api/webiq/v1/sendExamMarksOfCadet";
	private static String portalUserName = "adminwebservice@qtsin.net";
	private static String portalPassWord = "!Q2w3e4r";
	private static PushService pushService = new PushService();
	
	public static void main(String[] args) {
		PushHistoryStudentMarksData pushHistoryStudentMarksData = new PushHistoryStudentMarksData();
		try {
			String examName = null;
			String status = null;
			List<String> yearList = pushService.getAcadmicYearListInHistory();
			for(String year: yearList) {
				List<String> standardList = pushService.getStandardListInHistory(year);
				for(String st: standardList) {
					StudentHistoryData studentHistory = new StudentHistoryData();
					studentHistory.setStandard(st);
					studentHistory.setAcademicYear(year);
					List<StudentHistoryData> historyMarksList = pushService.getHistoricalMarks(studentHistory);
					for (StudentHistoryData hist : historyMarksList) {
						if(hist.getExamCode().equalsIgnoreCase("Centralise")) {examName = "Centralise";}
						if(hist.getExamCode().equalsIgnoreCase("FA1")) {examName = "Formulative Assesment One";}
						if(hist.getExamCode().equalsIgnoreCase("FA2")) {examName = "Formulative Assesment Two";}
						if(hist.getExamCode().equalsIgnoreCase("FA3")) {examName = "Formulative Assesment Three";}
						if(hist.getExamCode().equalsIgnoreCase("FA4")) {examName = "Formulative Assesment Four";}
						if(hist.getExamCode().equalsIgnoreCase("M1")) {examName = "Monthly One";}
						if(hist.getExamCode().equalsIgnoreCase("M2")) {examName = "Monthly Two";}
						if(hist.getExamCode().equalsIgnoreCase("PC")) {examName = "Pre Centralise";}
						if(hist.getExamCode().equalsIgnoreCase("SA1")) {examName = "Summative Assesment One";}
						if(hist.getExamCode().equalsIgnoreCase("SA2")) {examName = "Summative Assesment Two";}
						if(hist.getExamCode().equalsIgnoreCase("Term_1")) {examName = "Term One";}
						JSONObject jsonObj = new JSONObject();
						
						jsonObj.put("username", portalUserName);
						jsonObj.put("password", portalPassWord);
						jsonObj.put("standard",hist.getStandard());
						jsonObj.put("section",hist.getSection());
						jsonObj.put("subject",hist.getSubject());
						jsonObj.put("exam",examName);
						jsonObj.put("academicYear",hist.getAcademicYear());
						
						JSONArray studentsArr = new JSONArray();
						for (StudentResult studentResult : hist.getStudentResultList()) {
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
						System.out.println("Request JSON:"+jsonObj.toString());
						status = pushHistoryStudentMarksData.sendJsonData(jsonObj);
						System.out.println(status);
					}
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	private String sendJsonData(JSONObject jsonObj) throws Exception{
		String status = "fail";
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
			e.printStackTrace();
		}
		if((!json_response.isEmpty())){
			JSONObject object = new JSONObject(json_response);
			String intStatus = object.get("status").toString();
			int statusFromJsonResponse = Integer.parseInt(intStatus);
			if(statusFromJsonResponse == 200)status = "success";
		}
		return status;
	}

}
