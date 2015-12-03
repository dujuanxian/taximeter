import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ExtraPriceCalculatorTest {

    @Test
    public void testCount() {
        int distance = 10;
        ExtraPriceCalculator extraPriceCalculator = new ExtraPriceCalculator();
        assertThat(extraPriceCalculator.count(distance), is(14.80));
    }
}