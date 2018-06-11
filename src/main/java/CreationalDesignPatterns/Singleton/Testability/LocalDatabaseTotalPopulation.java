package CreationalDesignPatterns.Singleton.Testability;

import java.util.List;

class LocalDatabaseTotalPopulation {
    private Database database;

    LocalDatabaseTotalPopulation(Database database) {
        this.database = database;
    }

    int getTotalPopulation(List<String> names) {
        int result = 0;
        for (String name : names)
            result += database.getPopulation(name);
        return result;
    }
}
