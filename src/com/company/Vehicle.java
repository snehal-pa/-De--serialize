package com.company;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private String type;

    public Vehicle(String type) {
        this.type = type;

    }
    @Override
    public String toString(){
        return String.format("This is a %s",this.type);
    }
}
