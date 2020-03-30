package core.basesyntax;

public class BooleanExpression {

    public boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int count = 0;
        count = a == b
                ? count + 1 : count;
        count = a == c
                ? count + 1 : count;
        count = a == d
                ? count + 1 : count;
        count = b == c
                ? count + 1 : count;
        count = b == d
                ? count + 1 : count;
        count = c == d
                ? count + 1 : count;
        return count == 2;
    }
}
