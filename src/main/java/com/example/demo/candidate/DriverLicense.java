package com.example.demo.candidate;

import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import javax.validation.constraints.NotNull;

/**
 * Created by barbakini on 6.03.2017.
 */
@Data
public class
DriverLicense extends CandidateInfo {

    @NotNull
    private String countryId;

    @ReadOnlyProperty
    private String countryText;

    @NotNull
    private String typeId;

    @ReadOnlyProperty
    private String typeText;

    private Integer year;

    private boolean active;

    private Double metaScore;

    private boolean confirmed;

}
