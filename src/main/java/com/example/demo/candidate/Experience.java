package com.example.demo.candidate;

import lombok.Data;

import javax.validation.Valid;

/**
 * Created by barbakini on 7.03.2017.
 */
@Data
public class Experience extends CandidateInfo {

    @Valid
    private CandidateInfoContainer<Responsibility> responsibilities;

}
