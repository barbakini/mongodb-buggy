package com.example.demo.candidate;

import lombok.Data;

import java.util.List;

/**
 * Created by muhammed on 21.6.2017.
 */
@Data
public class OtherInfo {

    private String _id;

    private int commentCount = 0;

    private BloodType bloodType;

    private boolean smoking;

    private boolean travellable;

    private List<DetailedData> hobbies;

    private List<DetailedData> memberships;


}
