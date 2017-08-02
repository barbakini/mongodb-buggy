package com.example.demo.converter;

import com.example.demo.domain.Candidate;
import com.mongodb.DBObject;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

@ReadingConverter
public class CandidateConverter implements Converter<DBObject, Candidate> {


    @Override
    public Candidate convert(DBObject dbObject) {
        Candidate candidate = new Candidate();/*
        domain.set_id((String) dbObject.get("_id"));
        domain.setGeneralInfo(new GeneralInfo());
        DBObject generalInfo = (DBObject) dbObject.get("generalInfo");
        domain.getGeneralInfo().setName((String) generalInfo.get("name"));
        domain.getGeneralInfo().setSurname((String) generalInfo.get("surname"));
        domain.getGeneralInfo().setBirthDate((Date) generalInfo.get("birthDate"));*/
        return candidate;
    }
}
