package com.example.demo.candidate;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by barbakini on 6.03.2017.
 */
@Data
public class Travel extends CandidateInfo {

    @NotNull
    private String locationId;

    @ReadOnlyProperty
    private List<String> locationTexts;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/yyyy")
    private Date date;

}
