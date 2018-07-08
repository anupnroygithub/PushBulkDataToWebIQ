package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.HostelType;
import com.qts.icam.model.Resource;
import com.qts.icam.model.Room;
import com.qts.icam.model.HostelFacility;

public class Hostel {
	private int hostelId;
	private String objectId;
	private String hostelCode;
	private String desc;
	private String updatedBy;
	private String hostelName;
	private String status;
	private HostelType hostelType;
	private String gender;
	private String zone;
	private String hostelAbbreviation;
	private List<HostelFacility> hostelFacilityList;
	private HostelFacility hostelFacility;
	private List<HostelType> hostelTypeList;
	private List<Resource> resourceList;
	private Room room;
	private List<Room> roomList;
	private Resource resource;
	private String hostelDesc;
	private String hostelTypeName;
	private String hostelTypeCode;
	
	public int getHostelId() {
		return hostelId;
	}
	public void setHostelId(int hostelId) {
		this.hostelId = hostelId;
	}
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getHostelCode() {
		return hostelCode;
	}
	public void setHostelCode(String hostelCode) {
		this.hostelCode = hostelCode;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public HostelType getHostelType() {
		return hostelType;
	}
	public void setHostelType(HostelType hostelType) {
		this.hostelType = hostelType;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getHostelAbbreviation() {
		return hostelAbbreviation;
	}
	public void setHostelAbbreviation(String hostelAbbreviation) {
		this.hostelAbbreviation = hostelAbbreviation;
	}
	public List<HostelFacility> getHostelFacilityList() {
		return hostelFacilityList;
	}
	public void setHostelFacilityList(List<HostelFacility> hostelFacilityList) {
		this.hostelFacilityList = hostelFacilityList;
	}
	public HostelFacility getHostelFacility() {
		return hostelFacility;
	}
	public void setHostelFacility(HostelFacility hostelFacility) {
		this.hostelFacility = hostelFacility;
	}
	public List<HostelType> getHostelTypeList() {
		return hostelTypeList;
	}
	public void setHostelTypeList(List<HostelType> hostelTypeList) {
		this.hostelTypeList = hostelTypeList;
	}
	public List<Resource> getResourceList() {
		return resourceList;
	}
	public void setResourceList(List<Resource> resourceList) {
		this.resourceList = resourceList;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public List<Room> getRoomList() {
		return roomList;
	}
	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	public String getHostelDesc() {
		return hostelDesc;
	}
	public void setHostelDesc(String hostelDesc) {
		this.hostelDesc = hostelDesc;
	}
	public String getHostelTypeName() {
		return hostelTypeName;
	}
	public void setHostelTypeName(String hostelTypeName) {
		this.hostelTypeName = hostelTypeName;
	}
	public String getHostelTypeCode() {
		return hostelTypeCode;
	}
	public void setHostelTypeCode(String hostelTypeCode) {
		this.hostelTypeCode = hostelTypeCode;
	}
}
