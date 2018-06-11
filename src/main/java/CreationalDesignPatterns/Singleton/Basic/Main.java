package CreationalDesignPatterns.Singleton.Basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    private static void saveToFile(BasicSingleton singleton, String filename) throws Exception {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(singleton);
        }
    }

    private static BasicSingleton readFromFile(String filename) throws Exception {
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
                return (BasicSingleton) in.readObject();
        }
    }

    public static void main(String[] args) throws Exception {
        BasicSingleton singleton1 = BasicSingleton.getInstance();
        singleton1.setValue(1);

        String filename = "singleton.txt";
        saveToFile(singleton1, filename);
        singleton1.setValue(2);

        BasicSingleton singleton2 = readFromFile(filename);

        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.getValue());
        System.out.println(singleton2.getValue());
    }
}

