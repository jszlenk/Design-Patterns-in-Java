package StructruralDesignPatterns.Flyweight;

public class Main {
    public static void main(String[] args) {
        FormattedText formattedText = new FormattedText("Java is Great");
        formattedText.getRange(9, 14).capitalize = true;
        System.out.println(formattedText);
    }
}