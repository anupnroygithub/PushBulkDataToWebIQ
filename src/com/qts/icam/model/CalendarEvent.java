package com.qts.icam.model;

import com.qts.icam.model.EventType;




public class CalendarEvent {

	private String calendarEventObjectId;
	private String calendarEventCode;
	private int calendarIntEventCode;
	private String calendarEventDesc;
	private String updatedBy;
	private String calendarEventBy;
	private String calendarEventName;
	private String calendarEventStartDate;
	private String calendarEventEndDate;
	private String calendarEventStartTime;
	private String calendarEventEndTime;
	private String calendarEventEndColor;
	private String calendarEventViewer;
	private String RollName;
	private EventType eventType;
	
	
	public EventType getEventType() {
		return eventType;
	}
	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}
	public String getCalendarEventObjectId() {
		return calendarEventObjectId;
	}
	public void setCalendarEventObjectId(String calendarEventObjectId) {
		this.calendarEventObjectId = calendarEventObjectId;
	}
	public String getCalendarEventCode() {
		return calendarEventCode;
	}
	public void setCalendarEventCode(String calendarEventCode) {
		this.calendarEventCode = calendarEventCode;
	}
	
	public int getCalendarIntEventCode() {
		return calendarIntEventCode;
	}
	public void setCalendarIntEventCode(int calendarIntEventCode) {
		this.calendarIntEventCode = calendarIntEventCode;
	}
	public String getCalendarEventDesc() {
		return calendarEventDesc;
	}
	public void setCalendarEventDesc(String calendarEventDesc) {
		this.calendarEventDesc = calendarEventDesc;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getCalendarEventBy() {
		return calendarEventBy;
	}
	public void setCalendarEventBy(String calendarEventBy) {
		this.calendarEventBy = calendarEventBy;
	}
	public String getCalendarEventName() {
		return calendarEventName;
	}
	public void setCalendarEventName(String calendarEventName) {
		this.calendarEventName = calendarEventName;
	}
	public String getCalendarEventStartDate() {
		return calendarEventStartDate;
	}
	public void setCalendarEventStartDate(String calendarEventStartDate) {
		this.calendarEventStartDate = calendarEventStartDate;
	}
	public String getCalendarEventEndDate() {
		return calendarEventEndDate;
	}
	public void setCalendarEventEndDate(String calendarEventEndDate) {
		this.calendarEventEndDate = calendarEventEndDate;
	}
	public String getCalendarEventStartTime() {
		return calendarEventStartTime;
	}
	public void setCalendarEventStartTime(String startTime) {
		this.calendarEventStartTime = startTime;
	}
	public String getCalendarEventEndTime() {
		return calendarEventEndTime;
	}
	public void setCalendarEventEndTime(String calendarEventEndTime) {
		this.calendarEventEndTime = calendarEventEndTime;
	}
	public String getCalendarEventEndColor() {
		return calendarEventEndColor;
	}
	public void setCalendarEventEndColor(String calendarEventEndColor) {
		this.calendarEventEndColor = calendarEventEndColor;
	}
	public String getCalendarEventViewer() {
		return calendarEventViewer;
	}
	public void setCalendarEventViewer(String calendarEventViewer) {
		this.calendarEventViewer = calendarEventViewer;
	}
	public String getRollName() {
		return RollName;
	}
	public void setRollName(String rollName) {
		RollName = rollName;
	}
	
	
	
}
