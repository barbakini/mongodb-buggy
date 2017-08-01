package com.example.demo;


import com.example.demo.candidate.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by barbakini on 3.03.2017.
 */
@Repository
public class CandidateRepositoryImpl implements MongoTemplateRepository {

    @Autowired
    private MongoTemplate mongoTemplate;




    @Override
    public Candidate getValuesArray(String candidateId, String containerName) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(candidateId));
        query.fields().include(containerName);
        return mongoTemplate.findOne(query, Candidate.class);
    }

}
