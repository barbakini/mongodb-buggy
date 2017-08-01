package com.example.demo.candidate;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by barbakini on 3.03.2017.
 */
@Data
public class GeneralInfo {

    private String _id;

    @NotNull
    @Size(min = 2, max = 100)
    private String name;

    @NotNull
    @Size(min = 2, max = 100)
    private String surname;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date birthDate;

    @NotNull
    private String gender;

    @ReadOnlyProperty
    private String genderText;

    @NotNull
    private String maritualStatus;

    @ReadOnlyProperty
    private String maritualStatusText;

    private int commentCount = 0;

}
