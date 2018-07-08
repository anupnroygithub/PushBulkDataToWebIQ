package com.qts.icam.model;

import java.util.List;


public class SalaryTemplate {
	private int salaryTemplateId;
	private String salaryTemplateObjectId;
	private String salaryTemplateCode;
	private String salaryTemplateName;
	private String salaryTemplateDesc;
	private String updatedBy;
	private String status;
	private List<SalaryTemplateDetails> salaryTemplateDetailsList;
	private String designation;
	private String designationLevel;
	
	public int getSalaryTemplateId() {
		return salaryTemplateId;
	}
	public void setSalaryTemplateId(int salaryTemplateId) {
		this.salaryTemplateId = salaryTemplateId;
	}
	public String getSalaryTemplateObjectId() {
		return salaryTemplateObjectId;
	}
	public void setSalaryTemplateObjectId(String salaryTemplateObjectId) {
		this.salaryTemplateObjectId = salaryTemplateObjectId;
	}
	public String getSalaryTemplateCode() {
		return salaryTemplateCode;
	}
	public void setSalaryTemplateCode(String salaryTemplateCode) {
		this.salaryTemplateCode = salaryTemplateCode;
	}
	public String getSalaryTemplateName() {
		return salaryTemplateName;
	}
	public void setSalaryTemplateName(String salaryTemplateName) {
		this.salaryTemplateName = salaryTemplateName;
	}
	public String getSalaryTemplateDesc() {
		return salaryTemplateDesc;
	}
	public void setSalaryTemplateDesc(String salaryTemplateDesc) {
		this.salaryTemplateDesc = salaryTemplateDesc;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<SalaryTemplateDetails> getSalaryTemplateDetailsList() {
		return salaryTemplateDetailsList;
	}
	public void setSalaryTemplateDetailsList(
			List<SalaryTemplateDetails> salaryTemplateDetailsList) {
		this.salaryTemplateDetailsList = salaryTemplateDetailsList;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDesignationLevel() {
		return designationLevel;
	}
	public void setDesignationLevel(String designationLevel) {
		this.designationLevel = designationLevel;
	}	
}
