package StructruralDesignPatterns.Façade;

class Buffer {

    private char[] characters;
    private int lineWidth;

    Buffer(int lineHeight, int lineWidth) {
        this.lineWidth = lineWidth;
        characters = new char[lineWidth * lineHeight];
    }

    char charAt(int x, int y) {
        return characters[y * lineWidth + x];
    }
}