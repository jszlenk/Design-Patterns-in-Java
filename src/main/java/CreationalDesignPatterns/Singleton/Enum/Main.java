package CreationalDesignPatterns.Singleton.Enum;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    private static void saveToFile(EnumSingleton singleton, String filename)  throws Exception {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(singleton);
        }
    }

    private static EnumSingleton readFromFile(String filename) throws Exception {
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
                return (EnumSingleton) in.readObject();
        }
    }

    public static void main(String[] args) throws Exception {
        String filename = "enumsingleton.txt";

        EnumSingleton singleton = EnumSingleton.INSTANCE;
        singleton.setValue(1);
        saveToFile(singleton, filename);

        EnumSingleton singleton2 = readFromFile(filename);
        System.out.println(singleton2.getValue());
    }
}
