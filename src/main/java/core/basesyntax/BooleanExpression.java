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
        if ((a && b && c && d) || (!a && !b && !c && !d)) {
            return false;
        }
        if ((a && b && c) || (!a && !b && !c) || (a && b && d) || (!a && !b && !d)
                || (b && c && d) || (!b && !c && !d) || (a && c && d) || (!a && !c && !d)) {
            return false;
        }
        return true;
    }
}
