package BehavioralDesignPatterns.Visitor.IntrusiveVisitor;

public class AdditonExpression extends Expression {

    private Expression left, right;

    AdditonExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void print(StringBuilder sb) {
        sb.append("(");
        left.print(sb);
        sb.append("+");
        right.print(sb);
        sb.append(")");
    }
}