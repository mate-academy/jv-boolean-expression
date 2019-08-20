package core.basesyntax;

import java.util.Arrays;

public class BooleanExpression {

    /**
     * Реализуйте метод booleanExpression(boolean a, boolean b, boolean c, boolean d),
     * возвращающий true, если среди четырех его аргументов ровно два истинны (любые)
     * во всех остальных случаях метод должен возвращать false.
     *
     * <p>Вам надо только проанализировать переданные в метод booleanExpression
     * значения (a, b, c, d) и вернуть результат.
     *
     * <p>Это задание необходимо решать с использованием логических операторов.
     */
    public boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        Boolean[] array = {a, b, c, d};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == true) {
                count += 1;
            }
        }
        return (count == 2);
    }

}
