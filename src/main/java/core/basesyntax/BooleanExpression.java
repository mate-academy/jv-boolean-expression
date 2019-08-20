package core.basesyntax;

public class BooleanExpression {
    protected boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        boolean[] array = {a && b, a && c, a && d, b && c, b && d, c && d};
        boolean[] arrayNegation = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayNegation[i] = !array[i];
        }
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] && arrayNegation[i] == true) {
                flag = false;
            }
        }
        return flag;
    }
}
