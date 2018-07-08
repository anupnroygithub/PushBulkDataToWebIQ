package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.Subject;

public class Standard {
	private int standardId;
	private String objectId;
	private String standardCode;
	private String desc;
	private String updatedBy;
	private String standardName;
	private String section;
	private Section sectionName;
	private String status;
	private List<Student> studentList;
	private List<Section> sectionList;
	private List<Subject> subjectList;
	private List<SocialCategory> socialCategoriesList;
//--------------FOR ADMISSION-----------------------	
	private String className;
//------------------------FOR BACKOFFICE----------------------	


	private List<ExamType> examTypeList;
	
	/*Added By ranita.sur on 03082017 for getting the strength of Student*/
	private int strength;
	
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getStandardCode() {
		return standardCode;
	}
	public void setStandardCode(String standardCode) {
		this.standardCode = standardCode;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getStandardName() {
		return standardName;
	}
	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Section getSectionName() {
		return sectionName;
	}
	public void setSectionName(Section sectionName) {
		this.sectionName = sectionName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getStandardId() {
		return standardId;
	}
	public void setStandardId(int standardId) {
		this.standardId = standardId;
	}
	public List<Section> getSectionList() {
		return sectionList;
	}
	public void setSectionList(List<Section> sectionList) {
		this.sectionList = sectionList;
	}
	public List<Subject> getSubjectList() {
		return subjectList;
	}
	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	public List<SocialCategory> getSocialCategoriesList() {
		return socialCategoriesList;
	}
	public void setSocialCategoriesList(List<SocialCategory> socialCategoriesList) {
		this.socialCategoriesList = socialCategoriesList;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public List<ExamType> getExamTypeList() {
		return examTypeList;
	}
	public void setExamTypeList(List<ExamType> examTypeList) {
		this.examTypeList = examTypeList;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
}
