package com.test.joins.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RELATIONTABLE")
public class RelationTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SEQNORT")
    private long seqNo;

    @Column(name = "RELATIONTYPE")
    private String relationType;

    @Column(name = "IDTYPE")
    private String idType;

    @Column(name = "IDNUMBER")
    private String idNumber;

    @Column(name = "RELATIVECIF")
    private String relativeCIF;

    @Column(name = "IDEXPIRY")
    private Date idExpiry;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "DATEOFBIRTH")
    private Date dateOfBirth;

    @Column(name = "NATIONALITY")
    private String nationality;

    @Column(name = "AMLSCORE")
    private String amlScore;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CIF")
    @JsonIgnore
    private KYCScreen1 screen1AndRelation;

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

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
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

    public String getRelativeCIF() {
        return relativeCIF;
    }

    public void setRelativeCIF(String relativeCIF) {
        this.relativeCIF = relativeCIF;
    }

    public Date getIdExpiry() {
        return idExpiry;
    }

    public void setIdExpiry(Date idExpiry) {
        this.idExpiry = idExpiry;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAmlScore() {
        return amlScore;
    }

    public void setAmlScore(String amlScore) {
        this.amlScore = amlScore;
    }

    public KYCScreen1 getScreen1AndRelation() {
        return screen1AndRelation;
    }

    public void setScreen1AndRelation(KYCScreen1 screen1AndRelation) {
        this.screen1AndRelation = screen1AndRelation;
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
