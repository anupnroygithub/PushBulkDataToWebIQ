package com.qts.icam.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.qts.icam.model.Student;
import com.qts.icam.model.StudentHistoryData;
import com.qts.icam.model.StudentResult;
import com.qts.icam.model.WebIQTransaction;
import com.qts.icam.model.Standard;
import com.qts.icam.model.Address;
import com.qts.icam.model.Exam;
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
	
	public List<StudentResult> getStudentResult(StudentResult studentResult){
		
		List<StudentResult> studentResultList = null;
		SqlSession session = null;
		
		try {
			session = sqlSessionFactory.openSession();
			/*System.out.println(studentResult.getAcademicYear()+"\n"+
			studentResult.getStandard()+"\n"+
			studentResult.getSection()+"\n"+
			studentResult.getSubject()+"\n"+
			studentResult.getExam());*/
			studentResultList = session.selectList("selectStudentsSubjectsAndMarks", studentResult);
			System.out.println("no of students:"+studentResultList.size());
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return studentResultList;
	}


	public String getExamNameForCode(Exam exam) {
		SqlSession session = sqlSessionFactory.openSession();
		String examName = null;
		try {
			if(exam.getStandardCode().equals("VI") || exam.getStandardCode().equals("VIII") || exam.getStandardCode().equals("VIII"))
				examName = session.selectOne("getExamNameWithTermConcatination", exam);
			else
				examName = session.selectOne("getExamNameWithoutTermConcatination", exam);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return examName;
	}


	public String updateContactDataOfStudent(List<Student> studentList) {
		SqlSession session = sqlSessionFactory.openSession();
		String status = "fail";
		try {
			int updateStatus = session.update("updateContactDataOfStudent",studentList);
			session.commit();
			if(updateStatus!=0)status = "success";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return status;
	}


	public List<StudentHistoryData> getHistoricalMarks(StudentHistoryData studentHistory) {
		SqlSession session = sqlSessionFactory.openSession();
		List<StudentHistoryData> historyMarksList = new ArrayList<StudentHistoryData>();
		try {
			System.out.println("year:"+studentHistory.getAcademicYear());
			List<Integer> serialIdList = session.selectList("getAllSerialId", studentHistory);
			System.out.println("in the year:"+studentHistory.getAcademicYear()+", in standard:"+studentHistory.getStandard()+", serial id size:"+serialIdList.size());
			for(Integer id : serialIdList) {
				StudentHistoryData history = new StudentHistoryData();
				history = session.selectOne("getHistoricalMarks", id);
				historyMarksList.add(history);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return historyMarksList;
	}


	public List<String> getStandardListInHistory(String year) {
		List<String> standardList = null;
		SqlSession session = sqlSessionFactory.openSession();
		try {
			standardList = session.selectList("getStandardListInHistory", year);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return standardList;
	}


	public List<String> getAcadmicYearListInHistory() {
		List<String> yearList = null;
		SqlSession session = sqlSessionFactory.openSession();
		try {
			yearList = session.selectList("getAcadmicYearListInHistory");
			System.out.println(yearList.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return yearList;
	}
}
