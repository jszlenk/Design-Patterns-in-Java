package BehavioralDesignPatterns.Interpreter;

import java.util.ArrayList;
import java.util.List;

class Lexing {

    List<Token> converter(java.lang.String input) {

        ArrayList<Token> result = new ArrayList<>();

        for (int i = 0; i < input.length(); ++i) {

            switch (input.charAt(i)) {
                case '+':
                    result.add(new Token(Type.PLUS, "+"));
                    break;
                case '-':
                    result.add(new Token(Type.MINUS, "-"));
                    break;
                case '(':
                    result.add(new Token(Type.LPAREN, "("));
                    break;
                case ')':
                    result.add(new Token(Type.RPAREN, ")"));
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder("" + input.charAt(i));

                    for (int j = i + 1; j < input.length(); ++j) {

                        if (Character.isDigit(input.charAt(j))) {
                            stringBuilder.append(input.charAt(j));
                            ++i;
                        } else {
                            result.add(new Token(Type.INTEGER, stringBuilder.toString()));
                            break;
                        }
                    }
                    break;
            }
        }
        return result;
    }
}