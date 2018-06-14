package CreationalDesignPatterns.Factory.AbstractFactory;

public class CoffeeLatteFactory implements DrinkFactory {
    @Override
    public HotDrink prepare(int amount)
    {
        System.out.println(
                "Grind some beans, boil water, pour " + amount + " ml, add coconut milk, cream and sugar, enjoy!"
        );
        return new CoffeLatte();
    }
}
