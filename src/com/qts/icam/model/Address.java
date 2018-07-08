package com.qts.icam.model;
import java.util.List;
public class Address {
	private int addressId;
	private String objectId;
	private String addressCode;
	private String addressDesc;
	private String addressName;
	private String updatedBy;
	private String status;
	private String userId;
	private Integer rollNumber;
	
	private String presentAddressLine;
	private String presentAddressLandmark;
	private String presentAddressCityVillage;
	private String presentAddressPostOffice;
	private String presentAddressPoliceStation;
	private String presentAddressPinCode;
	private String presentAddressDistrict;
	private String presentAddressCountry;
	private String presentAddressState;
	private String presentAddressRailwayStation;
	private String presentAddressPhone;
	
	private String permanentAddressLine;
	private String permanentAddressLandmark;
	private String permanentAddressCityVillage;
	private String permanentAddressPostOffice;
	private String permanentAddressPoliceStation;
	private String permanentAddressPinCode;
	private String permanentAddressDistrict;
	private String permanentAddressCountry;
	private String permanentAddressState;
	private String permanentAddressRailwayStation;
	private String permanentAddressPhone;
	
	private String guardianAddressLine;
	private String guardianAddressLandmark;
	private String guardianAddressCityVillage;
	private String guardianAddressPostOffice;
	private String guardianAddressPoliceStation;
	private String guardianAddressPinCode;
	private String guardianAddressDistrict;
	private String guardianAddressCountry;
	private String guardianAddressState;
	private String guardianAddressRailwayStation;
	private String guardianAddressPhone;
	
