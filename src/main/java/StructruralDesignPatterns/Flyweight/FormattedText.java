package StructruralDesignPatterns.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class FormattedText {
    private String plainText;
    private List<TextRange> formatting = new ArrayList<>();

    FormattedText(String plainText) {
        this.plainText = plainText;
    }

    TextRange getRange(int start, int end) {
        TextRange range = new TextRange(start, end);
        formatting.add(range);
        return range;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < plainText.length(); ++i) {
            char letter = plainText.charAt(i);
            for (TextRange range : formatting) {
                if (range.covers(i) && range.capitalize) {
                    letter = Character.toUpperCase(letter);
                }
            }
            stringBuilder.append(letter);
        }
        return stringBuilder.toString();
    }
}