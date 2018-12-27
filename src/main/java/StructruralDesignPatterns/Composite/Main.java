package StructruralDesignPatterns.Composite;

public class Main {
    public static void main(String[] args) {

        GraphicObject draw = new GraphicObject();

        draw.setName("My Drawing");
        draw.children.add(new Square("Red"));
        draw.children.add(new Circle("Black"));

        GraphicObject group = new GraphicObject();

        group.children.add(new Circle("Gray"));
        group.children.add(new Square("Gray"));

        draw.children.add(group);
        System.out.println(draw);
    }
}