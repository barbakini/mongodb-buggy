package com.example.demo.candidate;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;

/**
 * Created by barbakini on 3.03.2017.
 */

@Document
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Candidate {

    private String _id;

    @Valid
    private CandidateInfoContainer<Experience> experiences;
}
