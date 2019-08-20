package core.basesyntax;

public class MyBooleanExpression {
    protected boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        boolean[] array = {a && b, a && c, a && d, b && c, b && d, c && d};
        boolean[] arrayNegation = {!(a && b), !(a && c), !(a && d), !(b && c), !(b && d), !(c && d)};
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] && arrayNegation[i] == true) {
                flag = false;
            }
        }
        return flag;
    }
}
