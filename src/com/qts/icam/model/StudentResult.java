package com.qts.icam.model;

import java.util.List;
import com.qts.icam.model.Exam;
import com.qts.icam.model.UploadFile;

public class StudentResult {
		private int serialId;
		private String objectId;
		private String updatedBy;
		private String desc;
		private String status;
		
		private String rollNumber;
		private String name;
		
		private String standard;
		private String course;
		private String section;
		private String subject;
		private String exam;
		private String passFail;
		
		private Integer theory;
		private Integer theoryPass;
		private Integer practical;
		private Integer practicalPass;
		private Integer total;
		private Integer pass;
		
		private Integer theoryObtained;
		private Integer practicalObtained;
		private Integer totalObtained;
		private Double weightageObtained;
		private String marksType;
		private double marks;
		private Double weightage;
		private String pdfPath;
		private String reportConfigPath;
		private String imagePath;
		private List<Exam> examList;
		private String academicYear;
		private List<String> stringList;
		//used for consolidated report
		private Double fa1;
		private Double fa2;
		private Double sa1;
		private Double fa3;
		private Double fa4;
		private Double sa2;
		private Double t1;
		private Double totalTerm1;
		private Double gradepoint;
		private String grade;
		private Double cgpa;
		private UploadFile uploadFile;
		
		private String strFa1;
		private String strFa2;
		private String strSa1;
		private String strFa3;
		private String strFa4;
		private String strSa2;
		private String strT1;
		private String strTotalTerm1;
		private String strGradepoint;
		private String strCgpa;		
		
		/************Added For Koustav03032017***************/
		private String term;	
		private String batch;		
		
		/**New CBSE System start**/
		
		private String theoryObtainedChar;
		private String practicalObtainedChar;
		private String totalObtainedChar;		
		private String periodicTest;
		private String noteBook;
		private String subEnrichment;
		private String halfYearly;		
		private List<Subject> subjectList;
		
		/**New CBSE System end**/
		
		private String studentUserId;
		
