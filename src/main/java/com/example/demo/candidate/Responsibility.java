package com.example.demo.candidate;

import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import javax.validation.constraints.NotNull;

/**
 * Created by barbakini on 7.03.2017.
 */
@Data
public class Responsibility extends CandidateInfo {

    @NotNull
    private String responsibilityId;

    @ReadOnlyProperty
    private String responsibilityText;

}
