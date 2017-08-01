package com.example.demo.candidate;

/**
 * Created by muhammed on 21.6.2017.
 */
public enum BloodType {

    OP("0+"),
    ON("0-"),
    AP("A+"),
    AN("A-"),
    BP("B+"),
    BN("B-"),
    ABP("AB+"),
    ABN("AB-");

    private final String type;

    private BloodType(String type) {
        this.type = type;
    }

    public boolean equals(String type) {
        return this.type.equals(type);
    }

    public String toString(){
        return this.type;
    }
}
