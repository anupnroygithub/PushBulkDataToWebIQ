package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.CoScholasticResult;
import com.qts.icam.model.StudentResult;
import com.qts.icam.model.Subject;
import com.qts.icam.model.FeesCategory;
import com.qts.icam.model.Facility;
import com.qts.icam.model.Form;
import com.qts.icam.model.ResidentType;
import com.qts.icam.model.StudentTC;
import com.qts.icam.model.Hostel;
import com.qts.icam.model.House;

public class Student {
	private int serialId;
	private String objectId;
	private String studentCode;
	private String studentDesc;
	private String updatedBy;
	private String status;
	
	private Integer rollNumber;	
	private String guardianFirstName;
	private String guardianLastName;
	private String guardianMiddleName;
	private String guardianMobile;
	private String guardianEmail;

	private String studentName;
	private String standard;
	private String section;
	private String house;
	private String dateOfAdmission;
	
	private String stateOfDomicile;
	private String scholarship;
	
	private Integer fatherIncome;
	private Integer motherIncome;
	private Integer studentIncome;
	private Integer familyIncome;
	
	private String previousSchoolName;
	private String previousSchoolPhone;
	private String previousSchoolWebsite;
	private String previousSchoolEmail;
	private String previousSchoolAddress;
	
	private Resource resource;
	private Address address;

	private String secondLanguage;
	private List<Subject> subjectList;
	private List<StudentResult> studentResultList;
	private List<CoScholasticResult> coScholasticResultList;
	private Double cgpa;
	private String joiningStandard;
	private StudentTC studentTC;
	private String strCgpa;	
	
	private Integer studentTotal;
	private Double studentPercent;
	private String studentPassFail;
	
	private List<String> stringListForStudent;
	
	/**
	 * Added by parma*/
	
	//---------------------------
	private String studentObjectId;
	private String registrationId;
	private String roll;
	private double cashAmmount; 
	private double bankAmmount; 
	private double amount;
	private double totAmmount;
	private String paymentStatus;	
	private String paymentMode;
	private String chequeNo;
	private String bankName;
	private String bankCode;
	private String bankLocation;
	private Hostel hostel;
	private int admissionFormId;
	private List<FeesCategory> feesCategoryList;
		//---------------------------
	private Form form;
	private String academicYearForFeesSubmission;
	private String driveNameForFeesSubmission;
	private String formIdForFeesSubmission;
	private String strFormId;
	private String driveId;
	
	private List<Facility>facilityList;
	
	/*/Added By Naimisha 21042017/*/
	
	private String userId;
	private String courseId;
	private String courseName;
	private String term;
	private String previousAchivement;
	
	/**New CBSE System start**/
	
	private String studentTotalChar;
	private String studentPercentChar;
	private String bloodGroup;
	
	/**New CBSE System end**/
	
	private String residentType;
	
	private House houseData;
	private ResidentType residentTypeData;
	
