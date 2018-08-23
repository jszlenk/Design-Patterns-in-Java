package StructruralDesignPatterns.Decorator.StringDecorator;

public class MagicString {
    private String string;

    MagicString(String string) {
        this.string = string;
    }

    long getNumberOfVowels() {
        return string.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "aeiou".contains(c.toString()))
                .count();
    }

    @Override
    public String toString() {
        return string;
    }
}
