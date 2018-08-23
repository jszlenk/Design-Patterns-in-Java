package StructruralDesignPatterns.Decorator.DynamicDecorator;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.info());

        ColoredShape blueSquare = new ColoredShape(new Square(20), "blue");
        System.out.println(blueSquare.info());

        TransparentShape myCircle = new TransparentShape(new ColoredShape(new Circle(5), "red"), 50);
        System.out.println(myCircle.info());
    }
}