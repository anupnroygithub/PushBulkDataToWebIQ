package com.qts.icam.model;

import java.util.List;


import com.qts.icam.model.Functionality;
import com.qts.icam.model.Module;
import com.qts.icam.model.Resource;

public class LoggingAspect {

	private int loggingId;
	private String methodSignatureName;
	private String loggingDesc;
	private String loggingObjectId;
	private String loggingTime;
	private String updatedBy;
	private String serviceName;
	private String task;
	private String status;
	private String notificationLevel;
	private List<Resource> urgentNotificationResourceList;
	private List<Resource> normalNotificationResourceList;
	private boolean notification;
	private boolean activityLog;
	private String loggingSubject;	
	private String methodName;
	private String recId;	
	private Resource resource;
	private String emailSubjectTemplate;
	private String emailBodyTemplate;
	private Functionality functionality;
	private Module module;
	private List<NotificationMedium> notificationMediums; 	
	
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
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	public String getRecId() {
		return recId;
	}
	public void setRecId(String recId) {
		this.recId = recId;
	}
	public int getLoggingId() {
		return loggingId;
	}
	public void setLoggingId(int loggingId) {
		this.loggingId = loggingId;
	}
	public String getLoggingDesc() {
		return loggingDesc;
	}
	public void setLoggingDesc(String loggingDesc) {
		this.loggingDesc = loggingDesc;
	}
	public String getLoggingTime() {
		return loggingTime;
	}
	public void setLoggingTime(String loggingTime) {
		this.loggingTime = loggingTime;
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
	public String getLoggingObjectId() {
		return loggingObjectId;
	}
	public void setLoggingObjectId(String loggingObjectId) {
		this.loggingObjectId = loggingObjectId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getMethodSignatureName() {
		return methodSignatureName;
	}
	public void setMethodSignatureName(String methodSignatureName) {
		this.methodSignatureName = methodSignatureName;
	}
	public String getNotificationLevel() {
		return notificationLevel;
	}
	public void setNotificationLevel(String notificationLevel) {
		this.notificationLevel = notificationLevel;
	}
	public boolean isNotification() {
		return notification;
	}
	public void setNotification(boolean notification) {
		this.notification = notification;
	}
	public boolean isActivityLog() {
		return activityLog;
	}
	public void setActivityLog(boolean activityLog) {
		this.activityLog = activityLog;
	}
	
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	
	public List<Resource> getUrgentNotificationResourceList() {
		return urgentNotificationResourceList;
	}
	public void setUrgentNotificationResourceList(
			List<Resource> urgentNotificationResourceList) {
		this.urgentNotificationResourceList = urgentNotificationResourceList;
	}
	public List<Resource> getNormalNotificationResourceList() {
		return normalNotificationResourceList;
	}
	public void setNormalNotificationResourceList(
			List<Resource> normalNotificationResourceList) {
		this.normalNotificationResourceList = normalNotificationResourceList;
	}
	
	public String getLoggingSubject() {
		return loggingSubject;
	}
	public void setLoggingSubject(String loggingSubject) {
		this.loggingSubject = loggingSubject;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public Functionality getFunctionality() {
		return functionality;
	}
	public void setFunctionality(Functionality functionality) {
		this.functionality = functionality;
	}
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	public List<NotificationMedium> getNotificationMediums() {
		return notificationMediums;
	}
	public void setNotificationMediums(List<NotificationMedium> notificationMediums) {
		this.notificationMediums = notificationMediums;
	}
	
	
}
