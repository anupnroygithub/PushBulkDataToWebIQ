package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.Alert;
import com.qts.icam.model.Notification;

public class NotificationMedium {

	private String objectId;
	private String updatedBy;
	private String notificationMediumCode;
	private String notificationMediumName;
	private String notificationMediumDesc;
	private String status;
	private List<Alert> alertList;
	private List<Notification> notificationList;
	private boolean active;
	
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getNotificationMediumCode() {
		return notificationMediumCode;
	}
	public void setNotificationMediumCode(String notificationMediumCode) {
		this.notificationMediumCode = notificationMediumCode;
	}
	public String getNotificationMediumName() {
		return notificationMediumName;
	}
	public void setNotificationMediumName(String notificationMediumName) {
		this.notificationMediumName = notificationMediumName;
	}
	public String getNotificationMediumDesc() {
		return notificationMediumDesc;
	}
	public void setNotificationMediumDesc(String notificationMediumDesc) {
		this.notificationMediumDesc = notificationMediumDesc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Alert> getAlertList() {
		return alertList;
	}
	public void setAlertList(List<Alert> alertList) {
		this.alertList = alertList;
	}
	public List<Notification> getNotificationList() {
		return notificationList;
	}
	public void setNotificationList(List<Notification> notificationList) {
		this.notificationList = notificationList;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
