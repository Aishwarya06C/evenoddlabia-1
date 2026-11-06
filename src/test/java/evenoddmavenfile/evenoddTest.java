
package evenoddmavenfile;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class evenoddTest {

    @Test
    public void testEven() {
        assertEquals("Even", evenodd.check(13));
    }

    @Test
    public void testOdd() {
        assertEquals("Odd", evenodd.check(7));
    }
}
