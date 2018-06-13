package CreationalDesignPatterns.Factory.AbstractFactory;

interface DrinkFactory {
    HotDrink prepare(int amount);
}
