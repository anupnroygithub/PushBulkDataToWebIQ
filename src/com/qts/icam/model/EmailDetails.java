package com.qts.icam.model;

import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class EmailDetails {
	private String objId;
	private String emailDetailsUserId;
	private String emailDetailsUserName;
	private String emailDetailsUserPassword;
	private String emailDetailsName;
	private String emailDetailsCode;
	private String emailDetailsSubject;
	private String emailDetailsDesc;
	private String updatedBy;
	private String status;
	private String emailDetailsSender;
	private String emailDetailsReceiver;
	
	private String date;
	private String time;
	private int noOfMail;
	
	//Added By Naimisha 13092017
	
	private String senderUserId;
	private String receiverUserId;
	
	//Added By Naimisha 15092017
	
	private List<CommonsMultipartFile> emailRelatedFile;
	private List<String>fileList;
	private String filePath;
	
	
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
	public String getEmailDetailsUserId() {
		return emailDetailsUserId;
	}
	public void setEmailDetailsUserId(String emailDetailsUserId) {
		this.emailDetailsUserId = emailDetailsUserId;
	}
	public String getEmailDetailsUserName() {
		return emailDetailsUserName;
	}
	public void setEmailDetailsUserName(String emailDetailsUserName) {
		this.emailDetailsUserName = emailDetailsUserName;
	}
	public String getEmailDetailsUserPassword() {
		return emailDetailsUserPassword;
	}
	public void setEmailDetailsUserPassword(String emailDetailsUserPassword) {
		this.emailDetailsUserPassword = emailDetailsUserPassword;
	}
	public String getEmailDetailsName() {
		return emailDetailsName;
	}
	public void setEmailDetailsName(String emailDetailsName) {
		this.emailDetailsName = emailDetailsName;
	}
	public String getEmailDetailsCode() {
		return emailDetailsCode;
	}
	public void setEmailDetailsCode(String emailDetailsCode) {
		this.emailDetailsCode = emailDetailsCode;
	}
	public String getEmailDetailsDesc() {
		return emailDetailsDesc;
	}
	public void setEmailDetailsDesc(String emailDetailsDesc) {
		this.emailDetailsDesc = emailDetailsDesc;
	}
	public String getEmailDetailsSender() {
		return emailDetailsSender;
	}
	public void setEmailDetailsSender(String emailDetailsSender) {
		this.emailDetailsSender = emailDetailsSender;
	}
	public String getEmailDetailsReceiver() {
		return emailDetailsReceiver;
	}
	public void setEmailDetailsReceiver(String emailDetailsReceiver) {
		this.emailDetailsReceiver = emailDetailsReceiver;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getEmailDetailsSubject() {
		return emailDetailsSubject;
	}
	public void setEmailDetailsSubject(String emailDetailsSubject) {
		this.emailDetailsSubject = emailDetailsSubject;
	}
	public String getObjId() {
		return objId;
	}
	public void setObjId(String objId) {
		this.objId = objId;
	}
	public int getNoOfMail() {
		return noOfMail;
	}
	public List<String> getFileList() {
		return fileList;
	}
	public void setFileList(List<String> fileList) {
		this.fileList = fileList;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public void setNoOfMail(int noOfMail) {
		this.noOfMail = noOfMail;
	}
	public String getSenderUserId() {
		return senderUserId;
	}
	public void setSenderUserId(String senderUserId) {
		this.senderUserId = senderUserId;
	}
	public String getReceiverUserId() {
		return receiverUserId;
	}
	public void setReceiverUserId(String receiverUserId) {
		this.receiverUserId = receiverUserId;
	}
	public List<CommonsMultipartFile> getEmailRelatedFile() {
		return emailRelatedFile;
	}
	public void setEmailRelatedFile(List<CommonsMultipartFile> emailRelatedFile) {
		this.emailRelatedFile = emailRelatedFile;
	}
	
	
	
	}
