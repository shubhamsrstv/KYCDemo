package com.test.joins.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "OTHERNATIONALITY")
public class OtherNationality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SEQNOON")
    private long seqNo;

    @Column(name = "IDNUMBER")
    private String idNumber;

    @Column(name = "IDEXPIRYDATE")
    private Date idExpiryDate;

    @Column(name = "COUNTRY")
    private String country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SEQNO3")
    @JsonIgnore
    private KYCScreen3 screen3AndOtherNationality;

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

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getIdExpiryDate() {
        return idExpiryDate;
    }

    public void setIdExpiryDate(Date idExpiryDate) {
        this.idExpiryDate = idExpiryDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public KYCScreen3 getScreen3AndOtherNationality() {
        return screen3AndOtherNationality;
    }

    public void setScreen3AndOtherNationality(KYCScreen3 screen3AndOtherNationality) {
        this.screen3AndOtherNationality = screen3AndOtherNationality;
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
