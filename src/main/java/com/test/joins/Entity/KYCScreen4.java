package com.test.joins.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "KYCSCREEN4")
public class KYCScreen4 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SEQNO4")
    private long seqNo;

    @Column(name = "PROVIDEDPOWEROFATTORNEY")
    private String providedPowerOfAttorney;

    @Column(name = "ATTORNEYNAME")
    private String attorneyName;

    @Column(name = "ISJOINACCOUNT")
    private String isJoinAccount;

    @Column(name = "ACCOUNTNUMBER")
    private String accountNumber;

    @Column(name = "ACCOUNTHOLDERNAME")
    private String accountHolderName;

    @Column(name = "isPARTNERCOMPANY")
    private String isPartnerCompany;

    @Column(name = "STANDINGORDER")
    private String standingOrder;

    @Column(name = "COUNTRY1")
    private String country1;

    @Column(name = "COUNTRY2")
    private String country2;

    @Column(name = "ISPOLITICSRELATED")
    private String isPoliticsRelated;

    @Column(name = "RELATIONTYPE")
    private String relationType;

    @Column(name = "RELATIONNAME")
    private String relationName;

    @Column(name = "PEPTYPE")
    private String pepType;

    @Column(name = "RELATIVEPOLITICS")
    private String relativePolitics;

    @Column(name = "RELATIVERELATIONTYPE")
    private String relativeRelationType;

    @Column(name = "RELATIVERELATIONNAME")
    private String relativeRelationName;

    @Column(name = "RELATIVEPEPTYPE")
    private String relativePepType;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CIF")
    @JsonIgnore
    private KYCScreen1 screen1AndScreen4;

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

    public String getProvidedPowerOfAttorney() {
        return providedPowerOfAttorney;
    }

    public void setProvidedPowerOfAttorney(String providedPowerOfAttorney) {
        this.providedPowerOfAttorney = providedPowerOfAttorney;
    }

    public String getAttorneyName() {
        return attorneyName;
    }

    public void setAttorneyName(String attorneyName) {
        this.attorneyName = attorneyName;
    }

    public String getIsJoinAccount() {
        return isJoinAccount;
    }

    public void setIsJoinAccount(String isJoinAccount) {
        this.isJoinAccount = isJoinAccount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getIsPartnerCompany() {
        return isPartnerCompany;
    }

    public void setIsPartnerCompany(String isPartnerCompany) {
        this.isPartnerCompany = isPartnerCompany;
    }

    public String getStandingOrder() {
        return standingOrder;
    }

    public void setStandingOrder(String standingOrder) {
        this.standingOrder = standingOrder;
    }

    public String getCountry1() {
        return country1;
    }

    public void setCountry1(String country1) {
        this.country1 = country1;
    }

    public String getCountry2() {
        return country2;
    }

    public void setCountry2(String country2) {
        this.country2 = country2;
    }

    public String getIsPoliticsRelated() {
        return isPoliticsRelated;
    }

    public void setIsPoliticsRelated(String isPoliticsRelated) {
        this.isPoliticsRelated = isPoliticsRelated;
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName;
    }

    public String getPepType() {
        return pepType;
    }

    public void setPepType(String pepType) {
        this.pepType = pepType;
    }

    public String getRelativePolitics() {
        return relativePolitics;
    }

    public void setRelativePolitics(String relativePolitics) {
        this.relativePolitics = relativePolitics;
    }

    public String getRelativeRelationType() {
        return relativeRelationType;
    }

    public void setRelativeRelationType(String relativeRelationType) {
        this.relativeRelationType = relativeRelationType;
    }

    public String getRelativeRelationName() {
        return relativeRelationName;
    }

    public void setRelativeRelationName(String relativeRelationName) {
        this.relativeRelationName = relativeRelationName;
    }

    public String getRelativePepType() {
        return relativePepType;
    }

    public void setRelativePepType(String relativePepType) {
        this.relativePepType = relativePepType;
    }

    public KYCScreen1 getScreen1AndScreen4() {
        return screen1AndScreen4;
    }

    public void setScreen1AndScreen4(KYCScreen1 screen1AndScreen4) {
        this.screen1AndScreen4 = screen1AndScreen4;
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
