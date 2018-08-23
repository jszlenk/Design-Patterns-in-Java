package StructruralDesignPatterns.Decorator.StaticDecorator;

class Circle implements Shape {
    private float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public String info() {
        return "A circle of radius " + radius;
    }
}