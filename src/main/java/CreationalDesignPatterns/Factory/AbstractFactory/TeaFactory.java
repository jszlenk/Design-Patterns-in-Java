package CreationalDesignPatterns.Factory.AbstractFactory;

class TeaFactory implements DrinkFactory {

    @Override
    public HotDrink prepare(int amount) {
        System.out.println(
                "Put in tea bag, boil water, pour " + amount + " ml, add lemon, enjoy!"
        );
        return new Tea();
    }
}
