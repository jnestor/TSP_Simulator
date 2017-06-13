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
public class VPETest {
    
    public VPETest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception{
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception{
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of update method, of class VPE.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        VPE instance = new VPE();
        boolean expResult = false;
        boolean result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of onLeftEdge method, of class VPE.
     */
    @Test
    public void testOnLeftEdge() {
        System.out.println("onLeftEdge");
        VPEArray vpea = new VPEArray(5,10);
        VPE instance = new VPE(vpea,0,4);
        boolean expResult = true;
        boolean result = instance.onLeftEdge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of onLeftEdge method, of class VPE.
     */
    @Test
    public void testOnLeftEdge2() {
        System.out.println("onLeftEdge2");
        VPEArray vpea = new VPEArray(5,10);
        VPE instance = new VPE(vpea,1,4);
        boolean expResult = false;
        boolean result = instance.onLeftEdge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of onRightEdge method, of class VPE.
     */
    @Test
    public void testOnRightEdge() {
        System.out.println("onRightEdge");
        VPEArray vpea = new VPEArray(5,10);
        VPE instance = new VPE(vpea,4,4);
        boolean expResult = true;
        boolean result = instance.onRightEdge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

     /**
     * Test of onRightEdge method, of class VPE.
     */
    @Test
    public void testOnRightEdge2() {
        System.out.println("onRightEdge2");
        VPEArray vpea = new VPEArray(5,10);
        VPE instance = new VPE(vpea,3,4);
        boolean expResult = false;
        boolean result = instance.onRightEdge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of onTopEdge method, of class VPE.
     */
    @Test
    public void testOnTopEdge() {
        System.out.println("onTopEdge");
        VPEArray vpea = new VPEArray(5,10);
        VPE instance = new VPE(vpea,3,0);
        boolean expResult = true;
        boolean result = instance.onTopEdge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
      /**
     * Test of onTopEdge method, of class VPE.
     */
    @Test
    public void testOnTopEdge2() {
        System.out.println("onTopEdge2");
        VPEArray vpea = new VPEArray(5,10);
        VPE instance = new VPE(vpea,3,2);
        boolean expResult = false;
        boolean result = instance.onTopEdge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of onBottomEdge method, of class VPE.
     */
    @Test
    public void testOnBottomEdge() {
        System.out.println("onBottomEdge");
        VPEArray vpea = new VPEArray(5,10);
        VPE instance = new VPE(vpea,3,9);
        boolean expResult = true;
        boolean result = instance.onBottomEdge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of onBottomEdge method, of class VPE.
     */
    @Test
    public void testOnBottomEdge2() {
        System.out.println("onBottomEdge2");
        VPEArray vpea = new VPEArray(5,10);
        VPE instance = new VPE(vpea,3,7);
        boolean expResult = false;
        boolean result = instance.onBottomEdge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    
    /**
     * Test of onLeftEdge method, of class VPE.
     */
    @Test
    public void testOnLeftEdge3() {
        System.out.println("onLeftEdge3");
        VPEArray vpea = new VPEArray(5,10);
        VPE[][] temp = new VPE[10][5];
        for(int j=0; j < 10; j++){
           for(int i = 0; i < 5; i++){
               temp[j][i]=new VPE(vpea,i,j);
               vpea.insertVPE(temp[j][i]);
           }
        }
        VPE instance = vpea.getVPE(0,4);
        boolean expResult = true;
        boolean result = instance.onLeftEdge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of onLeftEdge method, of class VPE.
     */
    @Test
    public void testOnLeftEdge4() {
        System.out.println("onLeftEdge4");
        VPEArray vpea = new VPEArray(5,10);
        VPE[][] temp = new VPE[10][5];
        for(int j=0; j < 10; j++){
           for(int i = 0; i < 5; i++){
               temp[j][i]=new VPE(vpea,i,j);
               vpea.insertVPE(temp[j][i]);
           }
        }
        VPE instance = vpea.getVPE(1,4);
        boolean expResult = false;
        boolean result = instance.onLeftEdge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of onRightEdge method, of class VPE.
     */
    @Test
    public void testOnRightEdge3() {
        System.out.println("onRightEdge3");
        VPEArray vpea = new VPEArray(5,10);
        VPE[][] temp = new VPE[10][5];
        for(int j=0; j < 10; j++){
           for(int i = 0; i < 5; i++){
               temp[j][i]=new VPE(vpea,i,j);
               vpea.insertVPE(temp[j][i]);
           }
        }
        VPE instance = vpea.getVPE(4,4);
        boolean expResult = true;
        boolean result = instance.onRightEdge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

     /**
     * Test of onRightEdge method, of class VPE.
     */
    @Test
    public void testOnRightEdge4() {
        System.out.println("onRightEdge4");
        VPEArray vpea = new VPEArray(5,10);
        VPE[][] temp = new VPE[10][5];
        for(int j=0; j < 10; j++){
           for(int i = 0; i < 5; i++){
               temp[j][i]=new VPE(vpea,i,j);
               vpea.insertVPE(temp[j][i]);
           }
        }
        VPE instance = vpea.getVPE(3,4);
        boolean expResult = false;
        boolean result = instance.onRightEdge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of onTopEdge method, of class VPE.
     */
    @Test
    public void testOnTopEdge3() {
        System.out.println("onTopEdge3");
        VPEArray vpea = new VPEArray(5,10);
        VPE[][] temp = new VPE[10][5];
        for(int j=0; j < 10; j++){
           for(int i = 0; i < 5; i++){
               temp[j][i]=new VPE(vpea,i,j);
               vpea.insertVPE(temp[j][i]);
           }
        }
        VPE instance = vpea.getVPE(3,0);
        boolean expResult = true;
        boolean result = instance.onTopEdge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
      /**
     * Test of onTopEdge method, of class VPE.
     */
    @Test
    public void testOnTopEdge4() {
        System.out.println("onTopEdge4");
        VPEArray vpea = new VPEArray(5,10);
        VPE[][] temp = new VPE[10][5];
        for(int j=0; j < 10; j++){
           for(int i = 0; i < 5; i++){
               temp[j][i]=new VPE(vpea,i,j);
               vpea.insertVPE(temp[j][i]);
           }
        }
        VPE instance = vpea.getVPE(3,2);
        boolean expResult = false;
        boolean result = instance.onTopEdge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of onBottomEdge method, of class VPE.
     */
    @Test
    public void testOnBottomEdge3() {
        System.out.println("onBottomEdge");
        VPEArray vpea = new VPEArray(5,10);
        VPE[][] temp = new VPE[10][5];
        for(int j=0; j < 10; j++){
           for(int i = 0; i < 5; i++){
               temp[j][i]=new VPE(vpea,i,j);
               vpea.insertVPE(temp[j][i]);
           }
        }
        VPE instance = vpea.getVPE(3,9);
        boolean expResult = true;
        boolean result = instance.onBottomEdge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of onBottomEdge method, of class VPE.
     */
    @Test
    public void testOnBottomEdge4() {
        System.out.println("onBottomEdge4");
        VPEArray vpea = new VPEArray(5,10);
        VPE[][] temp = new VPE[10][5];
        for(int j=0; j < 10; j++){
           for(int i = 0; i < 5; i++){
               temp[j][i]=new VPE(vpea,i,j);
               vpea.insertVPE(temp[j][i]);
           }
        }
        VPE instance = vpea.getVPE(3,7);
        boolean expResult = false;
        boolean result = instance.onBottomEdge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    
    /**
     * Test of getStatus method, of class VPE.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        VPE instance = new VPE();
        int expResult = -1;
        int result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWestNeighbor method, of class VPE.
     */
    @Test
    public void testGetWestNeighbor() {
        System.out.println("getWestNeighbor");
        VPEArray vpea = new VPEArray(5,10);
        VPE[][] temp = new VPE[10][5];
        for(int j=0; j < 10; j++){
           for(int i = 0; i < 5; i++){
               temp[j][i]=new VPE(vpea,i,j);
               vpea.insertVPE(temp[j][i]);
           }
        }
        VPE instance =  vpea.getVPE(3,7);
        VPE expResult = vpea.getVPE(2,7);
        System.out.println("instance"+instance);
        VPE result = instance.getWestNeighbor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of getWestNeighbor method, of class VPE.
     */
    @Test
    public void testGetWestNeighbor2() {
        System.out.println("getWestNeighbor2");
        VPEArray vpea = new VPEArray(5,10);
        VPE[][] temp = new VPE[10][5];
        for(int j=0; j < 10; j++){
           for(int i = 0; i < 5; i++){
               temp[j][i]=new VPE(vpea,i,j);
               vpea.insertVPE(temp[j][i]);
           }
        }
        VPE instance =  vpea.getVPE(0,7);
        VPE expResult = null;
        VPE result = instance.getWestNeighbor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNorthNeighbor method, of class VPE.
     */
    @Test
    public void testGetNorthNeighbor() {
        System.out.println("getNorthNeighbor");
        VPEArray vpea = new VPEArray(5,10);
        VPE[][] temp = new VPE[10][5];
        for(int j=0; j < 10; j++){
           for(int i = 0; i < 5; i++){
               temp[j][i]=new VPE(vpea,i,j);
               vpea.insertVPE(temp[j][i]);
           }
        }
        VPE instance =  vpea.getVPE(2,7);
        VPE expResult = vpea.getVPE(2,6);
        VPE result = instance.getNorthNeighbor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of getNorthNeighbor method, of class VPE.
     */
    @Test
    public void testGetNorthNeighbor2() {
        System.out.println("getNorthNeighbor2");
        VPEArray vpea = new VPEArray(5,10);
        VPE[][] temp = new VPE[10][5];
        for(int j=0; j < 10; j++){
           for(int i = 0; i < 5; i++){
               temp[j][i]=new VPE(vpea,i,j);
               vpea.insertVPE(temp[j][i]);
           }
        }
        VPE instance = vpea.getVPE(4,0);
        VPE expResult = null;
        VPE result = instance.getNorthNeighbor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getEastNeighbor method, of class VPE.
     */
    @Test
    public void testGetEastNeighbor() {
        System.out.println("getEastNeighbor");
        VPEArray vpea = new VPEArray(5,10);
        VPE[][] temp = new VPE[10][5];
        for(int j=0; j < 10; j++){
           for(int i = 0; i < 5; i++){
               temp[j][i]=new VPE(vpea,i,j);
               vpea.insertVPE(temp[j][i]);
           }
        }
        VPE instance = vpea.getVPE(2,5);
        VPE expResult = vpea.getVPE(3,5);
        VPE result = instance.getEastNeighbor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

     /**
     * Test of getEastNeighbor method, of class VPE.
     */
    @Test
    public void testGetEastNeighbor2() {
        System.out.println("getEastNeighbor2");
        VPEArray vpea = new VPEArray(5,10);
        VPE[][] temp = new VPE[10][5];
        for(int j=0; j < 10; j++){
           for(int i = 0; i < 5; i++){
               temp[j][i]=new VPE(vpea,i,j);
               vpea.insertVPE(temp[j][i]);
           }
        }
        VPE instance = vpea.getVPE(4,5);
        VPE expResult = null;
        VPE result = instance.getEastNeighbor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSouthNeighbor method, of class VPE.
     */
    @Test
    public void testGetSouthNeighbor() {
        System.out.println("getSouthNeighbor");
        VPEArray vpea = new VPEArray(5,10);
        VPE[][] temp = new VPE[10][5];
        for(int j=0; j < 10; j++){
           for(int i = 0; i < 5; i++){
               temp[j][i]=new VPE(vpea,i,j);
               vpea.insertVPE(temp[j][i]);
           }
        }
        VPE instance = vpea.getVPE(2,5);
        VPE expResult = vpea.getVPE(2,6);
        VPE result = instance.getSouthNeighbor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
     /**
     * Test of getSouthNeighbor method, of class VPE.
     */
    @Test
    public void testGetSouthNeighbor2() {
        System.out.println("getSouthNeighbor2");
        VPEArray vpea = new VPEArray(5,10);
        VPE[][] temp = new VPE[10][5];
        for(int j=0; j < 10; j++){
           for(int i = 0; i < 5; i++){
               temp[j][i]=new VPE(vpea,i,j);
               vpea.insertVPE(temp[j][i]);
           }
        }
        VPE instance = new VPE(vpea,1,9);
        VPE expResult = null;
        VPE result = instance.getSouthNeighbor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
