package com.example.demo.candidate;

import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by barbakini on 5.03.2017.
 */
@Data
public class CandLanguage extends CandidateInfo {

    @NotNull
    private String languageId;

    @ReadOnlyProperty
    private String languageText;

    @NotNull
    private String placeId;

    @ReadOnlyProperty
    private String placeText;

    @NotNull
    @Min(1)
    @Max(5)
    private Integer reading;

    @NotNull
    @Min(1)
    @Max(5)
    private Integer writing;

    @NotNull
    @Min(1)
    @Max(5)
    private Integer speaking;

    private String companyId;

    @ReadOnlyProperty
    private String companyText;

    @ReadOnlyProperty
    private String fileName;

    private Double metaScore;

    private boolean confirmed;

}
