package core.basesyntax;

public class BooleanExpression {
    public boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a && b || a && c || a && d || b && d || c && d || b && c)
                && (!a && !b || !a && !c || !a && !d || !b && !d || !c && !d || !b && !c);
    }
}
