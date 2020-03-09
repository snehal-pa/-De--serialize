package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Serializer {

    //private static Path path = Paths.get("serializedFile.ser");

    public static void writeObject(Serializable obj, String fileName) {
        Path path = Paths.get(fileName.toLowerCase() + ".ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(obj); // Serializes
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Serializable readObject(String fileName) {
        Path path = Paths.get(fileName.toLowerCase() + ".ser");
        File file = path.toFile();
        Serializable object = null;
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
                object = (Serializable) ois.readObject(); // De-serializes
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return object;
        } else {
            System.out.printf("%s file doesn't exist\n",fileName);
            return null;
        }

    }


}
