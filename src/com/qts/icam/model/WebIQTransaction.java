package com.qts.icam.model;

public class WebIQTransaction {
	
	String uri;
	String requestJSON;
	String responseJSON;
	boolean status;
	String updatedBy;
	private String objectId;
	
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
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getRequestJSON() {
		return requestJSON;
	}
	public void setRequestJSON(String requestJSON) {
		this.requestJSON = requestJSON;
	}
	public String getResponseJSON() {
		return responseJSON;
	}
	public void setResponseJSON(String responseJSON) {
		this.responseJSON = responseJSON;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

}
