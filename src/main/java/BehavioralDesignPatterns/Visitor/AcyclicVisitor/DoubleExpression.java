package BehavioralDesignPatterns.Visitor.AcyclicVisitor;

public class DoubleExpression extends Expression {
    public double value;

    public DoubleExpression(double value) {
        this.value = value;
    }

    public void accept(Visitor visitor) {
        if (visitor instanceof DoubleExpressionVisitor)
            ((DoubleExpressionVisitor) visitor).visit(this);
    }
}
