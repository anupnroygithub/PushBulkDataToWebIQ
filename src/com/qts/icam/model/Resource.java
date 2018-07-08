package com.qts.icam.model;

import java.util.List;

import com.qts.icam.model.Subject;
import com.qts.icam.model.AccessType;
import com.qts.icam.model.Approver;
import com.qts.icam.model.Module;
import com.qts.icam.model.Role;
import com.qts.icam.model.UserGroup;
import com.qts.icam.model.JobType;
import com.qts.icam.model.SalaryBreakUp;
import com.qts.icam.model.SalaryTemplate;
import com.qts.icam.model.House;


public class Resource{	
	
	
	
	private int resourceId;
	private String objectId;
	private String updatedBy;
	private String code;
	private String name;
	private String desc;	
	private String status;
	
	private String gender;
	private String dateOfBirth;
	private String bloodGroup;
	private String motherTongue;
	private String category;
	private String nationality;
	private String religion;
	private String medicalStatus;
	private String userId;
	
	private String firstName;
	private String lastName;
	private String middleName;
	private String mobile;
	private String emailId;
	
	private String fatherFirstName;
	private String fatherLastName;
	private String fatherMiddleName;
	private Boolean fatherInDefence;
	private String fatherServiceStatus;
	private String fatherDefenceCategory;
	private String fatherRank;
	private String fatherMobile;
	private String fatherEmail;
	
	private String motherFirstName;
	private String motherLastName;
	private String motherMiddleName;
	private String motherMobile;
	private String motherEmail;
	
	private String panCardNo;
	private String passportNo;
	private String voterCardNo;
	private String votingConstituency;
	private String parliamentaryConstituency;
	private String aadharCardNo;
	private String rationCardNo;
	private UploadFile uploadFile;
	
	private AccessType accessType;
	private List<AccessType> accessTypeList;
	private List<Role> roleList;
	private String roleName;
	private Module module;
	private String resourceTypeName;	
	private String startDate;
	private String endDate;
	private int presentDays;
	private List<String> startDateList;
	private List<String> endDateList;
	private Image image;
	private String lastVisitedOn;
	private ResourceType resourceType;
	private List<ResourceType> resourceTypeList;
	private List<Attachment> attachmentList;
	private UserGroup userGroup;
	private Approver approver;
	private String identificationMark;
	
	private String bankName;
	private String bankBranch;
	private String accountNumber;
	private String accountType;
	private String accountHolderName;
	private Subject subject;
	
	private String designation;
	private String designationCode;	
	private String designationLevel;	
	private String salaryTemplateCode;	
	private String salaryTemplate;	
	private List<SalaryTemplate> salaryTemplateList;
	private String designationType;
	private SalaryBreakUp salaryBreakUp;	
	private double securityDeposit;
	
//-----------------------------ADDED FOR NEW BACKOFFICE--------------------------	
	private String registrationId;
	private String klass;
	private Section section;
	private List<SocialCategory> socialCategoryList;
	private String  courseName;
////---------------------------ADDED FOR TIME TABLE-----------------
	private String teacherName;
//---------------FOR TC--------------------
	private String paymentMode;
//-------------------FOR COURSE------------------------
	private String admissionYear;
//-------------------For receive fees--------------------
	private String admissionFromId;
	private String admissionDriveNameId;
//--------------FOR attendance calendar--------------------
	private String resourceName;
//-------------FOR HOSTEL NEW---------------
	private Address address;
	private int rollNumber;
	private String sectionName;
	
	private int studentRoll;
	private String ledger;
	
	private String initialName;
	private JobType jobType;
	private String academicYear;
	private String department;
	private double totalAmmount;
	private double balance;
	private List<FeesCategory>feesCategoryList;
	private String childId;
	private String personalIdentificationMark;
	private String foodPreference;
	private String firstPickUpPlace;
	private String secondPickupPlace;
	private String hobbies;
	
	private String fatherOccupation;
	private String motherOccupation;
	private String dateOfInterview;
	
	
	//** Added by Naimisha 19042018**//
	
	
	List<SalaryBreakUp>salaryBreakUpList;
	
