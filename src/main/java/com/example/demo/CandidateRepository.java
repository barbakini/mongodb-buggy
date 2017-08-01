package com.example.demo;

import com.example.demo.candidate.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by barbakini on 3.03.2017.
 */
@Repository
public interface CandidateRepository extends MongoRepository<Candidate, String> {
}
