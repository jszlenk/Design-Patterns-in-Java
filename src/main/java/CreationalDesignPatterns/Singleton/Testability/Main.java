package CreationalDesignPatterns.Singleton.Testability;

public class Main {
    public static void main(String[] args) {
        SingletonDatabase db = SingletonDatabase.getInstance();

        String city = "Paris";
        int cityFromDB = db.getPopulation(city);
        System.out.println(String.format("%s has population of %d people.", city, cityFromDB));
    }
}
