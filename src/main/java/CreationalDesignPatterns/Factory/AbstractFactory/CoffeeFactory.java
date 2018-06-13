package CreationalDesignPatterns.Factory.AbstractFactory;

class CoffeeFactory implements DrinkFactory
{
    @Override
    public HotDrink prepare(int amount)
    {
        System.out.println(
                "Grind some beans, boil water, pour " + amount + " ml, add cream and sugar, enjoy!"
        );
        return new Coffee();
    }
}
