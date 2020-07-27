package core.basesyntax;

public class BooleanExpression {
    public boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a != c && b != d) || (a != d && c != b);
    }
}
