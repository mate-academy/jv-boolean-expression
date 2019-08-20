package core.basesyntax;

public class BooleanExpression {
    public boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        boolean array[] = {a && b, a && c, a && d, b && c, b && d, c && d};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == true) {
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
