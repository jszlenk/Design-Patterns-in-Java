package CreationalDesignPatterns.Factory.AbstractFactory;

class Main {
    public static void main(String[] args) throws Exception {
        DrinkMachine machine = new DrinkMachine();
        HotDrink coffeelatte = machine.makeDrink(AvailableDrink.COFFEELATTE, 400);
        HotDrink coffee = machine.makeDrink(AvailableDrink.COFFEE, 300);
        HotDrink tea = machine.makeDrink(AvailableDrink.TEA, 200);

        coffeelatte.consume();
        coffee.consume();
        tea.consume();

        HotDrink drink = machine.makeDrink();
        drink.consume();
    }
}
