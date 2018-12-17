package CreationalDesignPatterns.Singleton.Testability;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class SingletonTest {

    @Test
    public void isSingletonTest() {
        SingletonDatabase singletonDatabase1 = SingletonDatabase.getInstance();
        SingletonDatabase singletonDatabase2 = SingletonDatabase.getInstance();

        assertSame(singletonDatabase1, singletonDatabase2);
        assertEquals(1, SingletonDatabase.getCount());
    }

    @Test
    public void singletonTotalPopulationTest() {
        SingletonTotalPopulation singletonTotalPopulation = new SingletonTotalPopulation();

        List<String> cities = new ArrayList<>();
        cities.add("Warsaw");
        cities.add("Berlin");

        int totalPopulation = singletonTotalPopulation.getTotalPopulation(cities);
        assertEquals(1650000 + 3600000, totalPopulation);
    }

    @Test
    public void localDatabasePopulationTest() {
        LocalDatabase localDatabase = new LocalDatabase();
        LocalDatabaseTotalPopulation localDatabaseTotalPopulation = new LocalDatabaseTotalPopulation(localDatabase);

        List<String> cities = new ArrayList<>();
        cities.add("Gdynia");
        cities.add("Poznań");

        assertEquals(4, localDatabaseTotalPopulation.getTotalPopulation(cities));
    }
}