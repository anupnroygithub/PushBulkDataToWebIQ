package com.qts.icam.model;

import java.util.List;

public class AccessType {

	private String objectId;
	private String updatedBy;
	private String accessTypeName;
	private String accessTypeCode;
	private String accessTypeDesc;
	private List <Role> roleList;
	private String moduleName;
	
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
	public String getAccessTypeName() {
		return accessTypeName;
	}
	public void setAccessTypeName(String accessTypeName) {
		this.accessTypeName = accessTypeName;
	}
	public String getAccessTypeDesc() {
		return accessTypeDesc;
	}
	public void setAccessTypeDesc(String accessTypeDesc) {
		this.accessTypeDesc = accessTypeDesc;
	}
	public List<Role> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getAccessTypeCode() {
		return accessTypeCode;
	}
	public void setAccessTypeCode(String accessTypeCode) {
		this.accessTypeCode = accessTypeCode;
	}
	
	
}
