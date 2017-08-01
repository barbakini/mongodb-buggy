package com.example.demo.candidate;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by barbakini on 19.06.2017.
 */
@Data
public class CvPoolInfo {

    private boolean hidden;

    private List<String> companies = new ArrayList<>();

    private List<String> hrUsers = new ArrayList<>();
}
