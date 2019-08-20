package core.basesyntax;

public class BooleanExpression {

    /**
     * Реализуйте метод booleanExpression(boolean a, boolean b, boolean c, boolean d),
     * возвращающий true, если среди четырех его аргументов ровно два истинны (любые)
     * во всех остальных случаях метод должен возвращать false.
     *
     * Вам надо только проанализировать переданные в метод booleanExpression
     * значения (a, b, c, d) и вернуть результат.
     *
     * Это задание необходимо решать с использованием логических операторов.
     */
    public boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int intA = a ? 1 : 0;
        int intB = b ? 1 : 0;
        int intC = c ? 1 : 0;
        int intD = d ? 1 : 0;
        if (intA + intB + intC + intD == 2) {
            return true;
        } else {
            return false;
        }
    }
}
