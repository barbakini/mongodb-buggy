package com.example.demo.candidate;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by barbakini on 6.03.2017.
 */
@Data
public class MilitaryInfo {

    private String _id;

    @NotNull
    private String statusId;

    @ReadOnlyProperty
    private String statusText;

    private Integer year;

    private String exemptReasonId;

    @ReadOnlyProperty
    private String exemptReasonText;

    private boolean confirmed;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/yyyy")
    private Date postponeDate;

    private int commentCount = 0;


}
