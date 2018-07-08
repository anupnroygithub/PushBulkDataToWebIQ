package com.qts.icam.model;



public class Department {
	
	private String objectId;
	private String updatedBy;
	private String departmentCode;
	private String departmentName;
	private String departmentDescription;
	private String status;
	private boolean predefined;
	private String parentDepartment;
	private String departmentHead;
	private String departmentResource;
	
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
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentDescription() {
		return departmentDescription;
	}
	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isPredefined() {
		return predefined;
	}
	public void setPredefined(boolean predefined) {
		this.predefined = predefined;
	}
	public String getParentDepartment() {
		return parentDepartment;
	}
	public void setParentDepartment(String parentDepartment) {
		this.parentDepartment = parentDepartment;
	}
	public String getDepartmentHead() {
		return departmentHead;
	}
	public void setDepartmentHead(String departmentHead) {
		this.departmentHead = departmentHead;
	}
	public String getDepartmentResource() {
		return departmentResource;
	}
	public void setDepartmentResource(String departmentResource) {
		this.departmentResource = departmentResource;
	}
	

}
