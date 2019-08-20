package core.basesyntax;

public class BooleanExpression {

    /**
     * Реализуйте метод booleanExpression(boolean a, boolean b, boolean c, boolean d),
     * возвращающий true, если среди четырех его аргументов ровно два истинны (любые)
     * во всех остальных случаях метод должен возвращать false.
     * <p>
     * Вам надо только проанализировать переданные в метод booleanExpression
     * значения (a, b, c, d) и вернуть результат.
     *</p>
     * Это задание необходимо решать с использованием логических операторов.
     */
    public boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int trueCounter = 0;
        if (a) {
            trueCounter++;
        }
        if (b) {
            trueCounter++;
        }
        if (c) {
            trueCounter++;
        }
        if (d) {
            trueCounter++;
        }
        if (trueCounter == 2) {
            return true;
        }
        return false;
    }
}
