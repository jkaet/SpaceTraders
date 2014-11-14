package spaceTrader;

import org.junit.Test;
import static junit.framework.Assert.*;

public class ShipTests {

    @Test
    public void testType() {
        Ship s = new Ship("Test");
        assertEquals(s.travelPossible(3, 3), true);
        s.lightYearsLeft = 3;
        assertEquals(s.travelPossible(3000, 3000), false);
    }
}
