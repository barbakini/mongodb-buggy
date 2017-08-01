package com.example.demo.candidate;

import lombok.Data;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by barbakini on 3.03.2017.
 */
@Data
public class CandidateInfoContainer<E extends CandidateInfo> {

    private String _id;

    private int commentCount = 0;

    @Valid
    private List<E> values = new ArrayList<>();

}
