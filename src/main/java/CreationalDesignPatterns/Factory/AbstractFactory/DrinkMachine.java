package CreationalDesignPatterns.Factory.AbstractFactory;

import javafx.util.Pair;
import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class DrinkMachine {

    private Dictionary<AvailableDrink, DrinkFactory> factories = new Hashtable<>();
    private List<Pair<String, DrinkFactory>> namedFactories = new ArrayList<>();

    DrinkMachine() throws Exception {
        for (AvailableDrink drink : AvailableDrink.values()) {
            String s = drink.toString();
            String factoryName = "" + Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'L') {
                      factoryName = "" + Character.toUpperCase(s.charAt(0)) + s.substring(1, 6).toLowerCase()
                              + Character.toUpperCase(s.charAt(6)) +  s.substring(7, 11).toLowerCase() ;
                }
            }

            Class<?> factory = Class.forName("CreationalDesignPatterns.Factory.AbstractFactory." + factoryName + "Factory");

            factories.put(drink, (DrinkFactory) factory.getDeclaredConstructor().newInstance());
        }

        Set<Class<? extends DrinkFactory>> types =
                new Reflections("CreationalDesignPatterns.Factory.AbstractFactory")
                        .getSubTypesOf(DrinkFactory.class);
        for (Class<? extends DrinkFactory> type : types) {
            namedFactories.add(new Pair<>(
                    type.getSimpleName().replace("Factory", ""),
                    type.getDeclaredConstructor().newInstance()
            ));
        }
    }

    HotDrink makeDrink() throws IOException {
        System.out.println("Available drinks: ");
        for (int index = 0; index < namedFactories.size(); ++index) {
            Pair<String, DrinkFactory> item = namedFactories.get(index);
            System.out.println("" + index + ": " + item.getKey());
        }
        System.out.println("Please enter the number:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s;
            int i, amount;

            if ((s = reader.readLine()) != null
                    && (i = Integer.parseInt(s)) >= 0
                    && i < namedFactories.size()) {

                System.out.println("Specify amount: ");
                s = reader.readLine();

                if (s != null && (amount = Integer.parseInt(s)) > 0) {
                    return namedFactories.get(i).getValue().prepare(amount);
                }
            }
            System.out.println("Incorrect input, try again.");
        }
    }

    HotDrink makeDrink(AvailableDrink drink, int amount) {
        return factories.get(drink).prepare(amount);
    }
}
