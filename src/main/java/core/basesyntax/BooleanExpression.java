package core.basesyntax;

public class BooleanExpression {

    /**
     * Реализуйте метод booleanExpression(boolean a, boolean b, boolean c, boolean d),
     * возвращающий true, если среди четырех его аргументов ровно два истинны (любые)
     * во всех остальных случаях метод должен возвращать false.
     * Вам надо только проанализировать переданные в метод booleanExpression
     * значения (a, b, c, d) и вернуть результат.
     * Это задание необходимо решать с использованием логических операторов.
     */
    public boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int count = 0;
        if (a == true) {
            count++;
        }
        if (b == true) {
            count++;
        }
        if (c == true) {
            count++;
        }
        if (d == true) {
            count++;
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
}
