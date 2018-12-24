package BehavioralDesignPatterns.Visitor.DoubleDispatchVisitor;

public class DoubleExpression extends Expression {

    double value;

    public DoubleExpression(double value) {
        this.value = value;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
