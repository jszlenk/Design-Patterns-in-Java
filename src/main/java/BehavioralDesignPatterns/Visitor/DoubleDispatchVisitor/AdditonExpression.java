package BehavioralDesignPatterns.Visitor.DoubleDispatchVisitor;

public class AdditonExpression extends Expression {

    Expression left, right;

    public AdditonExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}

