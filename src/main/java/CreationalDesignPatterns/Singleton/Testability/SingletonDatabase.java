package CreationalDesignPatterns.Singleton.Testability;

import com.google.common.collect.Iterables;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

class SingletonDatabase {
    private Dictionary<String, Integer> capitals = new Hashtable<>();
    private static int instanceCount = 0;

    static int getCount() {
        return instanceCount;
    }

    private SingletonDatabase() {
        instanceCount++;
        System.out.println("Initializing database");

        try {
            File file = new File(getClass().getProtectionDomain().getCodeSource().getLocation().getPath());

            Path fullPath = Paths.get(file.getPath(), "capitals.txt");
            List<String> lines = Files.readAllLines(fullPath);

            Iterables.partition(lines, 2).forEach(city -> capitals.put(
                    city.get(0).trim(), Integer.parseInt(city.get(1))
            ));
        } catch (Exception e) {
            System.out.println("WARNING! Path for capitals.txt file is: " + getClass().getProtectionDomain().getCodeSource().getLocation().getPath());
            System.err.println(e.getMessage());
        }
    }

    private static final SingletonDatabase INSTANCE = new SingletonDatabase();

    static SingletonDatabase getInstance() {
        return INSTANCE;
    }

    int getPopulation(String name) {
        return capitals.get(name);
    }
}
