package com.qts.icam.model;

public class CourseType {
		private int serialId;
		private String objectId;
		private String updatedBy;
		private String desc;
		private String status;
		
		private String courseTypeCode;
		private String courseTypeName;
		private String courseTypeDesc;
		
		
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
		public String getCourseTypeCode() {
			return courseTypeCode;
		}
		public void setCourseTypeCode(String courseTypeCode) {
			this.courseTypeCode = courseTypeCode;
		}
		public String getCourseTypeName() {
			return courseTypeName;
		}
		public void setCourseTypeName(String courseTypeName) {
			this.courseTypeName = courseTypeName;
		}
		public String getCourseTypeDesc() {
			return courseTypeDesc;
		}
		public void setCourseTypeDesc(String courseTypeDesc) {
			this.courseTypeDesc = courseTypeDesc;
		}
		
}
