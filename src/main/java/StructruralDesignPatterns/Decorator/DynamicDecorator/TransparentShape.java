package StructruralDesignPatterns.Decorator.DynamicDecorator;

class TransparentShape implements Shape {
    private Shape shape;
    private int transparency;

    TransparentShape(Shape shape, int transparency) {
        this.shape = shape;
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return shape.info() + "and has " + transparency + "% transparency";
    }
}
