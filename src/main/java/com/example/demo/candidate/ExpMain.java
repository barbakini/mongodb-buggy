package com.example.demo.candidate;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import java.util.Date;
import java.util.List;

/**
 * Created by barbakini on 7.03.2017.
 */
@Data
public class ExpMain {

    private String _id;

    private String companyId;

    @ReadOnlyProperty
    private String companyText;

    private String sectorId;

    @ReadOnlyProperty
    private String sectorText;

    private String locationId;

    @ReadOnlyProperty
    private List<String> locationTexts;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date finishDate;

    private boolean stillWorking;

    private String leaveReasonId;

    @ReadOnlyProperty
    private String leaveReasonText;

    private String departmentId;

    @ReadOnlyProperty
    private String departmentText;

}
