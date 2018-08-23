package StructruralDesignPatterns.Decorator.StaticDecorator;

import java.util.function.Supplier;

class ColoredShape<T extends Shape> implements Shape {
    private Shape shape;
    private String color;

    ColoredShape(Supplier<? extends T> ctor, String color) {
        shape = ctor.get();
        this.color = color;
    }

    @Override
    public String info() {
        return shape + " has the color " + color;
    }
}
