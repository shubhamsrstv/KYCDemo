package com.test.joins.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "HOMECOUNTRYDETAILS")
public class HomeCountryDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SEQNOHCD")
    private long seqNo;

    @Column(name = "TAXIDNUMBER")
    private String taxIdNumber;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "REASONCODE")
    private String reasonCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SEQNO")
    @JsonIgnore
    private KYCScreen3 screen3AndHomeCountryDetail;

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

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public void setTaxIdNumber(String taxIdNumber) {
        this.taxIdNumber = taxIdNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public KYCScreen3 getScreen3AndHomeCountryDetail() {
        return screen3AndHomeCountryDetail;
    }

    public void setScreen3AndHomeCountryDetail(KYCScreen3 screen3AndHomeCountryDetail) {
        this.screen3AndHomeCountryDetail = screen3AndHomeCountryDetail;
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
