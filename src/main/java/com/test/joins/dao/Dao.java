package com.test.joins.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.test.joins.Entity.KYCScreen1;
import com.test.joins.Entity.KYCScreen1POJO;

import java.text.ParseException;

public interface Dao {

    KYCScreen1 findById(String cif) throws JsonProcessingException;
    void save(KYCScreen1 kycScreen1);
    KYCScreen1POJO getInitialDetails(String cif) throws ParseException;
}
