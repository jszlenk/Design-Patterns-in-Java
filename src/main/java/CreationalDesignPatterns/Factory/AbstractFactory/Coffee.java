package CreationalDesignPatterns.Factory.AbstractFactory;

class Coffee implements HotDrink {
    @Override
    public void consume() {
        System.out.println("This coffee is delicious.");
    }
}