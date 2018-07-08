package com.qts.icam.model;

public class Leave {

	private String startDate;
	private String endDate;
	private String userId;
	private String updatedBy;
	private String appliedOn;
	private int leaveId;
	private String desc;
	private String title;
	private String leaveType;
	private String leaveCode;
	private String remarks;
	private String status;
	private String decision;
	private int totalRequestedLeave;
	private int totalAvailLeave;	
	private int remainingLeave;
	private int usedLeave;
	private int canApplyOnStretch;
	private String fileName;
	private String allFilesPath;
	private boolean encashable;
	private int excessLeave;
	private String objId;
	private String year;
	
	
	

	public String getObjId() {
		return objId;
	}

	public void setObjId(String objId) {
		this.objId = objId;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getExcessLeave() {
		return excessLeave;
	}

	public void setExcessLeave(int excessLeave) {
		this.excessLeave = excessLeave;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}
	
	public int getRemainingLeave() {
		return remainingLeave;
	}

	public void setRemainingLeave(int remainingLeave) {
		this.remainingLeave = remainingLeave;
	}

	public int getTotalRequestedLeave() {
		return totalRequestedLeave;
	}

	public void setTotalRequestedLeave(int totalRequestedLeave) {
		this.totalRequestedLeave = totalRequestedLeave;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}	

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getAllFilesPath() {
		return allFilesPath;
	}	

	public void setAllFilesPath(String allFilesPath) {
		this.allFilesPath = allFilesPath;
	}

	public int getTotalAvailLeave() {
		return totalAvailLeave;
	}

	public void setTotalAvailLeave(int totalAvailLeave) {
		this.totalAvailLeave = totalAvailLeave;
	}

	public int getCanApplyOnStretch() {
		return canApplyOnStretch;
	}

	public void setCanApplyOnStretch(int canApplyOnStretch) {
		this.canApplyOnStretch = canApplyOnStretch;
	}
	public boolean isEncashable() {
		return encashable;
	}

	public void setEncashable(boolean encashable) {
		this.encashable = encashable;
	}

	public String getLeaveCode() {
		return leaveCode;
	}

	public void setLeaveCode(String leaveCode) {
		this.leaveCode = leaveCode;
	}

	public String getAppliedOn() {
		return appliedOn;
	}

	public void setAppliedOn(String appliedOn) {
		this.appliedOn = appliedOn;
	}

	public int getUsedLeave() {
		return usedLeave;
	}

	public void setUsedLeave(int usedLeave) {
		this.usedLeave = usedLeave;
	}
	
	
	
	
	
	
}
