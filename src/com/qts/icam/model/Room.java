package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.Hostel;

import com.qts.icam.model.RoomFacility;

import com.qts.icam.model.RoomType;

public class Room {
	
	private String roomObjectId;
	private String roomCode;
	private String roomDesc;
	private String updatedBy;
	private String roomName;
	private String roomId;
	private Hostel hostel;
	private RoomType roomType;
	private int bedOccupied;
	private int bedVaccent;
	private int bedTotal;
	private List<RoomType> roomTypeList;
	private String status;
	private String roomTypeCode;
	private String roomTypeName;
	private String hostelName;
	private int roomSerialId;
	private List<RoomFacility> roomFacilityList;
	
	public String getRoomObjectId() {
		return roomObjectId;
	}
	public void setRoomObjectId(String roomObjectId) {
		this.roomObjectId = roomObjectId;
	}
	public String getRoomCode() {
		return roomCode;
	}
	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}
	public String getRoomDesc() {
		return roomDesc;
	}
	public void setRoomDesc(String roomDesc) {
		this.roomDesc = roomDesc;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public Hostel getHostel() {
		return hostel;
	}
	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}
	public RoomType getRoomType() {
		return roomType;
	}
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	public int getBedOccupied() {
		return bedOccupied;
	}
	public void setBedOccupied(int bedOccupied) {
		this.bedOccupied = bedOccupied;
	}
	public int getBedVaccent() {
		return bedVaccent;
	}
	public void setBedVaccent(int bedVaccent) {
		this.bedVaccent = bedVaccent;
	}
	public int getBedTotal() {
		return bedTotal;
	}
	public void setBedTotal(int bedTotal) {
		this.bedTotal = bedTotal;
	}
	public List<RoomType> getRoomTypeList() {
		return roomTypeList;
	}
	public void setRoomTypeList(List<RoomType> roomTypeList) {
		this.roomTypeList = roomTypeList;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRoomTypeCode() {
		return roomTypeCode;
	}
	public void setRoomTypeCode(String roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
	}
	public String getRoomTypeName() {
		return roomTypeName;
	}
	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomSerialId() {
		return roomSerialId;
	}
	public void setRoomSerialId(int roomSerialId) {
		this.roomSerialId = roomSerialId;
	}
	public List<RoomFacility> getRoomFacilityList() {
		return roomFacilityList;
	}
	public void setRoomFacilityList(List<RoomFacility> roomFacilityList) {
		this.roomFacilityList = roomFacilityList;
	}
}
