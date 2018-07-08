package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.SocialCategory;

import com.qts.icam.model.Hostel;

public class HostelFacility {
	
	private String hostelFacilityObjectId;
	private String hostelFacilityCode;
	private String hostelFacilityDesc;
	private String updatedBy;
	private String hostelFacilityName;
	private String hostelFacilityId;
	private Hostel hostel;
	private String hostelName;
	private int hostelFacilityQuantity;
	private String hostelFacilityMode;
	private double hostelFacilityCharge;
	private List<Hostel> hostelList;
	private String status;
	private int hostelFacilitySerialId;
	private List<SocialCategory> socialCategoryList;
	private SocialCategory socialCategory;
	
	public String getHostelFacilityObjectId() {
		return hostelFacilityObjectId;
	}
	public void setHostelFacilityObjectId(String hostelFacilityObjectId) {
		this.hostelFacilityObjectId = hostelFacilityObjectId;
	}
	public String getHostelFacilityCode() {
		return hostelFacilityCode;
	}
	public void setHostelFacilityCode(String hostelFacilityCode) {
		this.hostelFacilityCode = hostelFacilityCode;
	}
	public String getHostelFacilityDesc() {
		return hostelFacilityDesc;
	}
	public void setHostelFacilityDesc(String hostelFacilityDesc) {
		this.hostelFacilityDesc = hostelFacilityDesc;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getHostelFacilityName() {
		return hostelFacilityName;
	}
	public void setHostelFacilityName(String hostelFacilityName) {
		this.hostelFacilityName = hostelFacilityName;
	}
	public String getHostelFacilityId() {
		return hostelFacilityId;
	}
	public void setHostelFacilityId(String hostelFacilityId) {
		this.hostelFacilityId = hostelFacilityId;
	}
	public Hostel getHostel() {
		return hostel;
	}
	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getHostelFacilityQuantity() {
		return hostelFacilityQuantity;
	}
	public void setHostelFacilityQuantity(int hostelFacilityQuantity) {
		this.hostelFacilityQuantity = hostelFacilityQuantity;
	}
	public String getHostelFacilityMode() {
		return hostelFacilityMode;
	}
	public void setHostelFacilityMode(String hostelFacilityMode) {
		this.hostelFacilityMode = hostelFacilityMode;
	}
	public double getHostelFacilityCharge() {
		return hostelFacilityCharge;
	}
	public void setHostelFacilityCharge(double hostelFacilityCharge) {
		this.hostelFacilityCharge = hostelFacilityCharge;
	}
	public List<Hostel> getHostelList() {
		return hostelList;
	}
	public void setHostelList(List<Hostel> hostelList) {
		this.hostelList = hostelList;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getHostelFacilitySerialId() {
		return hostelFacilitySerialId;
	}
	public void setHostelFacilitySerialId(int hostelFacilitySerialId) {
		this.hostelFacilitySerialId = hostelFacilitySerialId;
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
