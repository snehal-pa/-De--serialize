package com.company;

import java.io.Serializable;

public class Pet implements Serializable {

    private  String name;

    private String type;

    public Pet(String type,String name) {
        this.name = name;
        this.type =type;
    }

    public String toString(){
        return String.format("%s: %s",type,name);
    }

}
