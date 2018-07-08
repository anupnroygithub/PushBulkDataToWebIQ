package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.Exam;
import com.qts.icam.model.Resource;

public class Subject {
	private int subjectId;
	private String objectId;
	private String subjectCode;
	private String desc;
	private String updatedBy;
	private String subjectName;
	private String status;
	private String subjectGroup;
	private String subjectDesc;
	private Resource resource;
	private String subjectObjectId;
	/************Added By Sourav 02032017**********/
	private int credit;
	
	/**New CBSE system start**/
	
	private List<Exam> examList;
	
	/**New CBSE system end**/
	
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
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
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSubjectGroup() {
		return subjectGroup;
	}
	public void setSubjectGroup(String subjectGroup) {
		this.subjectGroup = subjectGroup;
	}
	public String getSubjectDesc() {
		return subjectDesc;
	}
	public void setSubjectDesc(String subjectDesc) {
		this.subjectDesc = subjectDesc;
	}
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	public String getSubjectObjectId() {
		return subjectObjectId;
	}
	public void setSubjectObjectId(String subjectObjectId) {
		this.subjectObjectId = subjectObjectId;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public List<Exam> getExamList() {
		return examList;
	}
	public void setExamList(List<Exam> examList) {
		this.examList = examList;
	}
}