	private String mobileNo;
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	private String disciplinaryCode;
	private String description;
	
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
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
	public String getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	public String getStudentDesc() {
		return studentDesc;
	}
	public void setStudentDesc(String studentDesc) {
		this.studentDesc = studentDesc;
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
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getGuardianFirstName() {
		return guardianFirstName;
	}
	public void setGuardianFirstName(String guardianFirstName) {
		this.guardianFirstName = guardianFirstName;
	}
	public String getGuardianLastName() {
		return guardianLastName;
	}
	public void setGuardianLastName(String guardianLastName) {
		this.guardianLastName = guardianLastName;
	}
	public String getGuardianMiddleName() {
		return guardianMiddleName;
	}
	public void setGuardianMiddleName(String guardianMiddleName) {
		this.guardianMiddleName = guardianMiddleName;
	}
	public String getGuardianMobile() {
		return guardianMobile;
	}
	public void setGuardianMobile(String guardianMobile) {
		this.guardianMobile = guardianMobile;
	}
	public String getGuardianEmail() {
		return guardianEmail;
	}
	public void setGuardianEmail(String guardianEmail) {
		this.guardianEmail = guardianEmail;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getDateOfAdmission() {
		return dateOfAdmission;
	}
	public void setDateOfAdmission(String dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}
	public String getStateOfDomicile() {
		return stateOfDomicile;
	}
	public void setStateOfDomicile(String stateOfDomicile) {
		this.stateOfDomicile = stateOfDomicile;
	}
	public String getScholarship() {
		return scholarship;
	}
	public void setScholarship(String scholarship) {
		this.scholarship = scholarship;
	}
	public Integer getFatherIncome() {
		return fatherIncome;
	}
	public void setFatherIncome(Integer fatherIncome) {
		this.fatherIncome = fatherIncome;
	}
	public Integer getMotherIncome() {
		return motherIncome;
	}
	public void setMotherIncome(Integer motherIncome) {
		this.motherIncome = motherIncome;
	}
	public Integer getStudentIncome() {
		return studentIncome;
	}
	public void setStudentIncome(Integer studentIncome) {
		this.studentIncome = studentIncome;
	}
	public Integer getFamilyIncome() {
		return familyIncome;
	}
	public void setFamilyIncome(Integer familyIncome) {
		this.familyIncome = familyIncome;
	}
	public String getPreviousSchoolName() {
		return previousSchoolName;
	}
	public void setPreviousSchoolName(String previousSchoolName) {
		this.previousSchoolName = previousSchoolName;
	}
	public String getPreviousSchoolPhone() {
		return previousSchoolPhone;
	}
	public void setPreviousSchoolPhone(String previousSchoolPhone) {
		this.previousSchoolPhone = previousSchoolPhone;
	}
	public String getPreviousSchoolWebsite() {
		return previousSchoolWebsite;
	}
	public void setPreviousSchoolWebsite(String previousSchoolWebsite) {
		this.previousSchoolWebsite = previousSchoolWebsite;
	}
	public String getPreviousSchoolEmail() {
		return previousSchoolEmail;
	}
	public void setPreviousSchoolEmail(String previousSchoolEmail) {
		this.previousSchoolEmail = previousSchoolEmail;
	}
	public String getPreviousSchoolAddress() {
		return previousSchoolAddress;
	}
	public void setPreviousSchoolAddress(String previousSchoolAddress) {
		this.previousSchoolAddress = previousSchoolAddress;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	public String getSecondLanguage() {
		return secondLanguage;
	}
	public void setSecondLanguage(String secondLanguage) {
		this.secondLanguage = secondLanguage;
	}
	public List<Subject> getSubjectList() {
		return subjectList;
	}
	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	public List<StudentResult> getStudentResultList() {
		return studentResultList;
	}
	public void setStudentResultList(List<StudentResult> studentResultList) {
		this.studentResultList = studentResultList;
	}
	public List<CoScholasticResult> getCoScholasticResultList() {
		return coScholasticResultList;
	}
	public void setCoScholasticResultList(
			List<CoScholasticResult> coScholasticResultList) {
		this.coScholasticResultList = coScholasticResultList;
	}
	public Double getCgpa() {
		return cgpa;
	}
	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}
	public String getJoiningStandard() {
		return joiningStandard;
	}
	public void setJoiningStandard(String joiningStandard) {
		this.joiningStandard = joiningStandard;
	}
	public StudentTC getStudentTC() {
		return studentTC;
	}
	public void setStudentTC(StudentTC studentTC) {
		this.studentTC = studentTC;
	}
	public String getStrCgpa() {
		return strCgpa;
	}
	public void setStrCgpa(String strCgpa) {
		this.strCgpa = strCgpa;
	}
	public Integer getStudentTotal() {
		return studentTotal;
	}
	public void setStudentTotal(Integer studentTotal) {
		this.studentTotal = studentTotal;
	}
	public Double getStudentPercent() {
		return studentPercent;
	}
	public void setStudentPercent(Double studentPercent) {
		this.studentPercent = studentPercent;
	}
	public String getStudentPassFail() {
		return studentPassFail;
	}
	public void setStudentPassFail(String studentPassFail) {
		this.studentPassFail = studentPassFail;
	}
	public List<String> getStringListForStudent() {
		return stringListForStudent;
	}
	public void setStringListForStudent(List<String> stringListForStudent) {
		this.stringListForStudent = stringListForStudent;
	}
	public String getStudentObjectId() {
		return studentObjectId;
	}
	public void setStudentObjectId(String studentObjectId) {
		this.studentObjectId = studentObjectId;
	}
	public String getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public double getCashAmmount() {
		return cashAmmount;
	}
	public void setCashAmmount(double cashAmmount) {
		this.cashAmmount = cashAmmount;
	}
	public double getBankAmmount() {
		return bankAmmount;
	}
	public void setBankAmmount(double bankAmmount) {
		this.bankAmmount = bankAmmount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTotAmmount() {
		return totAmmount;
	}
	public void setTotAmmount(double totAmmount) {
		this.totAmmount = totAmmount;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankLocation() {
		return bankLocation;
	}
	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
	}
	public Hostel getHostel() {
		return hostel;
	}
	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}
	public int getAdmissionFormId() {
		return admissionFormId;
	}
	public void setAdmissionFormId(int admissionFormId) {
		this.admissionFormId = admissionFormId;
	}
	public List<FeesCategory> getFeesCategoryList() {
		return feesCategoryList;
	}
	public void setFeesCategoryList(List<FeesCategory> feesCategoryList) {
		this.feesCategoryList = feesCategoryList;
	}
	public Form getForm() {
		return form;
	}
	public void setForm(Form form) {
		this.form = form;
	}
	public String getAcademicYearForFeesSubmission() {
		return academicYearForFeesSubmission;
	}
	public void setAcademicYearForFeesSubmission(String academicYearForFeesSubmission) {
		this.academicYearForFeesSubmission = academicYearForFeesSubmission;
	}
	public String getDriveNameForFeesSubmission() {
		return driveNameForFeesSubmission;
	}
	public void setDriveNameForFeesSubmission(String driveNameForFeesSubmission) {
		this.driveNameForFeesSubmission = driveNameForFeesSubmission;
	}
	public String getFormIdForFeesSubmission() {
		return formIdForFeesSubmission;
	}
	public void setFormIdForFeesSubmission(String formIdForFeesSubmission) {
		this.formIdForFeesSubmission = formIdForFeesSubmission;
	}
	public String getStrFormId() {
		return strFormId;
	}
	public void setStrFormId(String strFormId) {
		this.strFormId = strFormId;
	}
	public String getDriveId() {
		return driveId;
	}
	public void setDriveId(String driveId) {
		this.driveId = driveId;
	}
	public List<Facility> getFacilityList() {
		return facilityList;
	}
	public void setFacilityList(List<Facility> facilityList) {
		this.facilityList = facilityList;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getPreviousAchivement() {
		return previousAchivement;
	}
	public void setPreviousAchivement(String previousAchivement) {
		this.previousAchivement = previousAchivement;
	}
	public String getStudentTotalChar() {
		return studentTotalChar;
	}
	public void setStudentTotalChar(String studentTotalChar) {
		this.studentTotalChar = studentTotalChar;
	}
	public String getStudentPercentChar() {
		return studentPercentChar;
	}
	public void setStudentPercentChar(String studentPercentChar) {
		this.studentPercentChar = studentPercentChar;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	/**
	 * @return the residentType
	 */
	public String getResidentType() {
		return residentType;
	}
	/**
	 * @param residentType the residentType to set
	 */
	public void setResidentType(String residentType) {
		this.residentType = residentType;
	}
	/**
	 * @return the houseData
	 */
	public House getHouseData() {
		return houseData;
	}
	/**
	 * @param houseData the houseData to set
	 */
	public void setHouseData(House houseData) {
		this.houseData = houseData;
	}
	/**
	 * @return the residentTypeData
	 */
	public ResidentType getResidentTypeData() {
		return residentTypeData;
	}
	/**
	 * @param residentTypeData the residentTypeData to set
	 */
	public void setResidentTypeData(ResidentType residentTypeData) {
		this.residentTypeData = residentTypeData;
	}
	public String getDisciplinaryCode() {
		return disciplinaryCode;
	}
	public void setDisciplinaryCode(String disciplinaryCode) {
		this.disciplinaryCode = disciplinaryCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	
	
	
}
