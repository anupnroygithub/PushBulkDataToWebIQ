package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.CourseType;
import com.qts.icam.model.Subject;
import com.qts.icam.model.Exam;
import com.qts.icam.model.Term;
import com.qts.icam.model.Standard;

public class Course {
		private int serialId;
		private String objectId;
		private String updatedBy;
		private String desc;
		private String status;
		
		private String courseCode;
		private String courseName;
		private String courseDesc;
		private Standard standard;
		private CourseType courseType;
		
		/**Added by Saif
		 * Date- 05/09/2017*/
		private String credit;
		private List<Term> termList;
		//private List<Subject> subjectList;
		/**Saif addition ends*/
		//------------------FOR ATTENDANCE PURPOSE-----------------------

		private String courseStartTime;
		private String courseEndTime;
		
		private String year;
		//--anup.roy 19072017--
		private int courseDuration;
		
		
		//Added By Naimisha 21092017
		
		private List<Section>sectionList;
		
		private String startTime;
		private String endTime;
		private List<Subject> subjectList;
		
		
		public int getSerialId() {
			return serialId;
		}
		public void setSerialId(int serialId) {
			this.serialId = serialId;
		}
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
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getCourseCode() {
			return courseCode;
		}
		public void setCourseCode(String courseCode) {
			this.courseCode = courseCode;
		}
		public String getCourseName() {
			return courseName;
		}
		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}
		public String getCourseDesc() {
			return courseDesc;
		}
		public void setCourseDesc(String courseDesc) {
			this.courseDesc = courseDesc;
		}
		public Standard getStandard() {
			return standard;
		}
		public void setStandard(Standard standard) {
			this.standard = standard;
		}
		public CourseType getCourseType() {
			return courseType;
		}
		public void setCourseType(CourseType courseType) {
			this.courseType = courseType;
		}
		public String getCourseStartTime() {
			return courseStartTime;
		}
		public void setCourseStartTime(String courseStartTime) {
			this.courseStartTime = courseStartTime;
		}
		public String getCourseEndTime() {
			return courseEndTime;
		}
		public void setCourseEndTime(String courseEndTime) {
			this.courseEndTime = courseEndTime;
		}
		public String getYear() {
			return year;
		}
		public void setYear(String year) {
			this.year = year;
		}
		public int getCourseDuration() {
			return courseDuration;
		}
		public void setCourseDuration(int courseDuration) {
			this.courseDuration = courseDuration;
		}
		public String getCredit() {
			return credit;
		}
		public void setCredit(String credit) {
			this.credit = credit;
		}
		public List<Term> getTermList() {
			return termList;
		}
		public void setTermList(List<Term> termList) {
			this.termList = termList;
		}
		public List<Section> getSectionList() {
			return sectionList;
		}
		public void setSectionList(List<Section> sectionList) {
			this.sectionList = sectionList;
		}
		/**
		 * @return the startTime
		 */
		public String getStartTime() {
			return startTime;
		}
		/**
		 * @param startTime the startTime to set
		 */
		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
		/**
		 * @return the endTime
		 */
		public String getEndTime() {
			return endTime;
		}
		/**
		 * @param endTime the endTime to set
		 */
		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}
		/**
		 * @return the subjectList
		 */
		public List<Subject> getSubjectList() {
			return subjectList;
		}
		/**
		 * @param subjectList the subjectList to set
		 */
		public void setSubjectList(List<Subject> subjectList) {
			this.subjectList = subjectList;
		}
		
}
