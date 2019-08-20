package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

public class BooleanExpressionTest {

    @Test
    public void booleanExpression() {
        final BooleanExpression expression = new BooleanExpression();

        for (int aInt = 0; aInt < 2; aInt++) {
            final boolean a = aInt == 0;
            for (int bInt = 0; bInt < 2; bInt++) {
                final boolean b = bInt == 0;
                for (int cInt = 0; cInt < 2; cInt++) {
                    final boolean c = cInt == 0;
                    for (int dInt = 0; dInt < 2; dInt++) {
                        final boolean d = dInt == 0;

                        final boolean actualResult = expression.booleanExpression(a, b, c, d);
                        final boolean expectedResult = this.correctBooleanExpression(a, b, c, d);

                        Assert.assertEquals(
                                "Test failed with parameter: a = " + a + " b = " + b + " c = "
                                        + c + " d = " + d,
                                expectedResult,
                                actualResult);
                    }
                }
            }
        }
    }

    private boolean correctBooleanExpression(final boolean a, final boolean b, final boolean c, final boolean d) {
        return Stream.of(a, b, c, d).filter((t) -> t).count() == 2;
    }
}
