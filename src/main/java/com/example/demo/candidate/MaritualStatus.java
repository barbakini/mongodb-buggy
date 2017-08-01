package com.example.demo.candidate;

/**
 * Created by barbakini on 29.03.2017.
 */
public enum MaritualStatus {

    MARRIED("MARRIED"),
    SINGLE("SINGLE"),
    DIVORCED("DIVORCED"),
    OTHER("OTHER");

    private final String type;

    private MaritualStatus(String type) {
        this.type = type;
    }

    public boolean equals(String type) {
        return this.type.equals(type);
    }

    public String toString(){
        return this.type;
    }
}
