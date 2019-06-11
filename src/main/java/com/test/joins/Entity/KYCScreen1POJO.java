package com.test.joins.Entity;

import java.util.Date;
import java.util.List;

public class KYCScreen1POJO {

    private String idType;
    private String idNumber;
    private String firstName;
    private String lastName;
    private String nationality;
    private Date idExpiryDate;
    private String customerNameOnPassport;
    private String gender;
    private Date dateOfBirth;
    private String maritalStatus;
    private String isResidentOfKuwait;
    private String academicDegree;
    private String countryOfBirth;
    private String specialNeeds;
    private List<RelationTablePOJO> screen1AndRelation;
    private String step;

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getIdExpiryDate() {
        return idExpiryDate;
    }

    public void setIdExpiryDate(Date idExpiryDate) {
        this.idExpiryDate = idExpiryDate;
    }

    public String getCustomerNameOnPassport() {
        return customerNameOnPassport;
    }

    public void setCustomerNameOnPassport(String customerNameOnPassport) {
        this.customerNameOnPassport = customerNameOnPassport;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getIsResidentOfKuwait() {
        return isResidentOfKuwait;
    }

    public void setIsResidentOfKuwait(String isResidentOfKuwait) {
        this.isResidentOfKuwait = isResidentOfKuwait;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public String getSpecialNeeds() {
        return specialNeeds;
    }

    public void setSpecialNeeds(String specialNeeds) {
        this.specialNeeds = specialNeeds;
    }

    public List<RelationTablePOJO> getScreen1AndRelation() {
        return screen1AndRelation;
    }

    public void setScreen1AndRelation(List<RelationTablePOJO> screen1AndRelation) {
        this.screen1AndRelation = screen1AndRelation;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }
}
