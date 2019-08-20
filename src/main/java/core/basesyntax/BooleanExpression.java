package core.basesyntax;

public class BooleanExpression {
    protected boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        boolean[] array = {a && b, a && c, a && d, b && c, b && d, c && d};
        int count = 0;
        for (boolean i : array) {
            if (i == true) {
                count++;
            }
        }
        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }
}
