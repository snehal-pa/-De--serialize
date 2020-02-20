package com.company;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Serializer {

    private static Path path = Paths.get("serializedFile.ser");

    public static void writeObject(Serializable obj) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(obj); // Serializes
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Serializable readObject() {
        Serializable object = null;

        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            object = (Serializable) ois.readObject(); // De-serializes
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
        return object;

    }


}
