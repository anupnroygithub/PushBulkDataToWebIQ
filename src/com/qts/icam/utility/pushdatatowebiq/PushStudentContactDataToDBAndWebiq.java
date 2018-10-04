package com.qts.icam.utility.pushdatatowebiq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONArray;
import org.json.JSONObject;

import com.qts.icam.model.Resource;
import com.qts.icam.model.Student;
import com.qts.icam.model.AcademicYear;
import com.qts.icam.service.PushService;

public class PushStudentContactDataToDBAndWebiq {

	private static String uri = "http://apps.sainikschoolpuruliacom/api/webiq/v1/updateBasicDetailsOfCadet";
	private static String portalUserName = "adminwebservice@qtsin.net";
	private static String portalPassWord = "!Q2w3e4r";
	
	public static final String FILE_NAME = "D:\\Work\\SSP\\School Data\\contact and DOB.xlsx";
			
	
	private static List<Student> studentList = new ArrayList<Student>();
	
	private static PushService pushService = new PushService();
	
	public static void main(String[] args){
			
		//PushStudentContactDataToDBAndWebiq pushStudentContactDataToDBAndWebiq = new PushStudentContactDataToDBAndWebiq();
		
		try {
			FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
	        Workbook workbook = new XSSFWorkbook(excelFile);
	        /*int noOfSheets = workbook.getNumberOfSheets();
	        System.out.println(noOfSheets);
	        for(int i=0; i<noOfSheets; i++) {
	        	System.out.println("sheet no:"+i);
	        }*/
	        Sheet datatypeSheet = workbook.getSheetAt(0);
	        Iterator<Row> cellIterator = datatypeSheet.iterator();
	        
	        while (cellIterator.hasNext()) {
	
	        	Student student = new Student();
	            Row currentRow = cellIterator.next();
	            currentRow.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
	            student.setRoll(String.valueOf((currentRow.getCell(0).getStringCellValue())));
	            currentRow.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
	            student.setMobileNo(String.valueOf((currentRow.getCell(1).getStringCellValue())));
	            if(student.getMobileNo().length()!=10 || null==student.getMobileNo()) {
	            	student.setMobileNo("0000000000");
	            }
	            Resource resource = new Resource();
	            //currentRow.getCell(2).setCellType(Cell.CELL_TYPE_STRING);
	            if(null == ((currentRow.getCell(2).getDateCellValue()))) {
	            	resource.setDateOfBirth("01-01-2000");
	            }else {
	            	resource.setDateOfBirth(String.valueOf((currentRow.getCell(2).getDateCellValue())));
		            String dateStr = resource.getDateOfBirth();
	            	DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
	            	Date date = (Date)formatter.parse(dateStr);
	            	//System.out.println(date);        

	            	Calendar cal = Calendar.getInstance();
	            	cal.setTime(date);
	            	String formatedDate = cal.get(Calendar.DATE) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.YEAR);
	            	//System.out.println("formatedDate : " + formatedDate);
	            	resource.setDateOfBirth(formatedDate);
	            }
	            student.setResource(resource);
	            System.out.println("Roll:"+student.getRoll());
	            System.out.println("Mobile:"+student.getMobileNo());
	            System.out.println("DOB:"+student.getResource().getDateOfBirth());
	            
	            studentList.add(student);
	        }
	        
	        System.out.println("studentList size : " + studentList.size());
	        /*for(Student student : studentList){
	        	System.out.println(student.getRoll() + "  ^^^^^^^^^^^^^^^^^^^^^^^^^^  " + student.getMobileNo());
	        }*/
	        String status = pushService.updateContactDataOfStudent(studentList);
	        System.out.println("status in icam update:"+status);
	        /*if(status.equalsIgnoreCase("success")) {
	        	AcademicYear academicYear = pushService.getCurrentAcademicYear();
	        	JSONObject jsonObj = new JSONObject();
	        	jsonObj.put("username",portalUserName);
				jsonObj.put("password",portalPassWord);
				jsonObj.put("academicsSession", academicYear.getAcademicYearName());
				JSONArray jsonArr = new JSONArray();
	        	for(Student student : studentList) {
	        		JSONObject json = new JSONObject();
	        		json.put("rollNumber", student.getRoll());
	        		json.put("contactNumber", student.getMobileNo());
	        		json.put("dateOfBirth",student.getResource().getDateOfBirth());
	        		jsonArr.put(json);
	        	}
	        	jsonObj.put("students", jsonArr);
				System.out.println("Request JSON:"+jsonObj.toString());
				final String URI = uri;
				System.out.println("URI:::"+URI);
				 Initialization 
				URL url = new URL(URI);
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
					*//** Could be connection Issue **//*
					e.printStackTrace();
				}
				System.out.println("JSON response:::"+ json_response);	        		        	
	        }*/
		}catch(Exception e){
			e.printStackTrace();	
		}
	}
}
