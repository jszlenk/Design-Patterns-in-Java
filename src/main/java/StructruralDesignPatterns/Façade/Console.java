package StructruralDesignPatterns.Façade;

import java.util.ArrayList;
import java.util.List;

class Console {

    private List<Viewport> viewports = new ArrayList<>();
    private int width, height;


    Console(int width, int height) {
        this.width = width;
        this.height = height;
    }


    void addViewport(Viewport viewport) {
        viewports.add(viewport);
    }

    static Console newConsole(int width, int height) {
        Buffer buffer = new Buffer(width, height);
        Viewport viewport = new Viewport(buffer, width, height, 0, 0);
        Console console = new Console(width, height);
        console.addViewport(viewport);
        return console;
    }

    void render() {
        for (int y = 0; y < height; ++y) {
            for (int x = 0; y < width; ++x) {
                for (Viewport vp : viewports) {
                    System.out.println(vp.charAt(x, y));
                }
                System.out.println();
            }
        }
    }
}
