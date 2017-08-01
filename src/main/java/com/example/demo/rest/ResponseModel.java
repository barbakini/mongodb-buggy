package com.example.demo.rest;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by barbakini on 3.03.2017.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseModel<T> {

    private boolean success;

    private T data;

    private Error error;

    private long duration;


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
