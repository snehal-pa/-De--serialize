package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pet dog = new Pet("Dog", "Tommy");
        Pet cat = new Pet("Cat", "kitty");
        Person p1 = new Person("Sara", "30", dog);
        Person p2 = new Person("Maja", "25", cat);
        Vehicle car = new Vehicle("car");

        Serializer.writeObject(dog, "dog");
        Serializer.writeObject(p1, "sara");
        Serializer.writeObject(p2, "Maja");
        Serializer.writeObject(car, "Car");

        Serializable dogLoaded = Serializer.readObject("dog");
        Serializable saraLoaded = Serializer.readObject("sara");
        Serializable MajaLoaded = Serializer.readObject("Maja");
        Serializable carLoaded = Serializer.readObject("Car");


        System.out.println(dogLoaded);
        System.out.println(saraLoaded);
        System.out.println(MajaLoaded);
        System.out.println(carLoaded);


//        ArrayList<Serializable> objects = new ArrayList<>();
//        objects.add(p);
//        objects.add(dog);
//        objects.add(car);

        //Serializer.writeObject(objects);
        //ArrayList<Serializable> objectsFromFile = (ArrayList<Serializable>) Serializer.readObject();
        //objectsFromFile.forEach(System.out::println);
        //System.out.println();

    }
}
