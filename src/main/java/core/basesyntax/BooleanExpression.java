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
        int countTrue = 0;
        int countFalse = 0;

        boolean[] array = new boolean[] {a, b, c, d};
        for (int i = 0; i < array.length; i++) {
            countFalse = !array[i] ? countFalse + 1 : countFalse;
            countTrue = array[i] ? countTrue + 1 : countTrue;
        }
        return (countTrue | countFalse) == 2;
    }
}
