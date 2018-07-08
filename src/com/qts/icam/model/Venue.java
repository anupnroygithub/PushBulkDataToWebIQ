package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.Address;
import com.qts.icam.model.Resource;
import com.qts.icam.model.Room;
import com.qts.icam.model.Facility;

public class Venue {
	private int venueId;
	private String objectId;
	private String venueCode;
	private String venueDesc;
	private String venueName;
	private String updatedBy;
	private String status;
	private String contactNo;
	private String mobileNo;
	private String email;
	private Address address;
	private int capacity;
	private long startSeatRollNo;
	private long endSeatRollNo;
	private int availableSeat;
	private long prevStartSeatRollNo;
	private long prevEndSeatRollNo;
	private String examTime;
	private String examDate;
	
	/*********Added By naimisha*****/
	private String zoneDesc;
	private String zoneName;
	private String zoneCode;
	
	private String location;
	private String building;
	private String floor;
	private String roomNo;
	private List<Facility>facilityList;
	private String facility;
	
	/**Added by anup for venue-resource mapping**/
	
	private String block;
	private Room room;
	private Resource resource;
	
	private String venueTypeCode;
	private String venueTypeName;
	
	private String startDate;
	private String endDate;
	private String startTime;
	private String endTime;
	
	/**Added by ranita.sur for venue disable-enable*/
	private String availability;
	
	private String standard;
	private String rowByColumn;
	private String algorithm;
	private String rowNumber;
	private String columnNumber;
	
	public int getVenueId() {
		return venueId;
	}
	public void setVenueId(int venueId) {
		this.venueId = venueId;
	}
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getVenueCode() {
		return venueCode;
	}
	public void setVenueCode(String venueCode) {
		this.venueCode = venueCode;
	}
	public String getVenueDesc() {
		return venueDesc;
	}
	public void setVenueDesc(String venueDesc) {
		this.venueDesc = venueDesc;
	}
	public String getVenueName() {
		return venueName;
	}
	public void setVenueName(String venueName) {
		this.venueName = venueName;
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
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public long getStartSeatRollNo() {
		return startSeatRollNo;
	}
	public void setStartSeatRollNo(long startSeatRollNo) {
		this.startSeatRollNo = startSeatRollNo;
	}
	public long getEndSeatRollNo() {
		return endSeatRollNo;
	}
	public void setEndSeatRollNo(long endSeatRollNo) {
		this.endSeatRollNo = endSeatRollNo;
	}
	public int getAvailableSeat() {
		return availableSeat;
	}
	public void setAvailableSeat(int availableSeat) {
		this.availableSeat = availableSeat;
	}
	public long getPrevStartSeatRollNo() {
		return prevStartSeatRollNo;
	}
	public void setPrevStartSeatRollNo(long prevStartSeatRollNo) {
		this.prevStartSeatRollNo = prevStartSeatRollNo;
	}
	public long getPrevEndSeatRollNo() {
		return prevEndSeatRollNo;
	}
	public void setPrevEndSeatRollNo(long prevEndSeatRollNo) {
		this.prevEndSeatRollNo = prevEndSeatRollNo;
	}
	public String getExamTime() {
		return examTime;
	}
	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}
	public String getExamDate() {
		return examDate;
	}
	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}
	public String getZoneDesc() {
		return zoneDesc;
	}
	public void setZoneDesc(String zoneDesc) {
		this.zoneDesc = zoneDesc;
	}
	public String getZoneName() {
		return zoneName;
	}
	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}
	public String getZoneCode() {
		return zoneCode;
	}
	public void setZoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public List<Facility> getFacilityList() {
		return facilityList;
	}
	public void setFacilityList(List<Facility> facilityList) {
		this.facilityList = facilityList;
	}
	public String getFacility() {
		return facility;
	}
	public void setFacility(String facility) {
		this.facility = facility;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	public String getVenueTypeCode() {
		return venueTypeCode;
	}
	public void setVenueTypeCode(String venueTypeCode) {
		this.venueTypeCode = venueTypeCode;
	}
	public String getVenueTypeName() {
		return venueTypeName;
	}
	public void setVenueTypeName(String venueTypeName) {
		this.venueTypeName = venueTypeName;
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
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getRowByColumn() {
		return rowByColumn;
	}
	public void setRowByColumn(String rowByColumn) {
		this.rowByColumn = rowByColumn;
	}
	public String getAlgorithm() {
		return algorithm;
	}
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}
	public String getRowNumber() {
		return rowNumber;
	}
	public void setRowNumber(String rowNumber) {
		this.rowNumber = rowNumber;
	}
	public String getColumnNumber() {
		return columnNumber;
	}
	public void setColumnNumber(String columnNumber) {
		this.columnNumber = columnNumber;
	}
	
	
	
}
