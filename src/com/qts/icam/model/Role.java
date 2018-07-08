package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.CalendarEvent;
import com.qts.icam.model.Resource;

public class Role {
	
	private String objectId;
	private String updatedBy;
	private String roleName;
	private String roleCode;
	private String roleDescription;
	private String moduleName;
	private String moduleCode;
	private String accessTypeName;
	private List <Functionality> functionalityList;
	private List <Resource> resourceList;
	private String roleTypeName;
	private String status;
	private String supervisor;
	private List <String> supervisorList;
	private List<CalendarEvent> calendarEventList;
	private List<CalendarEvent> calendarEventCountList;
	private int numberOfLogin;
	private List<Module> moduleList;
	
	
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
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public List<Functionality> getFunctionalityList() {
		return functionalityList;
	}
	public void setFunctionalityList(List<Functionality> functionalityList) {
		this.functionalityList = functionalityList;
	}	
	public List<Resource> getResourceList() {
		return resourceList;
	}
	public void setResourceList(List<Resource> resourceList) {
		this.resourceList = resourceList;
	}
	public String getAccessTypeName() {
		return accessTypeName;
	}
	public void setAccessTypeName(String accessTypeName) {
		this.accessTypeName = accessTypeName;
	}
	public String getRoleTypeName() {
		return roleTypeName;
	}
	public void setRoleTypeName(String roleTypeName) {
		this.roleTypeName = roleTypeName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}
	public List<String> getSupervisorList() {
		return supervisorList;
	}
	public void setSupervisorList(List<String> supervisorList) {
		this.supervisorList = supervisorList;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public List<CalendarEvent> getCalendarEventList() {
		return calendarEventList;
	}
	public void setCalendarEventList(List<CalendarEvent> calendarEventList) {
		this.calendarEventList = calendarEventList;
	}
	public List<CalendarEvent> getCalendarEventCountList() {
		return calendarEventCountList;
	}
	public void setCalendarEventCountList(List<CalendarEvent> calendarEventCountList) {
		this.calendarEventCountList = calendarEventCountList;
	}
	public int getNumberOfLogin() {
		return numberOfLogin;
	}
	public void setNumberOfLogin(int numberOfLogin) {
		this.numberOfLogin = numberOfLogin;
	}
	public String getModuleCode() {
		return moduleCode;
	}
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}
	public List<Module> getModuleList() {
		return moduleList;
	}
	public void setModuleList(List<Module> moduleList) {
		this.moduleList = moduleList;
	}
	
	
}
