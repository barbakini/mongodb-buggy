package com.example.demo.converter;

import com.example.demo.candidate.Candidate;
import com.mongodb.DBObject;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

@ReadingConverter
public class CandidateConverter implements Converter<DBObject, Candidate> {


    @Override
    public Candidate convert(DBObject dbObject) {
        Candidate candidate = new Candidate();/*
        candidate.set_id((String) dbObject.get("_id"));
        candidate.setGeneralInfo(new GeneralInfo());
        DBObject generalInfo = (DBObject) dbObject.get("generalInfo");
        candidate.getGeneralInfo().setName((String) generalInfo.get("name"));
        candidate.getGeneralInfo().setSurname((String) generalInfo.get("surname"));
        candidate.getGeneralInfo().setBirthDate((Date) generalInfo.get("birthDate"));*/
        return candidate;
    }
}
