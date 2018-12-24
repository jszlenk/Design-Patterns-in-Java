package BehavioralDesignPatterns.Visitor.IntrusiveVisitor;

public class Main {
    public static void main(String[] args) {

        AdditonExpression e = new AdditonExpression(new DoubleExpression(1), new AdditonExpression(
                        new DoubleExpression(2), new DoubleExpression(3)
                )
        );

        StringBuilder sb = new StringBuilder();
        e.print(sb);
        System.out.println(sb);
    }
}