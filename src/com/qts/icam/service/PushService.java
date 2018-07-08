package com.qts.icam.service;

import java.util.List;

import com.qts.icam.dao.PushDao;
import com.qts.icam.model.AcademicYear;
import com.qts.icam.model.Student;
import com.qts.icam.model.WebIQTransaction;
import com.qts.icam.model.Standard;


public class PushService {
	
	private PushDao pushDao = new PushDao();
	
	public List<Student> getStudentList() throws Exception {
		return pushDao.getStudentList();
	}

	public AcademicYear getCurrentAcademicYear() {
		return pushDao.getCurrentAcademicYear();
	}
	
	public Student getStudentDetails(String rollNumber) throws Exception {
		return pushDao.getStudentDetails(rollNumber);
	}
	
	public String getStandardNameforCourse(String courseId){
		return pushDao.getStandardNameforCourse(courseId);
	}
	
	public String addWebIQTransaction(WebIQTransaction webIQTran){
		return pushDao.addWebIQTransaction(webIQTran);
	}
	
	public List<Standard> getStandardsWithSection(){
		return pushDao.getStandardsWithSection();
	}
	
	public List<Student> getStudentsToAssignSection(Student student){
		return pushDao.getStudentsToAssignSection(student);
	}
}
