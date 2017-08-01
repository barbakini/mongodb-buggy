package com.example.demo.candidate;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.ReadOnlyProperty;

import javax.validation.constraints.NotNull;

/**
 * Created by barbakini on 12.04.2017.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DetailedData {

    @NotNull
    private String dataId;

    @ReadOnlyProperty
    private String dataText;

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getDataText() {
        return dataText;
    }

    public void setDataText(String dataText) {
        this.dataText = dataText;
    }
}
