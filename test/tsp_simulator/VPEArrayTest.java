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
        int xPos = 4;
        int yPos = 1;
        VPEArray instance = new VPEArray(5,10);
        VPE temp = new VPE(instance,4,1,0);
        for(int j=0; j < 10; j++){
           for(int i = 0; i < 5; i++){
               instance.insertVPE(new VPE(instance,i,j,0));
               if(j==1 && i==4){
                   instance.insertVPE(temp);
               }
           }
        }
        VPE expResult = temp;
        VPE result = instance.getVPE(xPos, yPos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    
 /**
     * Test of getVPE method, of class VPEArray.
     */
    @Test
    public void testGetVPE2() {
        System.out.println("getVPE2");
        int xPos = 10;
        int yPos = 15;
        VPEArray instance = new VPEArray(5,10);
        for(int j=0; j < 10; j++){
           for(int i = 0; i < 5; i++){
               instance.insertVPE(new VPE(instance,i,j,0));
           }
        }
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
        System.out.println("getWidth1");
        VPEArray instance = new VPEArray(5,10);
        int expResult = 5;
        int result = instance.getWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
     /**
     * Test of getWidth method, of class VPEArray.
     */
    @Test
    public void testGetWidth2() {
        System.out.println("getWidth2");
        VPEArray instance = new VPEArray(0,10);
        int expResult = 0;
        int result = instance.getWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getHeight method, of class VPEArray.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight1");
        VPEArray instance = new VPEArray(5,10);
        int expResult = 10;
        int result = instance.getHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of getHeight method, of class VPEArray.
     */
    @Test
    public void testGetHeight2() {
        System.out.println("getHeight2");
        VPEArray instance = new VPEArray(5,0);
        int expResult = 0;
        int result = instance.getHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
