package com.example.demo.candidate;

import lombok.Data;

import javax.validation.Valid;

/**
 * Created by barbakini on 7.03.2017.
 */
@Data
public class Experience extends CandidateInfo {

    @Valid
    private ExpMain expMain;

    @Valid
    private Position position;

    @Valid
    private CandidateInfoContainer<Responsibility> responsibilities;

    @Valid
    private CandidateInfoContainer<CandSkill> skills;

    @Valid
    private CandidateInfoContainer<Reference> references;

    @Valid
    private CandidateInfoContainer<Project> projects;

    @Valid
    private CandidateInfoContainer<FreeTextModel> description;

}
