/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp_simulator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yangy
 */
public class VPEArrayTest {
    
    public VPEArrayTest() {
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
     * Test of getVPE method, of class VPEArray.
     */
    @Test
    public void testGetVPE() {
        System.out.println("getVPE");
        int xPos = 0;
        int yPos = 0;
        VPEArray instance = new VPEArray(5,10);
        VPE expResult = null;
        VPE result = instance.getVPE(xPos, yPos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getWidth method, of class VPEArray.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        VPEArray instance = new VPEArray(5,10);
        int expResult = 5;
        int result = instance.getWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getHeight method, of class VPEArray.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        VPEArray instance = new VPEArray(5,10);
        int expResult = 10;
        int result = instance.getHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
