package com.qts.icam.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class Image {

	private CommonsMultipartFile imageData;
	private String imagepath;
	private String imageName;
	private String replacedImagedName;
	private int fileSize;
	private CommonsMultipartFile jointImageData;
	

	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public CommonsMultipartFile getImageData() {
		return imageData;
	}
	public void setImageData(CommonsMultipartFile imageData) {
		this.imageData = imageData;
	}
	public String getReplacedImagedName() {
		return replacedImagedName;
	}
	public void setReplacedImagedName(String replacedImagedName) {
		this.replacedImagedName = replacedImagedName;
	}
	public int getFileSize() {
		return fileSize;
	}
	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}
	public CommonsMultipartFile getJointImageData() {
		return jointImageData;
	}
	public void setJointImageData(CommonsMultipartFile jointImageData) {
		this.jointImageData = jointImageData;
	}
	
}
