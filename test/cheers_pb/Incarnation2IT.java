/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheers_pb;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fadhel
 */
public class Incarnation2IT {
    
    public Incarnation2IT() {
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
     * Test of Fx method, of class Incarnation2.
     */
    @Test
    public void testFx() {
        System.out.println("Fx");
        double x = 0.0;
        Incarnation2 instance = new Incarnation2();
        double expResult = 0.0;
        double result = instance.Fx(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Gx method, of class Incarnation2.
     */
    @Test
    public void testGx() {
        System.out.println("Gx");
        double eps = 0.0;
        Incarnation2 instance = new Incarnation2();
        double expResult = 0.0;
        double result = instance.Gx(eps);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Hx method, of class Incarnation2.
     */
    @Test
    public void testHx() {
        System.out.println("Hx");
        double R = 0.0;
        double eps = 0.0;
        Incarnation2 instance = new Incarnation2();
        double expResult = 0.0;
        double result = instance.Hx(R, eps);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
