package com.test.joins.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "KYCSCREEN1")
public class KYCScreen1 {

    @Id
    @Column(name = "CIF")
    private String cif;

    @Column(name = "IDTYPE")
    private String idType;

    @Column(name = "IDNUMBER")
    private String idNumber;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "NATIONALITY")
    private String nationality;

    @Column(name = "IDEXPIRYDATE")
    private Date idExpiryDate;

    @Column(name = "CUSTOMERNAMEONPASSPORT")
    private String customerNameOnPassport;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "DATEOFBIRTH")
    private Date dateOfBirth;

    @Column(name = "MARITALSTATUS")
    private String maritalStatus;

    @Column(name = "ISRESIDENTOFKUWAIT")
    private String isResidentOfKuwait;

    @Column(name = "ACADEMICDEGREE")
    private String academicDegree;

    @Column(name = "COUNTRYOFBIRTH")
    private String countryOfBirth;

    @Column(name = "SPECIALNEEDS")
    private String specialNeeds;

    @OneToMany(mappedBy = "screen1AndRelation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RelationTable> screen1AndRelation;

    @OneToOne(mappedBy = "screen1AndScreen2", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private KYCScreen2 screen1AndScreen2;

    @OneToOne(mappedBy = "screen1AndScreen3", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private KYCScreen3 screen1AndScreen3;

    @OneToOne(mappedBy = "screen1AndScreen4", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private KYCScreen4 screen1AndScreen4;

    @OneToOne(mappedBy = "screen1AndScreen5", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private KYCScreen5 screen1AndScreen5;

    @OneToOne(mappedBy = "screen1AndScreen6", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private KYCScreen6 screen1AndScreen6;

    @Column(name = "STEP", columnDefinition = "varchar(2) default 1")
    private String step;

    @Column(name = "TOKEN1")
    private String token1;

    @Column(name = "TOKEN2")
    private String token2;

    @Column(name = "TOKEN3")
    private String token3;

    @Column(name = "TOKEN4")
    private String token4;

    @Column(name = "TOKEN5")
    private String token5;

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

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

    public List<RelationTable> getScreen1AndRelation() {
        return screen1AndRelation;
    }

    public void setScreen1AndRelation(List<RelationTable> screen1AndRelation) {
        this.screen1AndRelation = screen1AndRelation;
    }

    public KYCScreen2 getScreen1AndScreen2() {
        return screen1AndScreen2;
    }

    public void setScreen1AndScreen2(KYCScreen2 screen1AndScreen2) {
        this.screen1AndScreen2 = screen1AndScreen2;
    }

    public KYCScreen3 getScreen1AndScreen3() {
        return screen1AndScreen3;
    }

    public void setScreen1AndScreen3(KYCScreen3 screen1AndScreen3) {
        this.screen1AndScreen3 = screen1AndScreen3;
    }

    public KYCScreen4 getScreen1AndScreen4() {
        return screen1AndScreen4;
    }

    public void setScreen1AndScreen4(KYCScreen4 screen1AndScreen4) {
        this.screen1AndScreen4 = screen1AndScreen4;
    }

    public KYCScreen5 getScreen1AndScreen5() {
        return screen1AndScreen5;
    }

    public void setScreen1AndScreen5(KYCScreen5 screen1AndScreen5) {
        this.screen1AndScreen5 = screen1AndScreen5;
    }

    public KYCScreen6 getScreen1AndScreen6() {
        return screen1AndScreen6;
    }

    public void setScreen1AndScreen6(KYCScreen6 screen1AndScreen6) {
        this.screen1AndScreen6 = screen1AndScreen6;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getToken1() {
        return token1;
    }

    public void setToken1(String token1) {
        this.token1 = token1;
    }

    public String getToken2() {
        return token2;
    }

    public void setToken2(String token2) {
        this.token2 = token2;
    }

    public String getToken3() {
        return token3;
    }

    public void setToken3(String token3) {
        this.token3 = token3;
    }

    public String getToken4() {
        return token4;
    }

    public void setToken4(String token4) {
        this.token4 = token4;
    }

    public String getToken5() {
        return token5;
    }

    public void setToken5(String token5) {
        this.token5 = token5;
    }
}
