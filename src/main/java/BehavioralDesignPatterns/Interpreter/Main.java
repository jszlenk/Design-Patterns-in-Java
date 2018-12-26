package BehavioralDesignPatterns.Interpreter;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String input = "(34+4)-(21+1)";
        Lexing lexing = new Lexing();
        List<Token> tokens = lexing.converter(input);

        System.out.println(tokens.stream()
                .map(Token::toString)
                .collect(Collectors.joining("\t")));
    }
}