package BehavioralDesignPatterns.Visitor.ReflectiveVisitor;

public class Main {
    public static void main(String[] args) {

        AdditonExpression additonExpression = new AdditonExpression(new DoubleExpression(1),
                new AdditonExpression(new DoubleExpression(2), new DoubleExpression(3)
                )
        );

        StringBuilder stringBuilder = new StringBuilder();
        ExpressionPrinter expressionPrinter = new ExpressionPrinter();
        expressionPrinter.print(additonExpression, stringBuilder);
        System.out.println(stringBuilder);
    }
}