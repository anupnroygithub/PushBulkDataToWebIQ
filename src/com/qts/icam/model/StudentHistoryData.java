package com.qts.icam.model;

import java.util.List;

public class StudentHistoryData {
	private String academicYear;
	private String standard;
	private String section;
	private String subject;
	private String examCode;
	private String examName;
	List<StudentResult> studentResultList;
	private int id;
	
	/**
	 * @return the academicYear
	 */
	public String getAcademicYear() {
		return academicYear;
	}
	/**
	 * @param academicYear the academicYear to set
	 */
	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}
	/**
	 * @return the standard
	 */
	public String getStandard() {
		return standard;
	}
	/**
	 * @param standard the standard to set
	 */
	public void setStandard(String standard) {
		this.standard = standard;
	}
	/**
	 * @return the section
	 */
	public String getSection() {
		return section;
	}
	/**
	 * @param section the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the examCode
	 */
	public String getExamCode() {
		return examCode;
	}
	/**
	 * @param examCode the examCode to set
	 */
	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}
	/**
	 * @return the examName
	 */
	public String getExamName() {
		return examName;
	}
	/**
	 * @param examName the examName to set
	 */
	public void setExamName(String examName) {
		this.examName = examName;
	}
	/**
	 * @return the studentResultList
	 */
	public List<StudentResult> getStudentResultList() {
		return studentResultList;
	}
	/**
	 * @param studentResultList the studentResultList to set
	 */
	public void setStudentResultList(List<StudentResult> studentResultList) {
		this.studentResultList = studentResultList;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	
}
