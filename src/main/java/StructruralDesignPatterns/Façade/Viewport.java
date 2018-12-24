package StructruralDesignPatterns.Façade;

class Viewport {

    private final Buffer buffer;
    private final int width;
    private final int height;
    private final int offsetX;
    private final int offestY;

    Viewport(Buffer buffer, int width, int height, int offsetX, int offestY) {
        this.buffer = buffer;
        this.width = width;
        this.height = height;
        this.offsetX = offsetX;
        this.offestY = offestY;
    }

    char charAt(int x, int y) {
        return buffer.charAt(x + offsetX, y + offestY);
    }
}
