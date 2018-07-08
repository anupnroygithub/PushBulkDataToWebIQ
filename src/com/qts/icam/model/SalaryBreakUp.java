package com.qts.icam.model;

import java.util.List;


public class SalaryBreakUp {
	
	
	private String salaryBreakUpObjectId;
	private String salaryBreakUpCode;
	private String salaryBreakUpDesc;
	private String updatedBy;
	private String salaryBreakUpName;
	private String salaryBreakUpType;
	private String status;
	private List<String> salaryBreakUpTypelist;
	private double amount; 	 
	private double percentageBased;
	private int disbursementDate;

	private SalaryTemplate salaryTemplate;
	private boolean slab;
	
	public int getDisbursementDate() {
		return disbursementDate;
	}
	public void setDisbursementDate(int disbursementDate) {
		this.disbursementDate = disbursementDate;
	}
	public String getSalaryBreakUpObjectId() {
		return salaryBreakUpObjectId;
	}
	public void setSalaryBreakUpObjectId(String salaryBreakUpObjectId) {
		this.salaryBreakUpObjectId = salaryBreakUpObjectId;
	}
	public String getSalaryBreakUpCode() {
		return salaryBreakUpCode;
	}
	public void setSalaryBreakUpCode(String salaryBreakUpCode) {
		this.salaryBreakUpCode = salaryBreakUpCode;
	}
	public String getSalaryBreakUpDesc() {
		return salaryBreakUpDesc;
	}
	public void setSalaryBreakUpDesc(String salaryBreakUpDesc) {
		this.salaryBreakUpDesc = salaryBreakUpDesc;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getSalaryBreakUpName() {
		return salaryBreakUpName;
	}
	public void setSalaryBreakUpName(String salaryBreakUpName) {
		this.salaryBreakUpName = salaryBreakUpName;
	}
	public String getSalaryBreakUpType() {
		return salaryBreakUpType;
	}
	public void setSalaryBreakUpType(String salaryBreakUpType) {
		this.salaryBreakUpType = salaryBreakUpType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<String> getSalaryBreakUpTypelist() {
		return salaryBreakUpTypelist;
	}
	public void setSalaryBreakUpTypelist(List<String> salaryBreakUpTypelist) {
		this.salaryBreakUpTypelist = salaryBreakUpTypelist;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getPercentageBased() {
		return percentageBased;
	}
	public void setPercentageBased(double percentageBased) {
		this.percentageBased = percentageBased;
	}
	public SalaryTemplate getSalaryTemplate() {
		return salaryTemplate;
	}
	public void setSalaryTemplate(SalaryTemplate salaryTemplate) {
		this.salaryTemplate = salaryTemplate;
	}
	public boolean isSlab() {
		return slab;
	}
	public void setSlab(boolean slab) {
		this.slab = slab;
	}
	
	
}
