package com.example.demo.candidate;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by barbakini on 6.03.2017.
 */
@Data
public class Certificate extends CandidateInfo {

    @NotNull
    private String certificateId;

    @ReadOnlyProperty
    private String certificateText;

    @NotNull
    private String companyId;

    @ReadOnlyProperty
    private String companyText;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date date;

    @Size(min = 1, max = 100)
    private String description;

    @ReadOnlyProperty
    private String fileName;

    private Double metaScore;

    private boolean confirmed;

}
