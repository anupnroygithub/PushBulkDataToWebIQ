package com.qts.icam.model;

import com.qts.icam.model.AcademicYear;

public class ExamType {
	
	private String examTypeObjectId;
	private String examTypeCode;
	private String examTypeDesc;
	private String updatedBy;
	private String examTypeName;
	//private Result examResult;
	private AcademicYear academicYear;
	
	//-------------setter&getter-----------

	public String getExamTypeObjectId() {
		return examTypeObjectId;
	}
	public void setExamTypeObjectId(String examTypeObjectId) {
		this.examTypeObjectId = examTypeObjectId;
	}
	public String getExamTypeCode() {
		return examTypeCode;
	}
	public void setExamTypeCode(String examTypeCode) {
		this.examTypeCode = examTypeCode;
	}
	public String getExamTypeDesc() {
		return examTypeDesc;
	}
	public void setExamTypeDesc(String examTypeDesc) {
		this.examTypeDesc = examTypeDesc;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getExamTypeName() {
		return examTypeName;
	}
	public void setExamTypeName(String examTypeName) {
		this.examTypeName = examTypeName;
	}
	/*public Result getExamResult() {
		return examResult;
	}
	public void setExamResult(Result examResult) {
		this.examResult = examResult;
	}*/
	public AcademicYear getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(AcademicYear academicYear) {
		this.academicYear = academicYear;
	}

}
