package BehavioralDesignPatterns.Visitor.DoubleDispatchVisitor;

public interface ExpressionVisitor {

    void visit(DoubleExpression e);
    void visit(AdditonExpression e);

}