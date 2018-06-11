package CreationalDesignPatterns.Singleton.Testability;

import java.util.List;

class SingletonTotalPopulation {
    int getTotalPopulation(List<String> names) {
        int result = 0;
        for (String name : names)
            result += SingletonDatabase.getInstance().getPopulation(name);
        return result;
    }
}