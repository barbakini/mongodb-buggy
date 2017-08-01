package com.example.demo.candidate;

import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import javax.validation.constraints.NotNull;

/**
 * Created by barbakini on 6.03.2017.
 */
@Data
public class Phone extends CandidateInfo {

    @NotNull
    private String countryId;

    @ReadOnlyProperty
    private String countryText;

    @NotNull
    private String phoneNumber;

    private PhoneType type;

    private boolean primary;

    private boolean validated;

    private boolean errorOccurred;

    private boolean confirmed;

}
