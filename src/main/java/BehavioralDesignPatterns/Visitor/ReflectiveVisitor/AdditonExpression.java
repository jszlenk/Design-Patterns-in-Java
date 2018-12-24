package BehavioralDesignPatterns.Visitor.ReflectiveVisitor;

class AdditonExpression extends Expression {
    Expression left, right;

    AdditonExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}