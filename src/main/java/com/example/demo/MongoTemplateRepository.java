package com.example.demo;


import com.example.demo.candidate.Candidate;

/**
 * Created by barbakini on 3.03.2017.
 */
public interface MongoTemplateRepository {

    Candidate getValuesArray(String candidateId, String containerName);


}
