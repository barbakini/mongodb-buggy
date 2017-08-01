package com.example.demo.candidate;

import lombok.Data;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by barbakini on 7.03.2017.
 */
@Data
public class Preference {
    private String _id;

    @Valid
    private List<DetailedData> locations;

    @Valid
    private List<DetailedData> positions;

    @Valid
    private List<DetailedData> levels;

    @Valid
    private List<DetailedData> responsibilities;

    @Valid
    private List<DetailedData> sectors;

    @Valid
    private List<DetailedData> departments;

    @Valid
    private List<DetailedData> workingTypes;

}