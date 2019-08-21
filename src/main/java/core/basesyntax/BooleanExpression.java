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
        return a & b & !c & !d
                ? true : a & c & !b & !d
                ? true : a & d & !b & !c
                ? true : b & c & !a & !d
                ? true : b & d & !a & !c
                ? true : c & d & !a & !b ? true : false;
    }
}
