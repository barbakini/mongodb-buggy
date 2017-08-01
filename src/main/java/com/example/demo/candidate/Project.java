package com.example.demo.candidate;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by barbakini on 7.03.2017.
 */
@Data
public class Project extends CandidateInfo {

    @NotNull
    private String name;

    private List<Responsibility> responsibilities;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date finishDate;

    @ReadOnlyProperty
    private String fileName;

}
