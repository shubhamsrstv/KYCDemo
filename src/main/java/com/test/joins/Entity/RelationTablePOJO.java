package com.test.joins.Entity;

import java.util.Date;

public class RelationTablePOJO {

    private long seqNo;
    private String relationType;
    private String idType;
    private String idNumber;
    private String relativeCIF;
    private Date idExpiry;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String nationality;
    private String amlScore;

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
}
