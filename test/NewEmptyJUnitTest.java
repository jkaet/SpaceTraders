/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import spaceTrader.Market;
import spaceTrader.Planet;

/**
 *
 * @author Brandens
 */
public class NewEmptyJUnitTest {
    Market m;
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        m = new Market();
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testInitial() {
        //Market m = new Market();
        assertEquals(0, m.firearmsPrice);
    }
    @Test
    public void testPost() {
        m.generatePricesAndQuanities(new Planet("bb", 3, 4, 5, 6));
        assertFalse(m.firearmsPrice == 0);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
