package StructruralDesignPatterns.Decorator.DynamicDecorator;

class ColoredShape implements Shape {
    private Shape shape;
    private String color;

    ColoredShape(Shape shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " has the color " + color;
    }
}