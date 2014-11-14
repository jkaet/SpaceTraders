/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceTrader;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Quan
 */
public class UniverseTest {
    
    public UniverseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of generateUniverse method, of class Universe.
     */
    @Test
    public void testGenerateUniverse() {
        System.out.println("generateUniverse");
        Universe instance = new Universe();
        instance.generateUniverse();
        assertNotNull("Object was returned null(not properly created)", instance.universe);
        assertFalse("No planets were added to the universe.",instance.universe.size()==0);
    }

    /**
     * Test of getCopy method, of class Universe.
     */
    @Test
    public void testGetCopy() {
        System.out.println("getCopy");
        Universe instance = new Universe();
        instance.generateUniverse();
        ArrayList<Planet> expResult = instance.universe;
        ArrayList<Planet> result = instance.getCopy();
        assertEquals(expResult, result);
    }
    
}
