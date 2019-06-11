package com.test.joins.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.test.joins.Entity.*;
import com.test.joins.dao.Dao;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    Dao dao;

    String cif = "1495489";

    ObjectMapper mapper = new ObjectMapper();

    @RequestMapping(value = "get/screen1", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public String getScreen1(@RequestParam String cif) throws JsonProcessingException, ParseException {
        KYCScreen1POJO kycScreen1 = dao.getInitialDetails(cif);
        if (kycScreen1!=null) {
            return mapper.writeValueAsString(kycScreen1);
        }
        return null;
    }

    @RequestMapping(value = "/add/screen1", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public String addScreen1(@RequestParam String screen1) throws IOException {
            JSONObject jsonObject = new ObjectMapper().readValue(screen1, JSONObject.class);
            JSONArray tableList = jsonObject.getJSONArray("relation");
            KYCScreen1 kycScreen1 = new Gson().fromJson(mapper.writeValueAsString(jsonObject), KYCScreen1.class);
            if (kycScreen1.getStep()==null){
                kycScreen1.setStep("1");
            }
            List<RelationTable> list = new ArrayList<>();
            for (Object table : tableList) {
                JSONObject obj = (JSONObject) table;
                RelationTable relationTable = new ObjectMapper().readValue(mapper.writeValueAsString(obj), RelationTable.class);
                relationTable.setScreen1AndRelation(kycScreen1);
                list.add(relationTable);
            }
            kycScreen1.setScreen1AndRelation(list);
            kycScreen1.setCif(cif);
        dao.save(kycScreen1);
        return mapper.writeValueAsString(dao.findById(cif).getScreen1AndScreen2());
    }

    @RequestMapping(value = "/add/screen2", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public String addScreen2(@RequestParam String screen2) throws IOException {
        JSONObject jsonObject = new ObjectMapper().readValue(screen2, JSONObject.class);
        KYCScreen2 kycScreen2 = new Gson().fromJson(mapper.writeValueAsString(jsonObject), KYCScreen2.class);
            KYCScreen1 kycScreen1 = dao.findById(cif);
        System.out.println("RESULT = "+mapper.writeValueAsString(kycScreen1));
            if (kycScreen1!=null) {
                kycScreen2.setScreen1AndScreen2(kycScreen1);
                kycScreen1.setScreen1AndScreen2(kycScreen2);
                if (Integer.parseInt(kycScreen1.getStep()) < 2) {
                    kycScreen1.setStep("2");
                }
                dao.save(kycScreen1);
                return mapper.writeValueAsString(kycScreen1.getScreen1AndScreen3());
            }
            return null;
    }

    @RequestMapping(value = "/add/screen3", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public String addScreen3(@RequestParam String screen3) throws IOException {
        JSONObject jsonObject = new ObjectMapper().readValue(screen3, JSONObject.class);
        KYCScreen3 kycScreen3 = new Gson().fromJson(mapper.writeValueAsString(jsonObject), KYCScreen3.class);
        JSONArray screen3AndHomeCountryDetail = jsonObject.getJSONArray("screen3AndHomeCountryDetail");
        JSONArray screen3AndOtherNationality = jsonObject.getJSONArray("screen3AndOtherNationality");

        List<HomeCountryDetails> list = new ArrayList<>();
        for (Object table : screen3AndHomeCountryDetail){
            JSONObject obj = (JSONObject) table;
            HomeCountryDetails homeCountryDetails = new ObjectMapper().readValue(mapper.writeValueAsString(obj), HomeCountryDetails.class);
            homeCountryDetails.setScreen3AndHomeCountryDetail(kycScreen3);
            list.add(homeCountryDetails);
        }
        kycScreen3.setScreen3AndHomeCountryDetail(list);

        List<OtherNationality> list1 = new ArrayList<>();
        for (Object table : screen3AndOtherNationality){
            JSONObject obj = (JSONObject) table;
            OtherNationality otherNationality = new ObjectMapper().readValue(mapper.writeValueAsString(obj), OtherNationality.class);
            otherNationality.setScreen3AndOtherNationality(kycScreen3);
            list1.add(otherNationality);
        }
        kycScreen3.setScreen3AndOtherNationality(list1);

        KYCScreen1 kycScreen1 = dao.findById(cif);
        if (kycScreen1!=null) {
            kycScreen3.setScreen1AndScreen3(kycScreen1);
            kycScreen1.setScreen1AndScreen3(kycScreen3);
            if (Integer.parseInt(kycScreen1.getStep())<3){
                kycScreen1.setStep("3");
            }
            dao.save(kycScreen1);
            return mapper.writeValueAsString(kycScreen1.getScreen1AndScreen4());
        }
        return  null;
    }

    @RequestMapping(value = "/add/screen4", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public String addScreen4(@RequestParam String screen4) throws IOException {
        JSONObject jsonObject = new ObjectMapper().readValue(screen4, JSONObject.class);
        KYCScreen4 kycScreen4 = new Gson().fromJson(mapper.writeValueAsString(jsonObject), KYCScreen4.class);
        KYCScreen1 kycScreen1 = dao.findById(cif);
        System.out.println(mapper.writeValueAsString(kycScreen1));
        if (kycScreen1!=null) {
            kycScreen4.setScreen1AndScreen4(kycScreen1);
            kycScreen1.setScreen1AndScreen4(kycScreen4);
            if (Integer.parseInt(kycScreen1.getStep())<4){
                kycScreen1.setStep("4");
            }
            dao.save(kycScreen1);
            return mapper.writeValueAsString(kycScreen1.getScreen1AndScreen5());
        }
        return  null;
    }

    @RequestMapping(value = "/add/screen5", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public String addScreen5(@RequestParam String screen5) throws IOException {
        JSONObject jsonObject = new ObjectMapper().readValue(screen5, JSONObject.class);
        KYCScreen5 kycScreen5 = new Gson().fromJson(mapper.writeValueAsString(jsonObject), KYCScreen5.class);
        KYCScreen1 kycScreen1 = dao.findById(cif);
        if (kycScreen1!=null) {
            kycScreen5.setScreen1AndScreen5(kycScreen1);
            kycScreen1.setScreen1AndScreen5(kycScreen5);
            if (Integer.parseInt(kycScreen1.getStep())<5){
                kycScreen1.setStep("5");
            }
            dao.save(kycScreen1);
            return mapper.writeValueAsString(kycScreen1.getScreen1AndScreen6());
        }
        return  null;
    }
}