	private String addressType;
	private List<State> stateList;
	private List<Country> countryList;
	
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getAddressCode() {
		return addressCode;
	}
	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}
	public String getAddressDesc() {
		return addressDesc;
	}
	public void setAddressDesc(String addressDesc) {
		this.addressDesc = addressDesc;
	}
	public String getAddressName() {
		return addressName;
	}
	public void setAddressName(String addressName) {
		this.addressName = addressName;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getPresentAddressLine() {
		return presentAddressLine;
	}
	public void setPresentAddressLine(String presentAddressLine) {
		this.presentAddressLine = presentAddressLine;
	}
	public String getPresentAddressLandmark() {
		return presentAddressLandmark;
	}
	public void setPresentAddressLandmark(String presentAddressLandmark) {
		this.presentAddressLandmark = presentAddressLandmark;
	}
	public String getPresentAddressCityVillage() {
		return presentAddressCityVillage;
	}
	public void setPresentAddressCityVillage(String presentAddressCityVillage) {
		this.presentAddressCityVillage = presentAddressCityVillage;
	}
	public String getPresentAddressPostOffice() {
		return presentAddressPostOffice;
	}
	public void setPresentAddressPostOffice(String presentAddressPostOffice) {
		this.presentAddressPostOffice = presentAddressPostOffice;
	}
	public String getPresentAddressPoliceStation() {
		return presentAddressPoliceStation;
	}
	public void setPresentAddressPoliceStation(String presentAddressPoliceStation) {
		this.presentAddressPoliceStation = presentAddressPoliceStation;
	}
	public String getPresentAddressPinCode() {
		return presentAddressPinCode;
	}
	public void setPresentAddressPinCode(String presentAddressPinCode) {
		this.presentAddressPinCode = presentAddressPinCode;
	}
	public String getPresentAddressDistrict() {
		return presentAddressDistrict;
	}
	public void setPresentAddressDistrict(String presentAddressDistrict) {
		this.presentAddressDistrict = presentAddressDistrict;
	}
	public String getPresentAddressCountry() {
		return presentAddressCountry;
	}
	public void setPresentAddressCountry(String presentAddressCountry) {
		this.presentAddressCountry = presentAddressCountry;
	}
	public String getPresentAddressState() {
		return presentAddressState;
	}
	public void setPresentAddressState(String presentAddressState) {
		this.presentAddressState = presentAddressState;
	}
	public String getPresentAddressRailwayStation() {
		return presentAddressRailwayStation;
	}
	public void setPresentAddressRailwayStation(String presentAddressRailwayStation) {
		this.presentAddressRailwayStation = presentAddressRailwayStation;
	}
	public String getPresentAddressPhone() {
		return presentAddressPhone;
	}
	public void setPresentAddressPhone(String presentAddressPhone) {
		this.presentAddressPhone = presentAddressPhone;
	}
	public String getPermanentAddressLine() {
		return permanentAddressLine;
	}
	public void setPermanentAddressLine(String permanentAddressLine) {
		this.permanentAddressLine = permanentAddressLine;
	}
	public String getPermanentAddressLandmark() {
		return permanentAddressLandmark;
	}
	public void setPermanentAddressLandmark(String permanentAddressLandmark) {
		this.permanentAddressLandmark = permanentAddressLandmark;
	}
	public String getPermanentAddressCityVillage() {
		return permanentAddressCityVillage;
	}
	public void setPermanentAddressCityVillage(String permanentAddressCityVillage) {
		this.permanentAddressCityVillage = permanentAddressCityVillage;
	}
	public String getPermanentAddressPostOffice() {
		return permanentAddressPostOffice;
	}
	public void setPermanentAddressPostOffice(String permanentAddressPostOffice) {
		this.permanentAddressPostOffice = permanentAddressPostOffice;
	}
	public String getPermanentAddressPoliceStation() {
		return permanentAddressPoliceStation;
	}
	public void setPermanentAddressPoliceStation(
			String permanentAddressPoliceStation) {
		this.permanentAddressPoliceStation = permanentAddressPoliceStation;
	}
	public String getPermanentAddressPinCode() {
		return permanentAddressPinCode;
	}
	public void setPermanentAddressPinCode(String permanentAddressPinCode) {
		this.permanentAddressPinCode = permanentAddressPinCode;
	}
	public String getPermanentAddressDistrict() {
		return permanentAddressDistrict;
	}
	public void setPermanentAddressDistrict(String permanentAddressDistrict) {
		this.permanentAddressDistrict = permanentAddressDistrict;
	}
	public String getPermanentAddressCountry() {
		return permanentAddressCountry;
	}
	public void setPermanentAddressCountry(String permanentAddressCountry) {
		this.permanentAddressCountry = permanentAddressCountry;
	}
	public String getPermanentAddressState() {
		return permanentAddressState;
	}
	public void setPermanentAddressState(String permanentAddressState) {
		this.permanentAddressState = permanentAddressState;
	}
	public String getPermanentAddressRailwayStation() {
		return permanentAddressRailwayStation;
	}
	public void setPermanentAddressRailwayStation(
			String permanentAddressRailwayStation) {
		this.permanentAddressRailwayStation = permanentAddressRailwayStation;
	}
	public String getPermanentAddressPhone() {
		return permanentAddressPhone;
	}
	public void setPermanentAddressPhone(String permanentAddressPhone) {
		this.permanentAddressPhone = permanentAddressPhone;
	}
	public String getGuardianAddressLine() {
		return guardianAddressLine;
	}
	public void setGuardianAddressLine(String guardianAddressLine) {
		this.guardianAddressLine = guardianAddressLine;
	}
	public String getGuardianAddressLandmark() {
		return guardianAddressLandmark;
	}
	public void setGuardianAddressLandmark(String guardianAddressLandmark) {
		this.guardianAddressLandmark = guardianAddressLandmark;
	}
	public String getGuardianAddressCityVillage() {
		return guardianAddressCityVillage;
	}
	public void setGuardianAddressCityVillage(String guardianAddressCityVillage) {
		this.guardianAddressCityVillage = guardianAddressCityVillage;
	}
	public String getGuardianAddressPostOffice() {
		return guardianAddressPostOffice;
	}
	public void setGuardianAddressPostOffice(String guardianAddressPostOffice) {
		this.guardianAddressPostOffice = guardianAddressPostOffice;
	}
	public String getGuardianAddressPoliceStation() {
		return guardianAddressPoliceStation;
	}
	public void setGuardianAddressPoliceStation(String guardianAddressPoliceStation) {
		this.guardianAddressPoliceStation = guardianAddressPoliceStation;
	}
	public String getGuardianAddressPinCode() {
		return guardianAddressPinCode;
	}
	public void setGuardianAddressPinCode(String guardianAddressPinCode) {
		this.guardianAddressPinCode = guardianAddressPinCode;
	}
	public String getGuardianAddressDistrict() {
		return guardianAddressDistrict;
	}
	public void setGuardianAddressDistrict(String guardianAddressDistrict) {
		this.guardianAddressDistrict = guardianAddressDistrict;
	}
	public String getGuardianAddressCountry() {
		return guardianAddressCountry;
	}
	public void setGuardianAddressCountry(String guardianAddressCountry) {
		this.guardianAddressCountry = guardianAddressCountry;
	}
	public String getGuardianAddressState() {
		return guardianAddressState;
	}
	public void setGuardianAddressState(String guardianAddressState) {
		this.guardianAddressState = guardianAddressState;
	}
	public String getGuardianAddressRailwayStation() {
		return guardianAddressRailwayStation;
	}
	public void setGuardianAddressRailwayStation(
			String guardianAddressRailwayStation) {
		this.guardianAddressRailwayStation = guardianAddressRailwayStation;
	}
	public String getGuardianAddressPhone() {
		return guardianAddressPhone;
	}
	public void setGuardianAddressPhone(String guardianAddressPhone) {
		this.guardianAddressPhone = guardianAddressPhone;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public List<State> getStateList() {
		return stateList;
	}
	public void setStateList(List<State> stateList) {
		this.stateList = stateList;
	}
	public List<Country> getCountryList() {
		return countryList;
	}
	public void setCountryList(List<Country> countryList) {
		this.countryList = countryList;
	}
}
