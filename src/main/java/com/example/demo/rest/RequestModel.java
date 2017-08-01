package com.example.demo.rest;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by barbakini on 3.03.2017.
 */
public class RequestModel<T> {

    @Valid
    @NotNull
    private T data;

    private List<String> options;


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}
