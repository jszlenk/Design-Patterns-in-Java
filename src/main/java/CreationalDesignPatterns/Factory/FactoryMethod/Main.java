package CreationalDesignPatterns.Factory.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Point point3 = new Point(2, 3);
        Point point1 = new Point(2, 3, CoordinateSystem.CARTESIAN);
        Point point2 = new Point(2, 3, CoordinateSystem.POLAR);

        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3 + "\n");

        Point point4 = Point.Factory.newCartesianPoint(4,4);
        Point point5 = Point.Factory.newPolarPoint(4,4);
        Point origin = Point.ORIGIN;

        System.out.println(point4);
        System.out.println(point5);
        System.out.println(origin + "\n");

        Point point6 = PointFactory.newCartesianPoint();
        Point point7 = PointFactory.newPolarPoint();

        System.out.println(point6);
        System.out.println(point7);
    }
}