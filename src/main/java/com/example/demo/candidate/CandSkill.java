package com.example.demo.candidate;

import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by barbakini on 3.03.2017.
 */
@Data
public class CandSkill extends CandidateInfo {

    @NotNull
    private String skillId;

    @ReadOnlyProperty
    private String skillText;

    @NotNull
    @Min(1)
    @Max(10)
    private Integer level = 1;

    @ReadOnlyProperty
    private String fileName;

    private Double metaScore;

    private boolean confirmed;

}
