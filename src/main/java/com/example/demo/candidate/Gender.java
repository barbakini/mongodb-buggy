package com.example.demo.candidate;

/**
 * Created by barbakini on 28.03.2017.
 */
public enum Gender {

    MALE("MALE"),
    FEMALE("FEMALE"),
    OTHER("OTHER");

    private final String type;

    private Gender(String type) {
        this.type = type;
    }

    public boolean equals(String type) {
        return this.type.equals(type);
    }

    public String toString(){
        return this.type;
    }
}
