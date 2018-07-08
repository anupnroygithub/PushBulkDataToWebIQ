package com.qts.icam.model;

import com.qts.icam.model.Hostel;
import com.qts.icam.model.Room;

public class RoomFacility {

	private String roomFacilityObjectId;
	private String roomFacilityCode;
	private String roomFacilityDesc;
	private String updatedBy;
	private String roomFacilityName;
	private String roomFacilityId;
	private Room room;
	private Hostel hostel;
	private int roomFacilityQuantity;
	private int roomSerialId;
	private String roomCode;
	private String status;
	
	public String getRoomFacilityObjectId() {
		return roomFacilityObjectId;
	}
	public void setRoomFacilityObjectId(String roomFacilityObjectId) {
		this.roomFacilityObjectId = roomFacilityObjectId;
	}
	public String getRoomFacilityCode() {
		return roomFacilityCode;
	}
	public void setRoomFacilityCode(String roomFacilityCode) {
		this.roomFacilityCode = roomFacilityCode;
	}
	public String getRoomFacilityDesc() {
		return roomFacilityDesc;
	}
	public void setRoomFacilityDesc(String roomFacilityDesc) {
		this.roomFacilityDesc = roomFacilityDesc;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getRoomFacilityName() {
		return roomFacilityName;
	}
	public void setRoomFacilityName(String roomFacilityName) {
		this.roomFacilityName = roomFacilityName;
	}
	public String getRoomFacilityId() {
		return roomFacilityId;
	}
	public void setRoomFacilityId(String roomFacilityId) {
		this.roomFacilityId = roomFacilityId;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public Hostel getHostel() {
		return hostel;
	}
	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}
	public int getRoomFacilityQuantity() {
		return roomFacilityQuantity;
	}
	public void setRoomFacilityQuantity(int roomFacilityQuantity) {
		this.roomFacilityQuantity = roomFacilityQuantity;
	}
	public int getRoomSerialId() {
		return roomSerialId;
	}
	public void setRoomSerialId(int roomSerialId) {
		this.roomSerialId = roomSerialId;
	}
	public String getRoomCode() {
		return roomCode;
	}
	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
