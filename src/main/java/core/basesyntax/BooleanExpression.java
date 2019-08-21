package core.basesyntax;

public class BooleanExpression {

    protected boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a == b & c == d & a != d)
                || (a == c & b == d & a != b)
                || (a == d & b == c & a != b)
                || (b == c & a == d & b != a)
                || (b == d & a == c & b != a)
                || (c == d & a == b & c != a);
    }
}
