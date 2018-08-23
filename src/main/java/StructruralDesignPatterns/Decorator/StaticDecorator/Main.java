package StructruralDesignPatterns.Decorator.StaticDecorator;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        System.out.println(circle.info());

        ColoredShape<Square> blueSquare = new ColoredShape<>(() -> new Square(20), "blue");
        System.out.println(blueSquare.info());

        TransparentShape<ColoredShape<Circle>> myCircle = new TransparentShape<>(() ->
                new ColoredShape<>(() -> new Circle(5), "green"), 50);
        System.out.println(myCircle.info());
    }
}
