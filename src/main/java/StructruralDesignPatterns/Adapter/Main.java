package StructruralDesignPatterns.Adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final List<VectorObject> vectorObjects = new ArrayList<>(Arrays.asList(
                    new VectorRectangle(1, 1, 4, 4),
                    new VectorRectangle(2, 2, 3, 3)
            ));

    private static void drawPoint(Point p) {
        System.out.println("-");
    }

    private static void draw() {
        for (VectorObject vo : vectorObjects) {
            for (Line line : vo) {
                LineToPointAdapter adapter = new LineToPointAdapter(line);
                adapter.forEach(Main::drawPoint);
            }
        }
    }

    public static void main(String[] args) {
        draw();
        System.out.println("Caching:");
        draw();
    }
}