package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.LoggingAspect;


public class Functionality {
 
	private String objectId;
	private String updatedBy;
	private String moduleName;
	private String roleName;
	private String functionalityName;
	private String functionalityDesc;
	private String functionalityCode;
	private boolean view;
	private boolean insert;
	private boolean update;
	private String status;
	private List<LoggingAspect> loggingAspectList;
	
	public String getFunctionalityName() {
		return functionalityName;
	}
	public void setFunctionalityName(String functionalityName) {
		this.functionalityName = functionalityName;
	}
	public String getFunctionalityDesc() {
		return functionalityDesc;
	}
	public void setFunctionalityDesc(String functionalityDesc) {
		this.functionalityDesc = functionalityDesc;
	}
	public boolean isView() {
		return view;
	}
	public void setView(boolean view) {
		this.view = view;
	}	
	public boolean isUpdate() {
		return update;
	}
	public void setUpdate(boolean update) {
		this.update = update;
	}
	public boolean isInsert() {
		return insert;
	}
	public void setInsert(boolean insert) {
		this.insert = insert;
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
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFunctionalityCode() {
		return functionalityCode;
	}
	public void setFunctionalityCode(String functionalityCode) {
		this.functionalityCode = functionalityCode;
	}
	public List<LoggingAspect> getLoggingAspectList() {
		return loggingAspectList;
	}
	public void setLoggingAspectList(List<LoggingAspect> loggingAspectList) {
		this.loggingAspectList = loggingAspectList;
	}
	
	
}
