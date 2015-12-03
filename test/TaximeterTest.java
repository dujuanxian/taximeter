import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TaximeterTest {
    @Test
    public void shouldReturnFlagPrice() {
        Taximeter taximeter = new Taximeter();
        assertThat(taximeter.getPrice(), is(6));
    }
}
