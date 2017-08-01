package com.example.demo.candidate;

/**
 * Created by barbakini on 6.03.2017.
 */
public enum PhoneType {

    MOBILE("MOBILE"),
    HOME("HOME"),
    WORK("WORK");

    private final String type;

    private PhoneType(String type) {
        this.type = type;
    }

    public boolean equals(String type) {
        return this.type.equals(type);
    }

    public String toString(){
        return this.type;
    }
}
