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
     * <p>Это задание необходимо решать с использованием логических операторов,
     * без использования конструкций if-else</p>
     */
    public boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int a1 = a ? 1 : 0;
        int b1 = b ? 1 : 0;
        int c1 = c ? 1 : 0;
        int d1 = d ? 1 : 0;

        return a1 + b1 + c1 + d1 == 2;
    }
}
