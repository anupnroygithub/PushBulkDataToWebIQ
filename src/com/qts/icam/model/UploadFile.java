package com.qts.icam.model;

import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class UploadFile {
	private String imageName = null;
	private CommonsMultipartFile imageFile;  
	private String documentName = null;
	private List<CommonsMultipartFile> fileData;
	private List<Attachment> attachmentList;
	private String name = null;
	private List<CommonsMultipartFile> file; 
	private Attachment attachment;	
	private List<CommonsMultipartFile> publicationRelatedFile;
	private List<CommonsMultipartFile> qualificationRelatedFile;
	private List<CommonsMultipartFile> experienceRelatedFile;
	private List<CommonsMultipartFile> ticketingRelatedFile;
	
	//Added By Naimisha 15092017
	
	private List<CommonsMultipartFile> emailRelatedFile;
	
	private List<CommonsMultipartFile> tenderRelatedFile;
	
	//PRAD JUNE 6 2018
	private List<CommonsMultipartFile> achievementRelatedFile;
	
	public List<CommonsMultipartFile> getAchievementRelatedFile() {
		return achievementRelatedFile;
	}
	public void setAchievementRelatedFile(
			List<CommonsMultipartFile> achievementRelatedFile) {
		this.achievementRelatedFile = achievementRelatedFile;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
	public CommonsMultipartFile getImageFile() {
		return imageFile;
	}
	public void setImageFile(CommonsMultipartFile imageFile) {
		this.imageFile = imageFile;
	}
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	public List<Attachment> getAttachmentList() {
		return attachmentList;
	}
	public void setAttachmentList(List<Attachment> attachmentList) {
		this.attachmentList = attachmentList;
	}
	public List<CommonsMultipartFile> getFileData() {
		return fileData;
	}
	public void setFileData(List<CommonsMultipartFile> fileData) {
		this.fileData = fileData;
	}
	public List<CommonsMultipartFile> getFile() {
		return file;
	}
	public void setFile(List<CommonsMultipartFile> file) {
		this.file = file;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Attachment getAttachment() {
		return attachment;
	}
	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}
	public List<CommonsMultipartFile> getPublicationRelatedFile() {
		return publicationRelatedFile;
	}
	public void setPublicationRelatedFile(
			List<CommonsMultipartFile> publicationRelatedFile) {
		this.publicationRelatedFile = publicationRelatedFile;
	}
	public List<CommonsMultipartFile> getQualificationRelatedFile() {
		return qualificationRelatedFile;
	}
	public void setQualificationRelatedFile(
			List<CommonsMultipartFile> qualificationRelatedFile) {
		this.qualificationRelatedFile = qualificationRelatedFile;
	}
	public List<CommonsMultipartFile> getExperienceRelatedFile() {
		return experienceRelatedFile;
	}
	public void setExperienceRelatedFile(
			List<CommonsMultipartFile> experienceRelatedFile) {
		this.experienceRelatedFile = experienceRelatedFile;
	}
	public List<CommonsMultipartFile> getTicketingRelatedFile() {
		return ticketingRelatedFile;
	}
	public void setTicketingRelatedFile(
			List<CommonsMultipartFile> ticketingRelatedFile) {
		this.ticketingRelatedFile = ticketingRelatedFile;
	}
	public List<CommonsMultipartFile> getEmailRelatedFile() {
		return emailRelatedFile;
	}
	public void setEmailRelatedFile(List<CommonsMultipartFile> emailRelatedFile) {
		this.emailRelatedFile = emailRelatedFile;
	}
	public List<CommonsMultipartFile> getTenderRelatedFile() {
		return tenderRelatedFile;
	}
	public void setTenderRelatedFile(List<CommonsMultipartFile> tenderRelatedFile) {
		this.tenderRelatedFile = tenderRelatedFile;
	}
	
	
	
}
