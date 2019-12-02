package core.basesyntax;

public class BooleanExpression {

    /**
     * <p>Реализуйте метод booleanExpression(boolean a, boolean b, boolean c, boolean d),
     * возвращающий true, если среди четырех его аргументов ровно два истинны (любые)
     * во всех остальных случаях метод должен возвращать false.</p>
     *
     * <p>Вам надо только проанализировать переданные в метод booleanExpression
     * значения (a, b, c, d) и вернуть результат.</p>
     *
     * <p>Это задание необходимо решать с использованием логических операторов.</p>
     */
    public boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        if (a) {
            return (b && !c && !d) || (c && !b && !d) || (d && !b && !c);
        } else if (b) {
            return (c && !d) || (d && !c);
        } else if (c) {
            return d;
        }
        return false;
    }
}
