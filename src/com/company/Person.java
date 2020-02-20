package com.company;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private String age;
    Pet pet;


    public Person(Pet pet) {
        this.pet = pet;
    }


    public Person(String name, String age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    @Override
    public String toString() {
        return String.format("Person %s (%s) has %s", this.name,this.age,this.pet.toString() );
    }
}
