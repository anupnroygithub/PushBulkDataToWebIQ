package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.Course;
import com.qts.icam.model.ExamType;
import com.qts.icam.model.Standard;
import com.qts.icam.model.Venue;

public class Exam {
	private int serialId;
	private String objectId;
	private String updatedBy;
	private String examCode;
	private String examName;
	private String desc;
	private String examStartDate;
	private String examEndDate;
	private String term;
	private String status;
	private Double weightageObtained;
	private Double weightage;
	private String grade;
	private String gradePoint;
	private int changeDay;
	private String examTypeName;
	private String courseCode;
	private String termCode;
	private String standardCode;
	
	private Standard standard;
	private List<Course>courseList;
	
	private Course course;
	private List<ExamType>examTypeList;
	
	//Added By Naimisha 20092017
	
	private String startTime;
	private String endTime;
	private List<Venue>venueList;
	private String algorithm;

	public int getSerialId() {
		return serialId;
	}
	public void setSerialId(int serialId) {
		this.serialId = serialId;
	}
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getExamCode() {
		return examCode;
	}
	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getExamStartDate() {
		return examStartDate;
	}
	public void setExamStartDate(String examStartDate) {
		this.examStartDate = examStartDate;
	}
	public String getExamEndDate() {
		return examEndDate;
	}
	public void setExamEndDate(String examEndDate) {
		this.examEndDate = examEndDate;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getWeightageObtained() {
		return weightageObtained;
	}
	public void setWeightageObtained(Double weightageObtained) {
		this.weightageObtained = weightageObtained;
	}
	public Double getWeightage() {
		return weightage;
	}
	public void setWeightage(Double weightage) {
		this.weightage = weightage;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGradePoint() {
		return gradePoint;
	}
	public void setGradePoint(String gradePoint) {
		this.gradePoint = gradePoint;
	}
	public int getChangeDay() {
		return changeDay;
	}
	public void setChangeDay(int changeDay) {
		this.changeDay = changeDay;
	}
	public String getExamTypeName() {
		return examTypeName;
	}
	public void setExamTypeName(String examTypeName) {
		this.examTypeName = examTypeName;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getTermCode() {
		return termCode;
	}
	public void setTermCode(String termCode) {
		this.termCode = termCode;
	}
	public String getStandardCode() {
		return standardCode;
	}
	public void setStandardCode(String standardCode) {
		this.standardCode = standardCode;
	}
	public Standard getStandard() {
		return standard;
	}
	public void setStandard(Standard standard) {
		this.standard = standard;
	}
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public List<ExamType> getExamTypeList() {
		return examTypeList;
	}
	public void setExamTypeList(List<ExamType> examTypeList) {
		this.examTypeList = examTypeList;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public List<Venue> getVenueList() {
		return venueList;
	}
	public void setVenueList(List<Venue> venueList) {
		this.venueList = venueList;
	}
	public String getAlgorithm() {
		return algorithm;
	}
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}
	
	
}
