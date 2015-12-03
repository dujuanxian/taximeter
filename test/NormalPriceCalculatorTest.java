import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NormalPriceCalculatorTest {

    @Test
    public void testCount() {
        int distance = 6;
        PriceCalculator calculator = new NormalPriceCalculator();
        assertThat(calculator.count(distance), is(9.20));
    }

}