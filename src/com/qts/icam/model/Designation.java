package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.ResourceType;



public class Designation {

	private String designationObjectId;
	private String updatedBy;
	private int designationId;
	private String designationCode;		
	private String designationName;
	private String designationDesc;
	private int designationOrder;	
	private String status;	
	private ResourceType resourceType;	

	private DesignationType designationType;
	private List<DesignationType> designationTypeList;
	private DesignationLevel level;
	private List<DesignationLevel> levelList;
	private SalaryTemplate salaryTemplate;
	private List<SalaryTemplate> salaryTemplateList;
	
	
	private DesignationLevel designationLevel;
	private List<DesignationLevel> designationLevelList;
	
	/*Added by naimisha 16082017*/
	
	private List<DesignationLevel> oldDesignationLevelList;
	private List<DesignationLevel> newDesignationLevelList;
	
	public String getDesignationObjectId() {
		return designationObjectId;
	}
	public void setDesignationObjectId(String designationObjectId) {
		this.designationObjectId = designationObjectId;
	}
	public String getDesignationCode() {
		return designationCode;
	}
	public void setDesignationCode(String designationCode) {
		this.designationCode = designationCode;
	}
	public String getDesignationDesc() {
		return designationDesc;
	}
	public void setDesignationDesc(String designationDesc) {
		this.designationDesc = designationDesc;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getDesignationName() {
		return designationName;
	}
	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}
	public int getDesignationOrder() {
		return designationOrder;
	}
	public void setDesignationOrder(int designationOrder) {
		this.designationOrder = designationOrder;
	}
	public int getDesignationId() {
		return designationId;
	}
	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}	
	public ResourceType getResourceType() {
		return resourceType;
	}
	public void setResourceType(ResourceType resourceType) {
		this.resourceType = resourceType;
	}
	public DesignationLevel getDesignationLevel() {
		return designationLevel;
	}
	public void setDesignationLevel(DesignationLevel designationLevel) {
		this.designationLevel = designationLevel;
	}
	public List<DesignationLevel> getDesignationLevelList() {
		return designationLevelList;
	}
	public void setDesignationLevelList(List<DesignationLevel> designationLevelList) {
		this.designationLevelList = designationLevelList;
	}
	public DesignationType getDesignationType() {
		return designationType;
	}
	public void setDesignationType(DesignationType designationType) {
		this.designationType = designationType;
	}
	public List<DesignationType> getDesignationTypeList() {
		return designationTypeList;
	}
	public void setDesignationTypeList(List<DesignationType> designationTypeList) {
		this.designationTypeList = designationTypeList;
	}
	public DesignationLevel getLevel() {
		return level;
	}
	public void setLevel(DesignationLevel level) {
		this.level = level;
	}
	public List<DesignationLevel> getLevelList() {
		return levelList;
	}
	public void setLevelList(List<DesignationLevel> levelList) {
		this.levelList = levelList;
	}
	public SalaryTemplate getSalaryTemplate() {
		return salaryTemplate;
	}
	public void setSalaryTemplate(SalaryTemplate salaryTemplate) {
		this.salaryTemplate = salaryTemplate;
	}
	public List<SalaryTemplate> getSalaryTemplateList() {
		return salaryTemplateList;
	}
	public void setSalaryTemplateList(List<SalaryTemplate> salaryTemplateList) {
		this.salaryTemplateList = salaryTemplateList;
	}
	public List<DesignationLevel> getOldDesignationLevelList() {
		return oldDesignationLevelList;
	}
	public void setOldDesignationLevelList(List<DesignationLevel> oldDesignationLevelList) {
		this.oldDesignationLevelList = oldDesignationLevelList;
	}
	public List<DesignationLevel> getNewDesignationLevelList() {
		return newDesignationLevelList;
	}
	public void setNewDesignationLevelList(List<DesignationLevel> newDesignationLevelList) {
		this.newDesignationLevelList = newDesignationLevelList;
	}
	
	
	
	
	
}
