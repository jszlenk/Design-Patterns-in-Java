package CreationalDesignPatterns.Factory.AbstractFactory;

class Tea implements HotDrink {
    @Override
    public void consume() {
        System.out.println("This tea is nice but I'd prefer it with milk.");
    }
}
