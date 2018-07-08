package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.Course;
import com.qts.icam.model.Exam;

public class Term {

	
	private String termObjectId;
	private String termCode;
	private String termDesc;
	private String updatedBy;
	private String termName;
	private String termStartDate;
	private String termEndDate;
	private int noOfWorkingDays;
	private String academicYear;
	private List<Holiday> holiday;	
	private int termDetailsId;	
	private Course course;
	private String classObj;
	private List<Exam> examList;
	private String dateOfCreation;

	private String holiDayOne;
	private String holiDayTwo;
	private int count;
	
	
	
	
	
	public String getHoliDayOne() {
		return holiDayOne;
	}
	public void setHoliDayOne(String holiDayOne) {
		this.holiDayOne = holiDayOne;
	}
	public String getHoliDayTwo() {
		return holiDayTwo;
	}
	public void setHoliDayTwo(String holiDayTwo) {
		this.holiDayTwo = holiDayTwo;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getTermObjectId() {
		return termObjectId;
	}
	public void setTermObjectId(String termObjectId) {
		this.termObjectId = termObjectId;
	}
	public String getTermCode() {
		return termCode;
	}
	public void setTermCode(String termCode) {
		this.termCode = termCode;
	}
	public String getTermDesc() {
		return termDesc;
	}
	public void setTermDesc(String termDesc) {
		this.termDesc = termDesc;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getTermName() {
		return termName;
	}
	public void setTermName(String termName) {
		this.termName = termName;
	}
	public String getTermStartDate() {
		return termStartDate;
	}
	public void setTermStartDate(String termStartDate) {
		this.termStartDate = termStartDate;
	}
	public String getTermEndDate() {
		return termEndDate;
	}
	public void setTermEndDate(String termEndDate) {
		this.termEndDate = termEndDate;
	}
	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}
	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}
	public String getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}
	public List<Holiday> getHoliday() {
		return holiday;
	}
	public void setHoliday(List<Holiday> holiday) {
		this.holiday = holiday;
	}
	public int getTermDetailsId() {
		return termDetailsId;
	}
	public void setTermDetailsId(int termDetailsId) {
		this.termDetailsId = termDetailsId;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String getClassObj() {
		return classObj;
	}
	public void setClassObj(String classObj) {
		this.classObj = classObj;
	}
	public List<Exam> getExamList() {
		return examList;
	}
	public void setExamList(List<Exam> examList) {
		this.examList = examList;
	}
	public String getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(String dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	
	
}
