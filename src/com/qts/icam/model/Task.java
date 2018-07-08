package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.Designation;
import com.qts.icam.model.DesignationLevel;
import com.qts.icam.model.Leave;



public class Task {

	private String taskObjectId;
	private String taskCode;
	private String taskName;
	private String taskDesc;
	private String updatedBy;
	private String status;
	private List<TaskDetails> taskDetails;	
	private int taskId;
	private String objectId;
	private String activationTime;
	private String expirationTime;
	private String processStatus;
	private String taskApprover;
	private String createdById;
	private String startDate;
	private String endDate;
	private String userId;
	private TaskDetails taskDetailsObj;
	private Standard standard;
	private Section section;
	private String shift;
	private List<Leave> leaveList;
	private UploadFile uploadFile;
	private boolean skipable;
	private String taskType;
	private String taskOwnerName;
	private Leave leave;
	private List<Attachment> attachmentList;
	private int numberofDayRequestedFor;
	private int remainingLeave;
	
	/********Added BY Naimisha 05042017******/
	
	private String taskComment;
	
	
	/*Added By NAimisha Ghosh 11042018*/
	
	private Department department;
	private Designation designation;
	private DesignationLevel designationLevel;
	
	
	//**********Naimisha 19042018**********//
	
	
	private String roleName;
	private String roleCode;
	private String moduleName;
	private String moduleCode;
	
	//Added by naimisha 21052018
	
	private String action;
	
	
	public int getRemainingLeave() {
		return remainingLeave;
	}
	public void setRemainingLeave(int remainingLeave) {
		this.remainingLeave = remainingLeave;
	}
	public UploadFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(UploadFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	public Standard getStandard() {
		return standard;
	}
	public void setStandard(Standard standard) {
		this.standard = standard;
	}
	public List<Leave> getLeaveList() {
		return leaveList;
	}
	public void setLeaveList(List<Leave> leaveList) {
		this.leaveList = leaveList;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public TaskDetails getTaskDetailsObj() {
		return taskDetailsObj;
	}
	public void setTaskDetailsObj(TaskDetails taskDetailsObj) {
		this.taskDetailsObj = taskDetailsObj;
	}
	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getActivationTime() {
		return activationTime;
	}
	public void setActivationTime(String activationTime) {
		this.activationTime = activationTime;
	}
	public String getExpirationTime() {
		return expirationTime;
	}
	public void setExpirationTime(String expirationTime) {
		this.expirationTime = expirationTime;
	}
	public String getProcessStatus() {
		return processStatus;
	}
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}
	public String getTaskApprover() {
		return taskApprover;
	}
	public void setTaskApprover(String taskApprover) {
		this.taskApprover = taskApprover;
	}
	public String getCreatedById() {
		return createdById;
	}
	public void setCreatedById(String createdById) {
		this.createdById = createdById;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public boolean isSkipable() {
		return skipable;
	}
	public void setSkipable(boolean skipable) {
		this.skipable = skipable;
	}
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public String getTaskOwnerName() {
		return taskOwnerName;
	}
	public void setTaskOwnerName(String taskOwnerName) {
		this.taskOwnerName = taskOwnerName;
	}
	public Leave getLeave() {
		return leave;
	}
	public void setLeave(Leave leave) {
		this.leave = leave;
	}
	public List<Attachment> getAttachmentList() {
		return attachmentList;
	}
	public void setAttachmentList(List<Attachment> attachmentList) {
		this.attachmentList = attachmentList;
	}
	public String getTaskObjectId() {
		return taskObjectId;
	}
	public void setTaskObjectId(String taskObjectId) {
		this.taskObjectId = taskObjectId;
	}
	public String getTaskCode() {
		return taskCode;
	}
	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskDesc() {
		return taskDesc;
	}
	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
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
	public List<TaskDetails> getTaskDetails() {
		return taskDetails;
	}
	public void setTaskDetails(List<TaskDetails> taskDetails) {
		this.taskDetails = taskDetails;
	}
	public int getNumberofDayRequestedFor() {
		return numberofDayRequestedFor;
	}
	public void setNumberofDayRequestedFor(int numberofDayRequestedFor) {
		this.numberofDayRequestedFor = numberofDayRequestedFor;
	}
	public String getTaskComment() {
		return taskComment;
	}
	public void setTaskComment(String taskComment) {
		this.taskComment = taskComment;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	public DesignationLevel getDesignationLevel() {
		return designationLevel;
	}
	public void setDesignationLevel(DesignationLevel designationLevel) {
		this.designationLevel = designationLevel;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getModuleCode() {
		return moduleCode;
	}
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	
	
}
