package core.basesyntax;

public class BooleanExpression {

    /**
     * Реализуйте метод booleanExpression(boolean a, boolean b, boolean c, boolean d),
     * возвращающий true, если среди четырех его аргументов ровно два истинны (любые)
     * во всех остальных случаях метод должен возвращать false.
     * <p>
     * Вам надо только проанализировать переданные в метод booleanExpression
     * значения (a, b, c, d) и вернуть результат.
     * </p>
     * Это задание необходимо решать с использованием логических операторов.
     */
    public boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int m1 = 0;
        int m2 = 0;

        if (a == true && b == true) {
            m1 = 2;
        } else if (a == true ^ b == true) {
            m1 = 1;
        }

        if (c == true && d == true) {
            m2 = 2;
        } else if (c == true ^ d == true) {
            m2 = 1;
        }

        if (m1 + m2 == 2) {
            return true;
        }

        return false;
    }
}
