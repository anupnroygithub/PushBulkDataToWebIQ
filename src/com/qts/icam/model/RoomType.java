package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.SocialCategory;
import com.qts.icam.model.Room;

public class RoomType {
	
	private String roomTypeObjectId;
	private String roomTypeCode;
	private String roomTypeName;
	private String updatedBy;
	private String roomTypeId;
	private List<Room> roomList;
	private String status;
	private List<SocialCategory> socialCategoryList;
	
	public String getRoomTypeObjectId() {
		return roomTypeObjectId;
	}
	public void setRoomTypeObjectId(String roomTypeObjectId) {
		this.roomTypeObjectId = roomTypeObjectId;
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
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getRoomTypeId() {
		return roomTypeId;
	}
	public void setRoomTypeId(String roomTypeId) {
		this.roomTypeId = roomTypeId;
	}
	public List<Room> getRoomList() {
		return roomList;
	}
	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<SocialCategory> getSocialCategoryList() {
		return socialCategoryList;
	}
	public void setSocialCategoryList(List<SocialCategory> socialCategoryList) {
		this.socialCategoryList = socialCategoryList;
	}

}
