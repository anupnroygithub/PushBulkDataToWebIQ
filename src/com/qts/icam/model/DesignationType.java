package com.qts.icam.model;

import java.util.List;

public class DesignationType {
	private int designationTypeId;
	private String designationTypeObjectId;
	private String designationTypeCode;
	private String designationTypeDesc;	
	private String designationTypeName;
	private String updatedBy;
	private String status;
	private List<Designation> designationList;
	
	public int getDesignationTypeId() {
		return designationTypeId;
	}
	public void setDesignationTypeId(int designationTypeId) {
		this.designationTypeId = designationTypeId;
	}
	public String getDesignationTypeObjectId() {
		return designationTypeObjectId;
	}
	public void setDesignationTypeObjectId(String designationTypeObjectId) {
		this.designationTypeObjectId = designationTypeObjectId;
	}
	public String getDesignationTypeCode() {
		return designationTypeCode;
	}
	public void setDesignationTypeCode(String designationTypeCode) {
		this.designationTypeCode = designationTypeCode;
	}
	public String getDesignationTypeDesc() {
		return designationTypeDesc;
	}
	public void setDesignationTypeDesc(String designationTypeDesc) {
		this.designationTypeDesc = designationTypeDesc;
	}
	public String getDesignationTypeName() {
		return designationTypeName;
	}
	public void setDesignationTypeName(String designationTypeName) {
		this.designationTypeName = designationTypeName;
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
	public List<Designation> getDesignationList() {
		return designationList;
	}
	public void setDesignationList(List<Designation> designationList) {
		this.designationList = designationList;
	}
	
	
}
