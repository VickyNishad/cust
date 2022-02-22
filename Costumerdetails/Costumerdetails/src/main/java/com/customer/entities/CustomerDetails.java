package com.customer.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;



//@SqlResultSetMapping(name = "Course", classes = @ConstructorResult(targetClass = Course.class, columns = {@ColumnResult(name = "id", type = Long.class), 
//		@ColumnResult(name = "crsname", type = String.class), @ColumnResult(name = "crsdescription", type = String.class)}))

@Entity
@Table
//@SqlResultSetMapping(name = )
@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name = "GetCustomerDetail" ,
	procedureName = "GetCustomerDetail" , parameters = {
	@StoredProcedureParameter(mode = ParameterMode.IN , name = "CustGuId"  , type = String.class )})})
public class CustomerDetails {
	
	@Id
	private String IdentityGuId;
	private String CustomerId;
	private String SocialClientId;
	private String SalutationGuId;
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String Gender;
	private String DateOfBirth;
	private String EmailId;
	private String MobileNo;
	private String CurrencyGuId;
	private String Language;
	private String SourceGuId;
	private String ExpiryDate;
	private String CreatedBy;
	private String CreatedOnDate;
	private String IsActive;
	private String MFUcc;
	public CustomerDetails(String identityGuId, String customerId, String socialClientId, String salutationGuId,
			String firstName, String middleName, String lastName, String gender, String dateOfBirth, String emailId,
			String mobileNo, String currencyGuId, String language, String sourceGuId, String expiryDate,
			String createdBy, String createdOnDate, String isActive, String mFUcc) {
		super();
		IdentityGuId = identityGuId;
		CustomerId = customerId;
		SocialClientId = socialClientId;
		SalutationGuId = salutationGuId;
		FirstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
		Gender = gender;
		DateOfBirth = dateOfBirth;
		EmailId = emailId;
		MobileNo = mobileNo;
		CurrencyGuId = currencyGuId;
		Language = language;
		SourceGuId = sourceGuId;
		ExpiryDate = expiryDate;
		CreatedBy = createdBy;
		CreatedOnDate = createdOnDate;
		IsActive = isActive;
		MFUcc = mFUcc;
	}
	
	
	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getIdentityGuId() {
		return IdentityGuId;
	}
	public String setIdentityGuId(String identityGuId) {
		return IdentityGuId = identityGuId;
	}
	public String getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}
	public String getSocialClientId() {
		return SocialClientId;
	}
	public void setSocialClientId(String socialClientId) {
		SocialClientId = socialClientId;
	}
	public String getSalutationGuId() {
		return SalutationGuId;
	}
	public void setSalutationGuId(String salutationGuId) {
		SalutationGuId = salutationGuId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getCurrencyGuId() {
		return CurrencyGuId;
	}
	public void setCurrencyGuId(String currencyGuId) {
		CurrencyGuId = currencyGuId;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getSourceGuId() {
		return SourceGuId;
	}
	public void setSourceGuId(String sourceGuId) {
		SourceGuId = sourceGuId;
	}
	public String getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		ExpiryDate = expiryDate;
	}
	public String getCreatedBy() {
		return CreatedBy;
	}
	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}
	public String getCreatedOnDate() {
		return CreatedOnDate;
	}
	public void setCreatedOnDate(String createdOnDate) {
		CreatedOnDate = createdOnDate;
	}
	public String getIsActive() {
		return IsActive;
	}
	public void setIsActive(String isActive) {
		IsActive = isActive;
	}
	public String getMFUcc() {
		return MFUcc;
	}
	public void setMFUcc(String mFUcc) {
		MFUcc = mFUcc;
	}
	@Override
	public String toString() {
		return "CustomerDetails [IdentityGuId=" + IdentityGuId + ", CustomerId=" + CustomerId + ", SocialClientId="
				+ SocialClientId + ", SalutationGuId=" + SalutationGuId + ", FirstName=" + FirstName + ", MiddleName="
				+ MiddleName + ", LastName=" + LastName + ", Gender=" + Gender + ", DateOfBirth=" + DateOfBirth
				+ ", EmailId=" + EmailId + ", MobileNo=" + MobileNo + ", CurrencyGuId=" + CurrencyGuId + ", Language="
				+ Language + ", SourceGuId=" + SourceGuId + ", ExpiryDate=" + ExpiryDate + ", CreatedBy=" + CreatedBy
				+ ", CreatedOnDate=" + CreatedOnDate + ", IsActive=" + IsActive + ", MFUcc=" + MFUcc + "]";
	}


	
	
}
