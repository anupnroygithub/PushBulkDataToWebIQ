package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.FeesDuration;
import com.qts.icam.model.SocialCategory;

public class FeesCategory {

	private String feesCategoryObjectId;
	private String feesCategoryCode;
	private String feesCategoryDesc;
	private String updatedBy;
	private String feesCategoryName;
	private String feesType;
	private double fees;
	private String klass;
	private String academicYear;
	private String status;
	private int checkValid;
	private String feesStructureId;
	private FeesDuration feesDuration;
		
	private SocialCategory socialCategory;
	private double discount;
	private double discountedFees;
	private String course;
	private List<SocialCategory> socialCategoryList;	
	//-------------setter&getter-----------
	private String student;
	
	public String getFeesCategoryObjectId() {
		return feesCategoryObjectId;
	}
	public SocialCategory getSocialCategory() {
		return socialCategory;
	}
	public void setSocialCategory(SocialCategory socialCategory) {
		this.socialCategory = socialCategory;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getDiscountedFees() {
		return discountedFees;
	}
	public void setDiscountedFees(double discountedFees) {
		this.discountedFees = discountedFees;
	}
	public void setFeesCategoryObjectId(String feesCategoryObjectId) {
		this.feesCategoryObjectId = feesCategoryObjectId;
	}
	public String getFeesCategoryCode() {
		return feesCategoryCode;
	}
	public void setFeesCategoryCode(String feesCategoryCode) {
		this.feesCategoryCode = feesCategoryCode;
	}
	public String getFeesCategoryDesc() {
		return feesCategoryDesc;
	}
	public void setFeesCategoryDesc(String feesCategoryDesc) {
		this.feesCategoryDesc = feesCategoryDesc;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	public String getFeesCategoryName() {
		return feesCategoryName;
	}
	public void setFeesCategoryName(String feesCategoryName) {
		this.feesCategoryName = feesCategoryName;
	}
	public String getFeesType() {
		return feesType;
	}
	public void setFeesType(String feesType) {
		this.feesType = feesType;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCheckValid() {
		return checkValid;
	}
	public void setCheckValid(int checkValid) {
		this.checkValid = checkValid;
	}
	public String getFeesStructureId() {
		return feesStructureId;
	}
	public void setFeesStructureId(String feesStructureId) {
		this.feesStructureId = feesStructureId;
	}
	public void setKlass(String klass) {
		this.klass = klass;
	}
	public String getKlass() {
		return klass;
	}
	public FeesDuration getFeesDuration() {
		return feesDuration;
	}
	public void setFeesDuration(FeesDuration feesDuration) {
		this.feesDuration = feesDuration;
	}
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public List<SocialCategory> getSocialCategoryList() {
		return socialCategoryList;
	}
	public void setSocialCategoryList(List<SocialCategory> socialCategoryList) {
		this.socialCategoryList = socialCategoryList;
	}
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	
	
	
	
}
