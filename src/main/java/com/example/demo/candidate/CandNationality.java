package com.example.demo.candidate;

import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import javax.validation.constraints.NotNull;

/**
 * Created by barbakini on 3.03.2017.
 */
@Data
public class CandNationality extends CandidateInfo {

    @NotNull
    private String nationId;

    @ReadOnlyProperty
    private String nationText;

    @NotNull
    private String citizenNumber;

    private boolean confirmed;

}

