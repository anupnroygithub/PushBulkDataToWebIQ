package com.qts.icam.model;

import java.util.List;


public class AcademicYear {
	private String academicYearObjectId;
	private String academicYearCode;
	private String academicYearDesc;
	private String academicYearName;
	private String updatedBy;
	private String sessionStartDate;
	private String sessionEndDate;
	private String yearStatus;
	private List<Standard> classList;
	private  String expectedSessionEndDate; 
	
	public String getAcademicYearObjectId() {
		return academicYearObjectId;
	}
	public void setAcademicYearObjectId(String academicYearObjectId) {
		this.academicYearObjectId = academicYearObjectId;
	}
	public String getAcademicYearCode() {
		return academicYearCode;
	}
	public void setAcademicYearCode(String academicYearCode) {
		this.academicYearCode = academicYearCode;
	}
	public String getAcademicYearDesc() {
		return academicYearDesc;
	}
	public void setAcademicYearDesc(String academicYearDesc) {
		this.academicYearDesc = academicYearDesc;
	}
	public String getAcademicYearName() {
		return academicYearName;
	}
	public void setAcademicYearName(String academicYearName) {
		this.academicYearName = academicYearName;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getSessionStartDate() {
		return sessionStartDate;
	}
	public void setSessionStartDate(String sessionStartDate) {
		this.sessionStartDate = sessionStartDate;
	}
	public String getSessionEndDate() {
		return sessionEndDate;
	}
	public void setSessionEndDate(String sessionEndDate) {
		this.sessionEndDate = sessionEndDate;
	}
	public String getYearStatus() {
		return yearStatus;
	}
	public void setYearStatus(String yearStatus) {
		this.yearStatus = yearStatus;
	}
	public List<Standard> getClassList() {
		return classList;
	}
	public void setClassList(List<Standard> classList) {
		this.classList = classList;
	}
	public String getExpectedSessionEndDate() {
		return expectedSessionEndDate;
	}
	public void setExpectedSessionEndDate(String expectedSessionEndDate) {
		this.expectedSessionEndDate = expectedSessionEndDate;
	}
}
