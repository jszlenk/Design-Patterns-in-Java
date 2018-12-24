package BehavioralDesignPatterns.Visitor.AcyclicVisitor;

public class AdditonExpression extends Expression {
    Expression left, right;

    public AdditonExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public void accept(Visitor visitor) {
        if (visitor instanceof AdditonExpressionVisitor)
            ((AdditonExpressionVisitor) visitor).visit(this);
    }
}