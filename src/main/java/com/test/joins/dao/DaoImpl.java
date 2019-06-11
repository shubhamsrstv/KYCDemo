package com.test.joins.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.joins.Entity.KYCScreen1;
import com.test.joins.Entity.KYCScreen1POJO;
import com.test.joins.Entity.RelationTable;
import com.test.joins.Entity.RelationTablePOJO;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Repository("dao")
public class DaoImpl implements Dao {

    @Autowired
    private SessionFactory sessionFactory;

    ObjectMapper mapper = new ObjectMapper();

    @Override
    @Transactional(rollbackFor = Exception.class)
    public KYCScreen1 findById(String cif) throws JsonProcessingException {
        Session session = sessionFactory.getCurrentSession();
        Criteria cr= session.createCriteria(KYCScreen1.class);
        cr.add(Restrictions.eq("cif", cif));
        KYCScreen1 kycScreen1 = (KYCScreen1) cr.uniqueResult();
        System.out.println("RESULT = "+mapper.writeValueAsString(kycScreen1));
        if (kycScreen1!=null){
            return kycScreen1;
        }
        else{
            return null;
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(KYCScreen1 kycScreen1) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(kycScreen1);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public KYCScreen1POJO getInitialDetails(String cif) throws ParseException {
        Session session = sessionFactory.getCurrentSession();
        Criteria cr= session.createCriteria(KYCScreen1.class);
        cr.add(Restrictions.eq("cif", cif));
        KYCScreen1 kycScreen1 = (KYCScreen1) cr.uniqueResult();
        KYCScreen1POJO pojo = new KYCScreen1POJO();
        if (kycScreen1!=null) {
            pojo.setIdType(kycScreen1.getIdType());
            pojo.setIdNumber(kycScreen1.getIdNumber());
            pojo.setFirstName(kycScreen1.getFirstName());
            pojo.setLastName(kycScreen1.getLastName());
            pojo.setNationality(kycScreen1.getNationality());
            pojo.setIdExpiryDate(kycScreen1.getIdExpiryDate());
            pojo.setCustomerNameOnPassport(kycScreen1.getCustomerNameOnPassport());
            pojo.setGender(kycScreen1.getGender());
            pojo.setDateOfBirth(kycScreen1.getDateOfBirth());
            pojo.setMaritalStatus(kycScreen1.getMaritalStatus());
            pojo.setIsResidentOfKuwait(kycScreen1.getIsResidentOfKuwait());
            pojo.setAcademicDegree(kycScreen1.getAcademicDegree());
            pojo.setCountryOfBirth(kycScreen1.getCountryOfBirth());
            pojo.setSpecialNeeds(kycScreen1.getSpecialNeeds());
            pojo.setStep(kycScreen1.getStep());
            List<RelationTablePOJO> list = new ArrayList<>();
            for (Object obj : kycScreen1.getScreen1AndRelation()) {
                RelationTablePOJO relationTablePOJO = new RelationTablePOJO();
                RelationTable jsonObject = (RelationTable) obj;
                relationTablePOJO.setSeqNo(jsonObject.getSeqNo());
                relationTablePOJO.setRelationType(jsonObject.getRelationType());
                relationTablePOJO.setIdType(jsonObject.getIdType());
                relationTablePOJO.setIdNumber(jsonObject.getIdNumber());
                relationTablePOJO.setRelativeCIF(jsonObject.getRelativeCIF());
                relationTablePOJO.setIdExpiry(jsonObject.getIdExpiry());
                relationTablePOJO.setFirstName(jsonObject.getFirstName());
                relationTablePOJO.setLastName(jsonObject.getLastName());
                relationTablePOJO.setDateOfBirth(jsonObject.getDateOfBirth());
                relationTablePOJO.setNationality(jsonObject.getNationality());
                relationTablePOJO.setAmlScore(jsonObject.getAmlScore());

                list.add(relationTablePOJO);
            }
            pojo.setScreen1AndRelation(list);
        }

        return pojo;
    }
}
