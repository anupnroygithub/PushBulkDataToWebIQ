package com.qts.icam.model;

import java.util.List;

public class Module {

	private String objectId;
	private String updatedBy;
	private String moduleCode;
	private String moduleName;
	private String moduleDescription;
	private List<Role> roleList;
	private List<Functionality> functionalityList;
	private String status;
	private boolean tabCheck;
	private boolean searchCheck;
	
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
	public String getModuleCode() {
		return moduleCode;
	}
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getModuleDescription() {
		return moduleDescription;
	}
	public void setModuleDescription(String moduleDescription) {
		this.moduleDescription = moduleDescription;
	}
	public List<Role> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
	public List<Functionality> getFunctionalityList() {
		return functionalityList;
	}
	public void setFunctionalityList(List<Functionality> functionalityList) {
		this.functionalityList = functionalityList;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isTabCheck() {
		return tabCheck;
	}
	public void setTabCheck(boolean tabCheck) {
		this.tabCheck = tabCheck;
	}
	public boolean isSearchCheck() {
		return searchCheck;
	}
	public void setSearchCheck(boolean searchCheck) {
		this.searchCheck = searchCheck;
	}
	
	
	
	
	
}
