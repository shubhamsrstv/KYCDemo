package com.test.joins.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "KYCSCREEN6")
public class KYCScreen6 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SEQNO6")
    private long seqNo;

    @Column(name = "CIVILIDFRONT", columnDefinition = "MEDIUMBLOB")
    private byte[] civilIdFront;

    @Column(name = "CIVILIDBACK", columnDefinition = "MEDIUMBLOB")
    private byte[] civilIdBack;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CIF")
    @JsonIgnore
    private KYCScreen1 screen1AndScreen6;

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

    public byte[] getCivilIdFront() {
        return civilIdFront;
    }

    public void setCivilIdFront(byte[] civilIdFront) {
        this.civilIdFront = civilIdFront;
    }

    public byte[] getCivilIdBack() {
        return civilIdBack;
    }

    public void setCivilIdBack(byte[] civilIdBack) {
        this.civilIdBack = civilIdBack;
    }

    public KYCScreen1 getScreen1AndScreen6() {
        return screen1AndScreen6;
    }

    public void setScreen1AndScreen6(KYCScreen1 screen1AndScreen6) {
        this.screen1AndScreen6 = screen1AndScreen6;
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
