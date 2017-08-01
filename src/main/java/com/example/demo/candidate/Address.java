package com.example.demo.candidate;

import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by barbakini on 6.03.2017.
 */
@Data
public class Address extends CandidateInfo {

    @NotNull
    private String locationId;

    @ReadOnlyProperty
    private List<String> locationTexts;

    @Size(min = 2, max = 2)
    private List<Double> coordinates;

    @NotNull
    private String addressText;

    private boolean primary;

    private boolean confirmed;
}
