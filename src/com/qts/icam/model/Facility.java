package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.SocialCategory;

public class Facility {
	private String facilityObjectId;
	private String facilityCode;
	private String facilityName;
	private String facilityDesc;
	private String updatedBy;
	private boolean ispaid;
	private List<SocialCategory> socialCategoryList;
	private SocialCategory socialCategory;
	
	
	public String getFacilityObjectId() {
		return facilityObjectId;
	}
	public void setFacilityObjectId(String facilityObjectId) {
		this.facilityObjectId = facilityObjectId;
	}
	public String getFacilityCode() {
		return facilityCode;
	}
	public void setFacilityCode(String facilityCode) {
		this.facilityCode = facilityCode;
	}
	public String getFacilityName() {
		return facilityName;
	}
	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}
	public String getFacilityDesc() {
		return facilityDesc;
	}
	public void setFacilityDesc(String facilityDesc) {
		this.facilityDesc = facilityDesc;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public boolean isIspaid() {
		return ispaid;
	}
	public void setIspaid(boolean ispaid) {
		this.ispaid = ispaid;
	}
	public List<SocialCategory> getSocialCategoryList() {
		return socialCategoryList;
	}
	public void setSocialCategoryList(List<SocialCategory> socialCategoryList) {
		this.socialCategoryList = socialCategoryList;
	}
	public SocialCategory getSocialCategory() {
		return socialCategory;
	}
	public void setSocialCategory(SocialCategory socialCategory) {
		this.socialCategory = socialCategory;
	}
	
}
