package core.basesyntax;

public class BooleanExpression {

    /*
     * Реализуйте метод booleanExpression(boolean a, boolean b, boolean c, boolean d),
     * возвращающий true, если среди четырех его аргументов ровно два истинны (любые)
     * во всех остальных случаях метод должен возвращать false.
     * Вам надо только проанализировать переданные в метод booleanExpression
     * значения (a, b, c, d) и веmрнуть результат.
     * Это задание необходимо решать с использованием логических операторов.
     */
    protected boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        if ((a & b & c) || (a & c & d) || (a & b & d) || (b & c & d)) {
            return false;
        } else if ((a && b) || (a && c) || (a && d)
                || (b && c) || (b && d) || (c && d)) {
            return true;
        }
        return false;
    }
}
