package com.example.demo.candidate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by barbakini on 6.03.2017.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Education extends CandidateInfo {

    @NotNull
    private String countryId;

    @ReadOnlyProperty
    private String countryText;

    @NotNull
    private String levelId;

    @ReadOnlyProperty
    private String levelText;

    @NotNull
    private String schoolId;

    @ReadOnlyProperty
    private String schoolText;

    private String facultyId;

    @ReadOnlyProperty
    private String facultyText;

    private String languageId;

    @ReadOnlyProperty
    private String languageText;

    private String formalTypeId;

    @ReadOnlyProperty
    private String formalTypeText;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date finishDate;

    private String statusId;

    @ReadOnlyProperty
    private String statusText;

    private String classId;

    @ReadOnlyProperty
    private String classText;

    private String gradeSystemId;

    @ReadOnlyProperty
    private String gradeSystemText;

    private Double grade = 0.0;

    private String exchangeProgramId;

    @ReadOnlyProperty
    private String exchangeProgramText;

    private boolean doubleMajor;

    private List<DetailedData> grantors;

    @ReadOnlyProperty
    private String fileName;

    private Double metaScore;

    private boolean confirmed;

}
