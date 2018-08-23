package StructruralDesignPatterns.Decorator.DynamicDecorator;

public class Square implements Shape {
    private float side;

    Square(float side) {
        this.side = side;
    }

    @Override
    public String info() {
        return "A square with side " + side;
    }
}
