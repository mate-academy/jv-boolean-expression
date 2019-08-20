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
        if (a == true & b == true & c == false & d == false
                || a == true & c == true & b == false & d == false
                || a == true & d == true & b == false & c == false
                || b == true & c == true & a == false & d == false
                || b == true & d == true & a == false & c == false
                || c == true & d == true & a == false & b == false) {
            return true;
        }
        return false;
    }
}
