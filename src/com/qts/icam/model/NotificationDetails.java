package com.qts.icam.model;

import java.util.List;


public class NotificationDetails {
	private int notificationDetailsId;
	private String notificationDetailsName;
	private String notificationDetailsCode;
	private String notificationDetailsDesc;
	private String updatedBy;
	private String notificationReceiver;
	private String openDate;
	private String closeDate;
	private String status;
	private String  notificationDetailsObjectId;
	private int notificationId;
	private List<Resource> resourceList;
	
	public String getNotificationDetailsName() {
		return notificationDetailsName;
	}
	public void setNotificationDetailsName(String notificationDetailsName) {
		this.notificationDetailsName = notificationDetailsName;
	}
	public String getNotificationDetailsCode() {
		return notificationDetailsCode;
	}
	public void setNotificationDetailsCode(String notificationDetailsCode) {
		this.notificationDetailsCode = notificationDetailsCode;
	}
	public String getNotificationDetailsDesc() {
		return notificationDetailsDesc;
	}
	public void setNotificationDetailsDesc(String notificationDetailsDesc) {
		this.notificationDetailsDesc = notificationDetailsDesc;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	public String getOpenDate() {
		return openDate;
	}
	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}
	public String getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNotificationReceiver() {
		return notificationReceiver;
	}
	public void setNotificationReceiver(String notificationReceiver) {
		this.notificationReceiver = notificationReceiver;
	}
	public String getNotificationDetailsObjectId() {
		return notificationDetailsObjectId;
	}
	public void setNotificationDetailsObjectId(
			String notificationDetailsObjectId) {
		this.notificationDetailsObjectId = notificationDetailsObjectId;
	}
	public int getNotificationDetailsId() {
		return notificationDetailsId;
	}
	public void setNotificationDetailsId(int notificationDetailsId) {
		this.notificationDetailsId = notificationDetailsId;
	}
	public int getNotificationId() {
		return notificationId;
	}
	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}
	public List<Resource> getResourceList() {
		return resourceList;
	}
	public void setResourceList(List<Resource> resourceList) {
		this.resourceList = resourceList;
	}
	
	
}
