package BehavioralDesignPatterns.Visitor.ReflectiveVisitor;

class ExpressionPrinter {

    void print(Expression e, StringBuilder sb) {
        if (e.getClass() == DoubleExpression.class) {
            sb.append(((DoubleExpression) e).value);
        } else if (e.getClass() == AdditonExpression.class) {
            AdditonExpression ae = (AdditonExpression) e;
            sb.append("(");
            print(ae.left, sb);
            sb.append("+");
            print(ae.right, sb);
            sb.append(")");
        }
    }
}