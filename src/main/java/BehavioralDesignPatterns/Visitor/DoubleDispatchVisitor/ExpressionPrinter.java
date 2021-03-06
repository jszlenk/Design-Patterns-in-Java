package BehavioralDesignPatterns.Visitor.DoubleDispatchVisitor;

public class ExpressionPrinter implements ExpressionVisitor {

    private StringBuilder sb = new StringBuilder();

    @Override
    public void visit(DoubleExpression e) {
        sb.append(e.value);
    }

    @Override
    public void visit(AdditonExpression e) {
        sb.append("(");
        e.left.accept(this);
        sb.append("+");
        e.right.accept(this);
        sb.append(")");
    }

    @Override
    public String toString() {
        return "ExpressionPrinter{" +
                "sb=" + sb +
                '}';
    }
}
