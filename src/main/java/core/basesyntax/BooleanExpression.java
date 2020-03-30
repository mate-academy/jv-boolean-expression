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
        return ((a == true && b == true && c == false && d == false)
            || (a == true && b == false && c == true && d == false)
            || (a == true && b == false && c == false && d == true)
            || (a == false && b == true && c == true && d == false)
            || (a == false && b == true && c == false && d == true)
            || (a == false && b == false && c == true && d == true)
            || (a == false && b == true && c == false && d == true)
            || (a == false && b == false && c == true && d == true)) ? true : false;
    }
}
