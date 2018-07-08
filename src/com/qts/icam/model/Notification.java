package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.NotificationMedium;

public class Notification {
	private String recId;
	private int notificationId;
	private String notificationName;
	private String notificationCode;
	private String notificationDesc;
	private String updatedBy;
	private String status;
	private List<NotificationDetails> notificationDetailsList;
	private String notificationSender;
	private String notificationObjectId;
	private int newNotification;
	private String notificationDate;
	private NotificationMedium notificationMedium;
	private String notificationReplyTo;
	private String notificationSubject;
	private List<NotificationMedium> notificationMediumList;
	private boolean approvalStatus;	
	private String emailSubjectTemplate;
	private String emailBodyTemplate;
	private List<EmailDetails> emailDetailsList;
	private int newEmailNotification;
	private String receiveTime;
	
	//By Naimisha 15092017
	private UploadFile uploadFile;
	private List<Attachment> attachmentList;
	private String emailFilepath;
	private List<String> fileList;
	
	private String meetingDate;
	private String meetingLocation;
	private String meetingStartTime;
	private String meetingEndTime;
	private List<String>icsFileList;
	private String icsFilepath;
	private String icsFile;
	private String attachmentType;
	
	public String getEmailSubjectTemplate() {
		return emailSubjectTemplate;
	}
	public void setEmailSubjectTemplate(String emailSubjectTemplate) {
		this.emailSubjectTemplate = emailSubjectTemplate;
	}
	public String getEmailBodyTemplate() {
		return emailBodyTemplate;
	}
	public void setEmailBodyTemplate(String emailBodyTemplate) {
		this.emailBodyTemplate = emailBodyTemplate;
	}
	public List<EmailDetails> getEmailDetailsList() {
		return emailDetailsList;
	}
	public void setEmailDetailsList(List<EmailDetails> emailDetailsList) {
		this.emailDetailsList = emailDetailsList;
	}
	public boolean isApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(boolean approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public String getNotificationName() {
		return notificationName;
	}
	public void setNotificationName(String notificationName) {
		this.notificationName = notificationName;
	}
	public String getNotificationCode() {
		return notificationCode;
	}
	public void setNotificationCode(String notificationCode) {
		this.notificationCode = notificationCode;
	}
	public String getNotificationDesc() {
		return notificationDesc;
	}
	public void setNotificationDesc(String notificationDesc) {
		this.notificationDesc = notificationDesc;
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
	public String getNotificationSender() {
		return notificationSender;
	}
	public void setNotificationSender(String notificationSender) {
		this.notificationSender = notificationSender;
	}
	public List<NotificationDetails> getNotificationDetailsList() {
		return notificationDetailsList;
	}
	public void setNotificationDetailsList(
			List<NotificationDetails> notificationDetailsList) {
		this.notificationDetailsList = notificationDetailsList;
	}
	public String getRecId() {
		return recId;
	}
	public void setRecId(String recId) {
		this.recId = recId;
	}
	public int getNotificationId() {
		return notificationId;
	}
	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}
	public String getNotificationObjectId() {
		return notificationObjectId;
	}
	public void setNotificationObjectId(String notificationObjectId) {
		this.notificationObjectId = notificationObjectId;
	}
	public int getNewNotification() {
		return newNotification;
	}
	public void setNewNotification(int newNotification) {
		this.newNotification = newNotification;
	}
	public String getNotificationDate() {
		return notificationDate;
	}
	public void setNotificationDate(String notificationDate) {
		this.notificationDate = notificationDate;
	}
	public NotificationMedium getNotificationMedium() {
		return notificationMedium;
	}
	public void setNotificationMedium(NotificationMedium notificationMedium) {
		this.notificationMedium = notificationMedium;
	}
	public String getNotificationReplyTo() {
		return notificationReplyTo;
	}
	public void setNotificationReplyTo(String notificationReplyTo) {
		this.notificationReplyTo = notificationReplyTo;
	}
	public String getNotificationSubject() {
		return notificationSubject;
	}
	public void setNotificationSubject(String notificationSubject) {
		this.notificationSubject = notificationSubject;
	}
	public List<NotificationMedium> getNotificationMediumList() {
		return notificationMediumList;
	}
	public void setNotificationMediumList(
			List<NotificationMedium> notificationMediumList) {
		this.notificationMediumList = notificationMediumList;
	}
	public int getNewEmailNotification() {
		return newEmailNotification;
	}
	public void setNewEmailNotification(int newEmailNotification) {
		this.newEmailNotification = newEmailNotification;
	}
	public String getReceiveTime() {
		return receiveTime;
	}
	public void setReceiveTime(String receiveTime) {
		this.receiveTime = receiveTime;
	}
	
	public UploadFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(UploadFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	public List<Attachment> getAttachmentList() {
		return attachmentList;
	}
	public void setAttachmentList(List<Attachment> attachmentList) {
		this.attachmentList = attachmentList;
	}
	public String getEmailFilepath() {
		return emailFilepath;
	}
	public void setEmailFilepath(String emailFilepath) {
		this.emailFilepath = emailFilepath;
	}
	public List<String> getFileList() {
		return fileList;
	}
	public void setFileList(List<String> fileList) {
		this.fileList = fileList;
	}
	public String getMeetingDate() {
		return meetingDate;
	}
	public void setMeetingDate(String meetingDate) {
		this.meetingDate = meetingDate;
	}
	public String getMeetingLocation() {
		return meetingLocation;
	}
	public void setMeetingLocation(String meetingLocation) {
		this.meetingLocation = meetingLocation;
	}
	public String getMeetingStartTime() {
		return meetingStartTime;
	}
	public void setMeetingStartTime(String meetingStartTime) {
		this.meetingStartTime = meetingStartTime;
	}
	public String getMeetingEndTime() {
		return meetingEndTime;
	}
	public void setMeetingEndTime(String meetingEndTime) {
		this.meetingEndTime = meetingEndTime;
	}
	public List<String> getIcsFileList() {
		return icsFileList;
	}
	public void setIcsFileList(List<String> icsFileList) {
		this.icsFileList = icsFileList;
	}
	public String getIcsFilepath() {
		return icsFilepath;
	}
	public void setIcsFilepath(String icsFilepath) {
		this.icsFilepath = icsFilepath;
	}
	public String getIcsFile() {
		return icsFile;
	}
	public void setIcsFile(String icsFile) {
		this.icsFile = icsFile;
	}
	public String getAttachmentType() {
		return attachmentType;
	}
	public void setAttachmentType(String attachmentType) {
		this.attachmentType = attachmentType;
	}
	
}
