package com.test.joins.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "KYCSCREEN3")
public class KYCScreen3 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SEQNO3")
    private long seqNo;

    @Column(name = "BORNINUS")
    private String bornInUs;

    @Column(name = "USCITIZEN")
    private String usCitizen;

    @Column(name = "TAXRESIDENCEHOMECOUNTRY")
    private String taxResidencyHomeCountry;

    @Column(name = "HOLDUSRESIDENCY")
    private String holdUsResidency;

    @Column(name = "OTHERNATIONALITY")
    private String otherNationality;

    @OneToMany(mappedBy = "screen3AndHomeCountryDetail", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<HomeCountryDetails> screen3AndHomeCountryDetail;

    @OneToMany(mappedBy = "screen3AndOtherNationality", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OtherNationality> screen3AndOtherNationality;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CIF")
    @JsonIgnore
    private KYCScreen1 screen1AndScreen3;

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

    public String getBornInUs() {
        return bornInUs;
    }

    public void setBornInUs(String bornInUs) {
        this.bornInUs = bornInUs;
    }

    public String getUsCitizen() {
        return usCitizen;
    }

    public void setUsCitizen(String usCitizen) {
        this.usCitizen = usCitizen;
    }

    public String getTaxResidencyHomeCountry() {
        return taxResidencyHomeCountry;
    }

    public void setTaxResidencyHomeCountry(String taxResidencyHomeCountry) {
        this.taxResidencyHomeCountry = taxResidencyHomeCountry;
    }

    public String getHoldUsResidency() {
        return holdUsResidency;
    }

    public void setHoldUsResidency(String holdUsResidency) {
        this.holdUsResidency = holdUsResidency;
    }

    public String getOtherNationality() {
        return otherNationality;
    }

    public void setOtherNationality(String otherNationality) {
        this.otherNationality = otherNationality;
    }

    public List<HomeCountryDetails> getScreen3AndHomeCountryDetail() {
        return screen3AndHomeCountryDetail;
    }

    public void setScreen3AndHomeCountryDetail(List<HomeCountryDetails> screen3AndHomeCountryDetail) {
        this.screen3AndHomeCountryDetail = screen3AndHomeCountryDetail;
    }

    public List<OtherNationality> getScreen3AndOtherNationality() {
        return screen3AndOtherNationality;
    }

    public void setScreen3AndOtherNationality(List<OtherNationality> screen3AndOtherNationality) {
        this.screen3AndOtherNationality = screen3AndOtherNationality;
    }

    public KYCScreen1 getScreen1AndScreen3() {
        return screen1AndScreen3;
    }

    public void setScreen1AndScreen3(KYCScreen1 screen1AndScreen3) {
        this.screen1AndScreen3 = screen1AndScreen3;
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
