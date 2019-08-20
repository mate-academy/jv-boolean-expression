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
        boolean[] bool = new boolean[]{a, b, c, d};
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (bool[i]) {
                count++;
            }
        }

        return count == 2;
    }
}
