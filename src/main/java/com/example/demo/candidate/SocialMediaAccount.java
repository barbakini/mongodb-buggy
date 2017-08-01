package com.example.demo.candidate;

import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import javax.validation.constraints.NotNull;

/**
 * Created by barbakini on 6.03.2017.
 */
@Data
public class SocialMediaAccount extends CandidateInfo {

    @NotNull
    private String mediaId;

    @ReadOnlyProperty
    private String mediaText;

    @NotNull
    private String account;

    private boolean validated;

    private boolean errorOccurred;

    private boolean confirmed;

}
