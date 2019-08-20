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
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        boolean isGood = true;
        boolean result = true;
        if (a == b == c || a == b == c == d) {
            return false;
        } else if ((isGood == a && b) || (isGood == a && c)
            || (isGood == a && d) || (isGood == b && c)
            || (isGood == b && d) || (isGood == c && d)) {
            return true;
        } else {
            result = false;
        }
        return result;

    }
}
