package CreationalDesignPatterns.Factory.AbstractFactory;

public class CoffeLatte implements HotDrink {
    @Override
    public void consume() {
        System.out.println("This coffee latte is great.");
    }
}
