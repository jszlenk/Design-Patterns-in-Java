package BehavioralDesignPatterns.Visitor.AcyclicVisitor;

interface DoubleExpressionVisitor extends Visitor {
    void visit(DoubleExpression obj);
}
