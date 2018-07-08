package com.qts.icam.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.qts.icam.model.Student;
import com.qts.icam.model.WebIQTransaction;
import com.qts.icam.model.Standard;
import com.qts.icam.model.Address;
import com.qts.icam.conn.MyBatisConnectionFactory;
import com.qts.icam.model.AcademicYear;

import com.qts.icam.util.EncryptDecrypt;


public class PushDao {
	
	private SqlSessionFactory sqlSessionFactory = null;
	 
    public PushDao(){
        this.sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
    }
    

	public List<Student> getStudentList() {
		
		List<Student> studentList = null;
		SqlSession session = null;
		
		try{
			session =sqlSessionFactory.openSession();
			
			studentList = session.selectList("selectAllStudents");
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return studentList;
	}
	
	public AcademicYear getCurrentAcademicYear() {
		
		AcademicYear academicYear = null;
		SqlSession session = null;
		
		try {
			session =sqlSessionFactory.openSession();
			
			academicYear = session.selectOne("selectCurrentAcademicYear");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return academicYear;
	}
	
	public Student getStudentDetails(String rollNumber)  {
		
		Student student = null;
		Address address = null;
		SqlSession session = null;
		
		try{
			session =sqlSessionFactory.openSession();
			
			student = session.selectOne("selectStudentDetails",rollNumber);
			if(null != student){
				address = session.selectOne("selectStudentAddress", rollNumber);
				student.setAddress(address);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return student;
	}
	
	public String getStandardNameforCourse(String courseId){
		
		String standardName = null;
		SqlSession session = null;
		
		try{
			session =sqlSessionFactory.openSession();
			
			standardName = session.selectOne("getStandardNameforCourse",courseId);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return standardName;
	}
	
	public String addWebIQTransaction(WebIQTransaction webIQTran){
		
		String insertStatus = "Success";
		SqlSession session = null;
		EncryptDecrypt encryptDecrypt = new EncryptDecrypt();
		
		try{
			session = sqlSessionFactory.openSession();
			
			webIQTran.setObjectId(encryptDecrypt.getBase64EncodedID("BackOfficeDAOImpl"));
			int status = session.insert("addWebIQTransaction",webIQTran);
			session.commit();
			if(status == 0){
				insertStatus = "Failure";
			}
		}catch (Exception e) {
			e.printStackTrace();
			insertStatus = "Failure";
		}
		
		return insertStatus;
		
	}
	
	public List<Standard> getStandardsWithSection(){
		
		List<Standard> standardsWithSectionList = null;
		SqlSession session = null;
		
		try{
			session = sqlSessionFactory.openSession();
			
			standardsWithSectionList = session.selectList("selectStandardsWithSection");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return standardsWithSectionList;
	}
	
	public List<Student> getStudentsToAssignSection(Student student){
		
		List<Student> studentList = null;
		SqlSession session = null;
		
		try {
			session = sqlSessionFactory.openSession();
			
			studentList = session.selectList("selectStudentsToAssignSection", student);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return studentList;
	}
}
