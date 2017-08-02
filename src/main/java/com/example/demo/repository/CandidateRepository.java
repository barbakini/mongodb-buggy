package com.example.demo.repository;

import com.example.demo.domain.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by barbakini on 3.03.2017.
 */
@Repository
public interface CandidateRepository extends MongoRepository<Candidate, String> {
}
