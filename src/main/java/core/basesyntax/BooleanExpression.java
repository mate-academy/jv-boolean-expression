package core.basesyntax;

public class BooleanExpression {
    public boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        boolean param[] = {a, b, c, d};
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (param[i] == true) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
}
