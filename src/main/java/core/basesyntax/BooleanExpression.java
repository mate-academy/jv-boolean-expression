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
        int count = 0;
        if (a) {
            count += 1;
        }
        if (b) {
            count += 1;
        }
        if (c) {
            count += 1;
        }
        if (d) {
            count += 1;
        }
        return count == 2;
    }
}
