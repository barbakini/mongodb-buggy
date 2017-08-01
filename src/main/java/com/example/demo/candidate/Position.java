package com.example.demo.candidate;

import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

/**
 * Created by barbakini on 7.03.2017.
 */
@Data
public class Position {

    private String _id;

    private String positionId;

    @ReadOnlyProperty
    private String positionText;

    private String levelId;

    @ReadOnlyProperty
    private String levelText;

    private String workingTypeId;

    @ReadOnlyProperty
    private String workingTypeText;

    private String salaryTypeId;

    @ReadOnlyProperty
    private String salaryTypeText;

    private String currencyId;

    @ReadOnlyProperty
    private String currencyText;

    private Double salary;


}
