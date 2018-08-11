package StructruralDesignPatterns.Flyweight;

class TextRange {
    private int start, end;
    boolean capitalize;

    TextRange(int start, int end) {
        this.start = start;
        this.end = end;
    }

    boolean covers(int position) {
        return position >= start && position <= end;
    }
}