		/**
		 * @return the studentUserId
		 */
		public String getStudentUserId() {
			return studentUserId;
		}
		/**
		 * @param studentUserId the studentUserId to set
		 */
		public void setStudentUserId(String studentUserId) {
			this.studentUserId = studentUserId;
		}
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
		public String getRollNumber() {
			return rollNumber;
		}
		public void setRollNumber(String rollNumber) {
			this.rollNumber = rollNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getStandard() {
			return standard;
		}
		public void setStandard(String standard) {
			this.standard = standard;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public String getSection() {
			return section;
		}
		public void setSection(String section) {
			this.section = section;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getExam() {
			return exam;
		}
		public void setExam(String exam) {
			this.exam = exam;
		}
		public String getPassFail() {
			return passFail;
		}
		public void setPassFail(String passFail) {
			this.passFail = passFail;
		}
		public Integer getTheory() {
			return theory;
		}
		public void setTheory(Integer theory) {
			this.theory = theory;
		}
		public Integer getTheoryPass() {
			return theoryPass;
		}
		public void setTheoryPass(Integer theoryPass) {
			this.theoryPass = theoryPass;
		}
		public Integer getPractical() {
			return practical;
		}
		public void setPractical(Integer practical) {
			this.practical = practical;
		}
		public Integer getPracticalPass() {
			return practicalPass;
		}
		public void setPracticalPass(Integer practicalPass) {
			this.practicalPass = practicalPass;
		}
		public Integer getTotal() {
			return total;
		}
		public void setTotal(Integer total) {
			this.total = total;
		}
		public Integer getPass() {
			return pass;
		}
		public void setPass(Integer pass) {
			this.pass = pass;
		}
		public Integer getTheoryObtained() {
			return theoryObtained;
		}
		public void setTheoryObtained(Integer theoryObtained) {
			this.theoryObtained = theoryObtained;
		}
		public Integer getPracticalObtained() {
			return practicalObtained;
		}
		public void setPracticalObtained(Integer practicalObtained) {
			this.practicalObtained = practicalObtained;
		}
		public Integer getTotalObtained() {
			return totalObtained;
		}
		public void setTotalObtained(Integer totalObtained) {
			this.totalObtained = totalObtained;
		}
		public Double getWeightageObtained() {
			return weightageObtained;
		}
		public void setWeightageObtained(Double weightageObtained) {
			this.weightageObtained = weightageObtained;
		}
		public String getMarksType() {
			return marksType;
		}
		public void setMarksType(String marksType) {
			this.marksType = marksType;
		}
		public double getMarks() {
			return marks;
		}
		public void setMarks(double marks) {
			this.marks = marks;
		}
		public Double getWeightage() {
			return weightage;
		}
		public void setWeightage(Double weightage) {
			this.weightage = weightage;
		}
		public String getPdfPath() {
			return pdfPath;
		}
		public void setPdfPath(String pdfPath) {
			this.pdfPath = pdfPath;
		}
		public String getReportConfigPath() {
			return reportConfigPath;
		}
		public void setReportConfigPath(String reportConfigPath) {
			this.reportConfigPath = reportConfigPath;
		}
		public String getImagePath() {
			return imagePath;
		}
		public void setImagePath(String imagePath) {
			this.imagePath = imagePath;
		}
		public List<Exam> getExamList() {
			return examList;
		}
		public void setExamList(List<Exam> examList) {
			this.examList = examList;
		}
		public String getAcademicYear() {
			return academicYear;
		}
		public void setAcademicYear(String academicYear) {
			this.academicYear = academicYear;
		}
		public List<String> getStringList() {
			return stringList;
		}
		public void setStringList(List<String> stringList) {
			this.stringList = stringList;
		}
		public Double getFa1() {
			return fa1;
		}
		public void setFa1(Double fa1) {
			this.fa1 = fa1;
		}
		public Double getFa2() {
			return fa2;
		}
		public void setFa2(Double fa2) {
			this.fa2 = fa2;
		}
		public Double getSa1() {
			return sa1;
		}
		public void setSa1(Double sa1) {
			this.sa1 = sa1;
		}
		public Double getFa3() {
			return fa3;
		}
		public void setFa3(Double fa3) {
			this.fa3 = fa3;
		}
		public Double getFa4() {
			return fa4;
		}
		public void setFa4(Double fa4) {
			this.fa4 = fa4;
		}
		public Double getSa2() {
			return sa2;
		}
		public void setSa2(Double sa2) {
			this.sa2 = sa2;
		}
		public Double getT1() {
			return t1;
		}
		public void setT1(Double t1) {
			this.t1 = t1;
		}
		public Double getTotalTerm1() {
			return totalTerm1;
		}
		public void setTotalTerm1(Double totalTerm1) {
			this.totalTerm1 = totalTerm1;
		}
		public Double getGradepoint() {
			return gradepoint;
		}
		public void setGradepoint(Double gradepoint) {
			this.gradepoint = gradepoint;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		public Double getCgpa() {
			return cgpa;
		}
		public void setCgpa(Double cgpa) {
			this.cgpa = cgpa;
		}
		public UploadFile getUploadFile() {
			return uploadFile;
		}
		public void setUploadFile(UploadFile uploadFile) {
			this.uploadFile = uploadFile;
		}
		public String getStrFa1() {
			return strFa1;
		}
		public void setStrFa1(String strFa1) {
			this.strFa1 = strFa1;
		}
		public String getStrFa2() {
			return strFa2;
		}
		public void setStrFa2(String strFa2) {
			this.strFa2 = strFa2;
		}
		public String getStrSa1() {
			return strSa1;
		}
		public void setStrSa1(String strSa1) {
			this.strSa1 = strSa1;
		}
		public String getStrFa3() {
			return strFa3;
		}
		public void setStrFa3(String strFa3) {
			this.strFa3 = strFa3;
		}
		public String getStrFa4() {
			return strFa4;
		}
		public void setStrFa4(String strFa4) {
			this.strFa4 = strFa4;
		}
		public String getStrSa2() {
			return strSa2;
		}
		public void setStrSa2(String strSa2) {
			this.strSa2 = strSa2;
		}
		public String getStrT1() {
			return strT1;
		}
		public void setStrT1(String strT1) {
			this.strT1 = strT1;
		}
		public String getStrTotalTerm1() {
			return strTotalTerm1;
		}
		public void setStrTotalTerm1(String strTotalTerm1) {
			this.strTotalTerm1 = strTotalTerm1;
		}
		public String getStrGradepoint() {
			return strGradepoint;
		}
		public void setStrGradepoint(String strGradepoint) {
			this.strGradepoint = strGradepoint;
		}
		public String getStrCgpa() {
			return strCgpa;
		}
		public void setStrCgpa(String strCgpa) {
			this.strCgpa = strCgpa;
		}
		public String getTerm() {
			return term;
		}
		public void setTerm(String term) {
			this.term = term;
		}
		public String getBatch() {
			return batch;
		}
		public void setBatch(String batch) {
			this.batch = batch;
		}
		public String getTheoryObtainedChar() {
			return theoryObtainedChar;
		}
		public void setTheoryObtainedChar(String theoryObtainedChar) {
			this.theoryObtainedChar = theoryObtainedChar;
		}
		public String getPracticalObtainedChar() {
			return practicalObtainedChar;
		}
		public void setPracticalObtainedChar(String practicalObtainedChar) {
			this.practicalObtainedChar = practicalObtainedChar;
		}
		public String getTotalObtainedChar() {
			return totalObtainedChar;
		}
		public void setTotalObtainedChar(String totalObtainedChar) {
			this.totalObtainedChar = totalObtainedChar;
		}
		public String getPeriodicTest() {
			return periodicTest;
		}
		public void setPeriodicTest(String periodicTest) {
			this.periodicTest = periodicTest;
		}
		public String getNoteBook() {
			return noteBook;
		}
		public void setNoteBook(String noteBook) {
			this.noteBook = noteBook;
		}
		public String getSubEnrichment() {
			return subEnrichment;
		}
		public void setSubEnrichment(String subEnrichment) {
			this.subEnrichment = subEnrichment;
		}
		public String getHalfYearly() {
			return halfYearly;
		}
		public void setHalfYearly(String halfYearly) {
			this.halfYearly = halfYearly;
		}
		public List<Subject> getSubjectList() {
			return subjectList;
		}
		public void setSubjectList(List<Subject> subjectList) {
			this.subjectList = subjectList;
		}
		
		
}
