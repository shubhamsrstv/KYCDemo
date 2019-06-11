package com.test.joins.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "KYCSCREEN5")
public class KYCScreen5 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SEQNO5")
    private long seqNo;

    @Column(name = "EMPLOYEENAME")
    private String employeeName;

    @Column(name = "NATUREOFBUSINESS")
    private String natureOfBusiness;

    @Column(name = "PROFESSION")
    private String profession;

    @Column(name = "PROFESSIONNAME")
    private String professionName;

    @Column(name = "SALARYTYPE")
    private String salaryType;

    @Column(name = "SALARYAMOUNT")
    private String salaryAmount;

    @Column(name = "ALLOWANCETYPE")
    private String allowanceType;

    @Column(name = "ALLOWANCEAMOUNT")
    private String allowanceAmount;

    @Column(name = "OTHERINCOMETYPE")
    private String otherIncomeType;

    @Column(name = "OTHERINCOMEAMOUNT")
    private String otherIncomeAmount;

    @Column(name = "OTHERJOB")
    private String otherJob;

    @Column(name = "OTHERJOBAMOUNT")
    private String otherJobAmount;

    @Column(name = "PURPOSEOFACCOUNTOPENING")
    private String purposeOfAccountOpening;

    @Column(name = "NATUREOFTXN")
    private String natureOfTxn;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CIF")
    @JsonIgnore
    private KYCScreen1 screen1AndScreen5;

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

    public long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(long seqNo) {
        this.seqNo = seqNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getNatureOfBusiness() {
        return natureOfBusiness;
    }

    public void setNatureOfBusiness(String natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    public String getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(String salaryType) {
        this.salaryType = salaryType;
    }

    public String getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(String salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public String getAllowanceType() {
        return allowanceType;
    }

    public void setAllowanceType(String allowanceType) {
        this.allowanceType = allowanceType;
    }

    public String getAllowanceAmount() {
        return allowanceAmount;
    }

    public void setAllowanceAmount(String allowanceAmount) {
        this.allowanceAmount = allowanceAmount;
    }

    public String getOtherIncomeType() {
        return otherIncomeType;
    }

    public void setOtherIncomeType(String otherIncomeType) {
        this.otherIncomeType = otherIncomeType;
    }

    public String getOtherIncomeAmount() {
        return otherIncomeAmount;
    }

    public void setOtherIncomeAmount(String otherIncomeAmount) {
        this.otherIncomeAmount = otherIncomeAmount;
    }

    public String getOtherJob() {
        return otherJob;
    }

    public void setOtherJob(String otherJob) {
        this.otherJob = otherJob;
    }

    public String getOtherJobAmount() {
        return otherJobAmount;
    }

    public void setOtherJobAmount(String otherJobAmount) {
        this.otherJobAmount = otherJobAmount;
    }

    public String getPurposeOfAccountOpening() {
        return purposeOfAccountOpening;
    }

    public void setPurposeOfAccountOpening(String purposeOfAccountOpening) {
        this.purposeOfAccountOpening = purposeOfAccountOpening;
    }

    public String getNatureOfTxn() {
        return natureOfTxn;
    }

    public void setNatureOfTxn(String natureOfTxn) {
        this.natureOfTxn = natureOfTxn;
    }

    public KYCScreen1 getScreen1AndScreen5() {
        return screen1AndScreen5;
    }

    public void setScreen1AndScreen5(KYCScreen1 screen1AndScreen5) {
        this.screen1AndScreen5 = screen1AndScreen5;
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
