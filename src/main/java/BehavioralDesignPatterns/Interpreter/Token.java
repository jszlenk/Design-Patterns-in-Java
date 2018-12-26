package BehavioralDesignPatterns.Interpreter;

public class Token {

    private Type type;
    private String text;

    Token(Type type, String text) {
        this.type = type;
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
