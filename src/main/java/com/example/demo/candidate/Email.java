package com.example.demo.candidate;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by barbakini on 6.03.2017.
 */
@Data
public class Email extends CandidateInfo {

    @NotNull
    @Pattern(regexp = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", message = "enter a well-formatted email address")
    private String email;

    private boolean primary;

    private boolean validated;

    private boolean errorOccurred;

    private boolean confirmed;

}
