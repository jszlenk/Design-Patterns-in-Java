package BehavioralDesignPatterns.Visitor.DoubleDispatchVisitor;

public abstract class Expression {

    public abstract void accept(ExpressionVisitor visitor);

}
