package com.example.demo.candidate;

import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import javax.validation.constraints.NotNull;

/**
 * Created by barbakini on 7.03.2017.
 */
@Data
public class Handicap {

    private String _id;

    @NotNull
    private String handicapId;

    @ReadOnlyProperty
    private String handicapText;

    private String description;

    private boolean confirmed;

}
