package com.example.demo.candidate;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created by barbakini on 7.03.2017.
 */
@Data
public class FreeTextModel extends CandidateInfo {

    @NotNull
    private String lang;

    @NotNull
    private String preface;

}
