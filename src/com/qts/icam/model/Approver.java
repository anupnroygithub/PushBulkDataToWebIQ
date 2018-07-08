package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.Resource;

public class Approver {

	private String objectId;
	private int serialNumber;
	private String updatedBy;
	private String approverGroupName;
	private String approverGroupCode;
	private String approverGroupDesc;
	private List <Resource> resourceList;
	private String resourceTypeCode;
	private String status;
	private String createdOn;
	private boolean serialApproval;
	private boolean parallelApproval;
	/*Added by ranita.sur on 17102017 for editing the recipient group*/
	private List<String>stringList;
	
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getApproverGroupName() {
		return approverGroupName;
	}
	public void setApproverGroupName(String approverGroupName) {
		this.approverGroupName = approverGroupName;
	}
	public String getApproverGroupCode() {
		return approverGroupCode;
	}
	public void setApproverGroupCode(String approverGroupCode) {
		this.approverGroupCode = approverGroupCode;
	}
	public String getApproverGroupDesc() {
		return approverGroupDesc;
	}
	public void setApproverGroupDesc(String approverGroupDesc) {
		this.approverGroupDesc = approverGroupDesc;
	}
	public List<Resource> getResourceList() {
		return resourceList;
	}
	public void setResourceList(List<Resource> resourceList) {
		this.resourceList = resourceList;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
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
	public String getResourceTypeCode() {
		return resourceTypeCode;
	}
	public void setResourceTypeCode(String resourceTypeCode) {
		this.resourceTypeCode = resourceTypeCode;
	}
	public List<String> getStringList() {
		return stringList;
	}
	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}
	
	
}
