package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.Approver;
import com.qts.icam.model.Department;
import com.qts.icam.model.Task;

public class JobType {
	private String jobTypeObjectId;
	private String jobTypeCode;
	private String jobTypeDesc;
	private String updatedBy;
	private String jobTypeName;
	private String status;
	private int jobTypeId;
	private String approverGroupName;
	
	//Added By Naimisha 22082017
	
	private boolean serialApproval;
	private boolean parallelApproval;
	
	//Added by naimisha 16102017
	
	private String approvalRequired;
	private String approvalProcess;
	private String category;
	private List<String>stringList;
	private List<Task>taskList;
	private List<Approver>approverGroupList;
	
	//Added By Naimisha 09/10/2018
	
	private String department;
	private List<Department>departmentList;
	
	
	//Added By Naimisha 10042018
	
	private boolean isFinance ;
	private boolean isLinked;
	private String  functionality;
	private String note;
	private String taskAssignee;
	private String designationLevel;
	private String designation;
	
	
	//Added by naimisha 21052018
	
	private String action;
	
	
	
	public String getJobTypeObjectId() {
		return jobTypeObjectId;
	}
	public void setJobTypeObjectId(String jobTypeObjectId) {
		this.jobTypeObjectId = jobTypeObjectId;
	}
	public String getJobTypeCode() {
		return jobTypeCode;
	}
	public void setJobTypeCode(String jobTypeCode) {
		this.jobTypeCode = jobTypeCode;
	}
	public String getJobTypeDesc() {
		return jobTypeDesc;
	}
	public void setJobTypeDesc(String jobTypeDesc) {
		this.jobTypeDesc = jobTypeDesc;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getJobTypeName() {
		return jobTypeName;
	}
	public void setJobTypeName(String jobTypeName) {
		this.jobTypeName = jobTypeName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getJobTypeId() {
		return jobTypeId;
	}
	public void setJobTypeId(int jobTypeId) {
		this.jobTypeId = jobTypeId;
	}
	public String getApproverGroupName() {
		return approverGroupName;
	}
	public void setApproverGroupName(String approverGroupName) {
		this.approverGroupName = approverGroupName;
	}
	public boolean isSerialApproval() {
		return serialApproval;
	}
	public void setSerialApproval(boolean serialApproval) {
		this.serialApproval = serialApproval;
	}
	public boolean isParallelApproval() {
		return parallelApproval;
	}
	public void setParallelApproval(boolean parallelApproval) {
		this.parallelApproval = parallelApproval;
	}
	public String getApprovalRequired() {
		return approvalRequired;
	}
	public void setApprovalRequired(String approvalRequired) {
		this.approvalRequired = approvalRequired;
	}
	public String getApprovalProcess() {
		return approvalProcess;
	}
	public void setApprovalProcess(String approvalProcess) {
		this.approvalProcess = approvalProcess;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<String> getStringList() {
		return stringList;
	}
	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}
	public List<Task> getTaskList() {
		return taskList;
	}
	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}
	public List<Approver> getApproverGroupList() {
		return approverGroupList;
	}
	public void setApproverGroupList(List<Approver> approverGroupList) {
		this.approverGroupList = approverGroupList;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public List<Department> getDepartmentList() {
		return departmentList;
	}
	public void setDepartmentList(List<Department> departmentList) {
		this.departmentList = departmentList;
	}
	public boolean isFinance() {
		return isFinance;
	}
	public void setFinance(boolean isFinance) {
		this.isFinance = isFinance;
	}
	public boolean isLinked() {
		return isLinked;
	}
	public void setLinked(boolean isLinked) {
		this.isLinked = isLinked;
	}
	public String getFunctionality() {
		return functionality;
	}
	public void setFunctionality(String functionality) {
		this.functionality = functionality;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getTaskAssignee() {
		return taskAssignee;
	}
	public void setTaskAssignee(String taskAssignee) {
		this.taskAssignee = taskAssignee;
	}
	public String getDesignationLevel() {
		return designationLevel;
	}
	public void setDesignationLevel(String designationLevel) {
		this.designationLevel = designationLevel;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	
}