	//anup.roy for update house of cadet
	private House house;
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getTotalAmmount() {
		return totalAmmount;
	}
	public void setTotalAmmount(double totalAmmount) {
		this.totalAmmount = totalAmmount;
	}
	public String getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public UserGroup getUserGroup() {
		return userGroup;
	}
	public void setUserGroup(UserGroup userGroup) {
		this.userGroup = userGroup;
	}	
	public int getResourceId() {
		return resourceId;
	}
	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getMotherTongue() {
		return motherTongue;
	}
	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getMedicalStatus() {
		return medicalStatus;
	}
	public void setMedicalStatus(String medicalStatus) {
		this.medicalStatus = medicalStatus;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getFatherFirstName() {
		return fatherFirstName;
	}
	public void setFatherFirstName(String fatherFirstName) {
		this.fatherFirstName = fatherFirstName;
	}
	public String getFatherLastName() {
		return fatherLastName;
	}
	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
	}
	public String getFatherMiddleName() {
		return fatherMiddleName;
	}
	public void setFatherMiddleName(String fatherMiddleName) {
		this.fatherMiddleName = fatherMiddleName;
	}
	public Boolean getFatherInDefence() {
		return fatherInDefence;
	}
	public void setFatherInDefence(Boolean fatherInDefence) {
		this.fatherInDefence = fatherInDefence;
	}
	public String getFatherServiceStatus() {
		return fatherServiceStatus;
	}
	public void setFatherServiceStatus(String fatherServiceStatus) {
		this.fatherServiceStatus = fatherServiceStatus;
	}
	public String getFatherDefenceCategory() {
		return fatherDefenceCategory;
	}
	public void setFatherDefenceCategory(String fatherDefenceCategory) {
		this.fatherDefenceCategory = fatherDefenceCategory;
	}
	public String getFatherRank() {
		return fatherRank;
	}
	public void setFatherRank(String fatherRank) {
		this.fatherRank = fatherRank;
	}
	public String getFatherMobile() {
		return fatherMobile;
	}
	public void setFatherMobile(String fatherMobile) {
		this.fatherMobile = fatherMobile;
	}
	public String getFatherEmail() {
		return fatherEmail;
	}
	public void setFatherEmail(String fatherEmail) {
		this.fatherEmail = fatherEmail;
	}
	public String getMotherFirstName() {
		return motherFirstName;
	}
	public void setMotherFirstName(String motherFirstName) {
		this.motherFirstName = motherFirstName;
	}
	public String getMotherLastName() {
		return motherLastName;
	}
	public void setMotherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
	}
	public String getMotherMiddleName() {
		return motherMiddleName;
	}
	public void setMotherMiddleName(String motherMiddleName) {
		this.motherMiddleName = motherMiddleName;
	}
	public String getMotherMobile() {
		return motherMobile;
	}
	public void setMotherMobile(String motherMobile) {
		this.motherMobile = motherMobile;
	}
	public String getMotherEmail() {
		return motherEmail;
	}
	public void setMotherEmail(String motherEmail) {
		this.motherEmail = motherEmail;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPanCardNo() {
		return panCardNo;
	}
	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getVoterCardNo() {
		return voterCardNo;
	}
	public void setVoterCardNo(String voterCardNo) {
		this.voterCardNo = voterCardNo;
	}
	public String getAadharCardNo() {
		return aadharCardNo;
	}
	public void setAadharCardNo(String aadharCardNo) {
		this.aadharCardNo = aadharCardNo;
	}
	public String getRationCardNo() {
		return rationCardNo;
	}
	public void setRationCardNo(String rationCardNo) {
		this.rationCardNo = rationCardNo;
	}
	public UploadFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(UploadFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	public AccessType getAccessType() {
		return accessType;
	}
	public void setAccessType(AccessType accessType) {
		this.accessType = accessType;
	}
	public List<AccessType> getAccessTypeList() {
		return accessTypeList;
	}
	public void setAccessTypeList(List<AccessType> accessTypeList) {
		this.accessTypeList = accessTypeList;
	}
	public List<Role> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	public String getResourceTypeName() {
		return resourceTypeName;
	}
	public void setResourceTypeName(String resourceTypeName) {
		this.resourceTypeName = resourceTypeName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getPresentDays() {
		return presentDays;
	}
	public void setPresentDays(int presentDays) {
		this.presentDays = presentDays;
	}
	public List<String> getStartDateList() {
		return startDateList;
	}
	public void setStartDateList(List<String> startDateList) {
		this.startDateList = startDateList;
	}
	public List<String> getEndDateList() {
		return endDateList;
	}
	public void setEndDateList(List<String> endDateList) {
		this.endDateList = endDateList;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public String getLastVisitedOn() {
		return lastVisitedOn;
	}
	public void setLastVisitedOn(String lastVisitedOn) {
		this.lastVisitedOn = lastVisitedOn;
	}
	public ResourceType getResourceType() {
		return resourceType;
	}
	public void setResourceType(ResourceType resourceType) {
		this.resourceType = resourceType;
	}
	public List<ResourceType> getResourceTypeList() {
		return resourceTypeList;
	}
	public void setResourceTypeList(List<ResourceType> resourceTypeList) {
		this.resourceTypeList = resourceTypeList;
	}
	public List<Attachment> getAttachmentList() {
		return attachmentList;
	}
	public void setAttachmentList(List<Attachment> attachmentList) {
		this.attachmentList = attachmentList;
	}
	public String getVotingConstituency() {
		return votingConstituency;
	}
	public void setVotingConstituency(String votingConstituency) {
		this.votingConstituency = votingConstituency;
	}
	public String getParliamentaryConstituency() {
		return parliamentaryConstituency;
	}
	public void setParliamentaryConstituency(String parliamentaryConstituency) {
		this.parliamentaryConstituency = parliamentaryConstituency;
	}
	public String getIdentificationMark() {
		return identificationMark;
	}
	public void setIdentificationMark(String identificationMark) {
		this.identificationMark = identificationMark;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public Approver getApprover() {
		return approver;
	}
	public void setApprover(Approver approver) {
		this.approver = approver;
	}
	public String getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	public String getKlass() {
		return klass;
	}
	public void setKlass(String klass) {
		this.klass = klass;
	}
	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
	public List<SocialCategory> getSocialCategoryList() {
		return socialCategoryList;
	}
	public void setSocialCategoryList(List<SocialCategory> socialCategoryList) {
		this.socialCategoryList = socialCategoryList;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDesignationCode() {
		return designationCode;
	}
	public void setDesignationCode(String designationCode) {
		this.designationCode = designationCode;
	}
	public String getDesignationLevel() {
		return designationLevel;
	}
	public void setDesignationLevel(String designationLevel) {
		this.designationLevel = designationLevel;
	}
	public String getSalaryTemplateCode() {
		return salaryTemplateCode;
	}
	public void setSalaryTemplateCode(String salaryTemplateCode) {
		this.salaryTemplateCode = salaryTemplateCode;
	}
	public String getSalaryTemplate() {
		return salaryTemplate;
	}
	public void setSalaryTemplate(String salaryTemplate) {
		this.salaryTemplate = salaryTemplate;
	}
	public List<SalaryTemplate> getSalaryTemplateList() {
		return salaryTemplateList;
	}
	public void setSalaryTemplateList(List<SalaryTemplate> salaryTemplateList) {
		this.salaryTemplateList = salaryTemplateList;
	}
	public String getDesignationType() {
		return designationType;
	}
	public void setDesignationType(String designationType) {
		this.designationType = designationType;
	}
	public SalaryBreakUp getSalaryBreakUp() {
		return salaryBreakUp;
	}
	public void setSalaryBreakUp(SalaryBreakUp salaryBreakUp) {
		this.salaryBreakUp = salaryBreakUp;
	}
	public double getSecurityDeposit() {
		return securityDeposit;
	}
	public void setSecurityDeposit(double securityDeposit) {
		this.securityDeposit = securityDeposit;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getAdmissionYear() {
		return admissionYear;
	}
	public void setAdmissionYear(String admissionYear) {
		this.admissionYear = admissionYear;
	}
	public String getAdmissionFromId() {
		return admissionFromId;
	}
	public void setAdmissionFromId(String admissionFromId) {
		this.admissionFromId = admissionFromId;
	}
	public String getAdmissionDriveNameId() {
		return admissionDriveNameId;
	}
	public void setAdmissionDriveNameId(String admissionDriveNameId) {
		this.admissionDriveNameId = admissionDriveNameId;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public int getStudentRoll() {
		return studentRoll;
	}
	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}
	public String getLedger() {
		return ledger;
	}
	public void setLedger(String ledger) {
		this.ledger = ledger;
	}
	public String getInitialName() {
		return initialName;
	}
	public void setInitialName(String initialName) {
		this.initialName = initialName;
	}
	public JobType getJobType() {
		return jobType;
	}
	public void setJobType(JobType jobType) {
		this.jobType = jobType;
	}
	public List<FeesCategory> getFeesCategoryList() {
		return feesCategoryList;
	}
	public void setFeesCategoryList(List<FeesCategory> feesCategoryList) {
		this.feesCategoryList = feesCategoryList;
	}
	public String getChildId() {
		return childId;
	}
	public void setChildId(String childId) {
		this.childId = childId;
	}
	public String getPersonalIdentificationMark() {
		return personalIdentificationMark;
	}
	public void setPersonalIdentificationMark(String personalIdentificationMark) {
		this.personalIdentificationMark = personalIdentificationMark;
	}
	public String getFoodPreference() {
		return foodPreference;
	}
	public void setFoodPreference(String foodPreference) {
		this.foodPreference = foodPreference;
	}
	public String getFirstPickUpPlace() {
		return firstPickUpPlace;
	}
	public void setFirstPickUpPlace(String firstPickUpPlace) {
		this.firstPickUpPlace = firstPickUpPlace;
	}
	public String getSecondPickupPlace() {
		return secondPickupPlace;
	}
	public void setSecondPickupPlace(String secondPickupPlace) {
		this.secondPickupPlace = secondPickupPlace;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getFatherOccupation() {
		return fatherOccupation;
	}
	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}
	public String getMotherOccupation() {
		return motherOccupation;
	}
	public void setMotherOccupation(String motherOccupation) {
		this.motherOccupation = motherOccupation;
	}
	/**
	 * @return the dateOfInterview
	 */
	public String getDateOfInterview() {
		return dateOfInterview;
	}
	/**
	 * @param dateOfInterview the dateOfInterview to set
	 */
	public void setDateOfInterview(String dateOfInterview) {
		this.dateOfInterview = dateOfInterview;
	}
	public List<SalaryBreakUp> getSalaryBreakUpList() {
		return salaryBreakUpList;
	}
	public void setSalaryBreakUpList(List<SalaryBreakUp> salaryBreakUpList) {
		this.salaryBreakUpList = salaryBreakUpList;
	}
	/**
	 * @return the house
	 */
	public House getHouse() {
		return house;
	}
	/**
	 * @param house the house to set
	 */
	public void setHouse(House house) {
		this.house = house;
	}
	
	
}