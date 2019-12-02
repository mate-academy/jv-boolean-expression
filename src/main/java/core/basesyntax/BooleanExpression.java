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
        boolean [] array = {a,b,c,d};
        int counter = 0;
        for (int i=0;i<array.length;i++){
            if (array[i]==true)
                counter ++;
        }
        if (counter==2)
            return true;
        else
        return false;
    }
}
