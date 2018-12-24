package BehavioralDesignPatterns.Visitor.AcyclicVisitor;

class Main {

    public static void main(String[] args) {

        AdditonExpression expression = new AdditonExpression(new DoubleExpression(2),
                new AdditonExpression(new DoubleExpression(3), new DoubleExpression(3)
                )
        );

        ExpressionPrinter expressionPrinter = new ExpressionPrinter();
        expressionPrinter.visit(expression);
        System.out.println(expressionPrinter);

    }
}






