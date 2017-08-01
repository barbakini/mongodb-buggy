package com.example.demo.candidate;

import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by barbakini on 7.03.2017.
 */
@Data
public class Reference extends CandidateInfo {

    @NotNull
    private String fullName;

    private String positionId;

    @ReadOnlyProperty
    private String positionText;

    private String relationId;

    @ReadOnlyProperty
    private String relationText;

    @Pattern(regexp = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", message = "enter a well-formatted email address")
    private String email;

    private String phone;

    private String referenceId;

}
