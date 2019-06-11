package com.test.joins.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "KYCSCREEN2")
public class KYCScreen2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SEQNO2")
    private long seqNo;

    @Column(name = "COUNTRYCODE")
    private String countryCode;

    @Column(name = "PHONENUMBER")
    private String phoneNumber;

    @Column(name = "RESIDENCEPHONE")
    private String residencePhone;

    @Column(name = "ADDRESSTYPE")
    private String addressType;

    @Column(name = "ADDRESSCOUNTRY")
    private String addressCountry;

    @Column(name = "AREANAME")
    private String areaName;

    @Column(name = "BLOCK")
    private String block;

    @Column(name = "Street")
    private String street;

    @Column(name = "JADA")
    private String jada;

    @Column(name = "BUILDINGNUMBER")
    private String buildingNumber;

    @Column(name = "FLAT")
    private String flat;

    @Column(name = "FLOOR")
    private String floor;

    @Column(name = "ADDRESS1")
    private String address1;

    @Column(name = "ADDRESS2")
    private String address2;

    @Column(name = "ADDRESS3")
    private String address3;

    @Column(name = "RESIDENCYCOUNTRYHOME")
    private String residencyCountryHome;

    @Column(name = "HOMEADDRESS1")
    private String homeAddress1;

    @Column(name = "HOMEADDRESS2")
    private String homeAddress2;

    @Column(name = "HOMEADDRESS3")
    private String homeAddress3;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CIF")
    @JsonIgnore
    private KYCScreen1 screen1AndScreen2;

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

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getResidencePhone() {
        return residencePhone;
    }

    public void setResidencePhone(String residencePhone) {
        this.residencePhone = residencePhone;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getJada() {
        return jada;
    }

    public void setJada(String jada) {
        this.jada = jada;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getResidencyCountryHome() {
        return residencyCountryHome;
    }

    public void setResidencyCountryHome(String residencyCountryHome) {
        this.residencyCountryHome = residencyCountryHome;
    }

    public String getHomeAddress1() {
        return homeAddress1;
    }

    public void setHomeAddress1(String homeAddress1) {
        this.homeAddress1 = homeAddress1;
    }

    public String getHomeAddress2() {
        return homeAddress2;
    }

    public void setHomeAddress2(String homeAddress2) {
        this.homeAddress2 = homeAddress2;
    }

    public String getHomeAddress3() {
        return homeAddress3;
    }

    public void setHomeAddress3(String homeAddress3) {
        this.homeAddress3 = homeAddress3;
    }

    public KYCScreen1 getScreen1AndScreen2() {
        return screen1AndScreen2;
    }

    public void setScreen1AndScreen2(KYCScreen1 screen1AndScreen2) {
        this.screen1AndScreen2 = screen1AndScreen2;
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
