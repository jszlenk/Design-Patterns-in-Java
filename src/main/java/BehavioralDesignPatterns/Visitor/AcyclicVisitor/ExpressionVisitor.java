package BehavioralDesignPatterns.Visitor.AcyclicVisitor;

interface ExpressionVisitor extends Visitor {
    void visit(Expression obj);
}
