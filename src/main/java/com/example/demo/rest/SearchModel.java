package com.example.demo.rest;

import lombok.Data;

/**
 * Created by barbakini on 20.03.2017.
 */
@Data
public class SearchModel {

    private String searchText;

    private String type;

    private String parentId;

    private String countryId;

}
