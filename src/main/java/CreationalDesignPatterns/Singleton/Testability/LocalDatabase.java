package CreationalDesignPatterns.Singleton.Testability;

import java.util.Dictionary;
import java.util.Hashtable;

class LocalDatabase implements Database {
    private Dictionary<String, Integer> data = new Hashtable<>();

    LocalDatabase() {
        data.put("Gdynia", 1);
        data.put("Kraków", 2);
        data.put("Poznań", 3);
    }

    @Override
    public int getPopulation(String name) {
        return data.get(name);
    }
}
