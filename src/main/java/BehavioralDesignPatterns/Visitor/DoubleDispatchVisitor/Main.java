package BehavioralDesignPatterns.Visitor.DoubleDispatchVisitor;

public class Main {

    public static void main(String[] args) {

        AdditonExpression additonExpression = new AdditonExpression(new DoubleExpression(1),
                new AdditonExpression(new DoubleExpression(2), new DoubleExpression(3)
                )
        );

        ExpressionPrinter expressionPrinter = new ExpressionPrinter();
        expressionPrinter.visit(additonExpression);
        System.out.println(expressionPrinter);

        ExpressionCalculator expressionCalculator = new ExpressionCalculator();
        expressionCalculator.visit(additonExpression);
        System.out.println(expressionPrinter + " = " + expressionCalculator.result);
    }
}

