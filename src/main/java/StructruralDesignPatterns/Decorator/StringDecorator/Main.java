package StructruralDesignPatterns.Decorator.StringDecorator;

public class Main {
    public static void main(String[] args) {
        MagicString s = new MagicString("hello");
        System.out.println(s + " has " + s.getNumberOfVowels() + " vowels");
    }
}
