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
        int countTotal = 0;
        int count1,count2,count3,count4 = 0 ;
        count1 = (a) ? 1 : 0;
        count2 = (b) ? 1 : 0;
        count3 = (c) ? 1 : 0;
        count4 = (d) ? 1 : 0;
        countTotal = count1 + count2 + count3 + count4;
        return countTotal == 2;
    }
}
