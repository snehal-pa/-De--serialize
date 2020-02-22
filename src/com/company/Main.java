package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pet dog = new Pet("Dog", "Tommy");
        Person p = new Person("Sara", "30", dog);
        Vehicle car = new Vehicle("car");

        ArrayList<Serializable> objects = new ArrayList<>();
        objects.add(p);
        objects.add(dog);
        objects.add(car);

        Serializer.writeObject(objects);

        ArrayList<Serializable> objectsFromFile = (ArrayList<Serializable>) Serializer.readObject();

        objectsFromFile.forEach(System.out::println);
        System.out.println();

    }
}
