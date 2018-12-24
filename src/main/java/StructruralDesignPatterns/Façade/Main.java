package StructruralDesignPatterns.Façade;

public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(30, 20);
        Viewport viewport = new Viewport(buffer, 30, 20, 0, 0);
        Console console = new Console(30, 20);
        console.addViewport(viewport);
        console.render();

        Console console1 = Console.newConsole(30, 20);
        console1.render();
    }
}
