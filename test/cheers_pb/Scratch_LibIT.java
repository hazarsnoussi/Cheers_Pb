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
public class Scratch_LibIT {
    
    public Scratch_LibIT() {
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
     * Test of Power method, of class Scratch_Lib.
     * power(x.0)=1 power(0,0)=1 and power(1,n)=1 and power(n,1)=n
     *  An ArithmeticException exception is thrown if abs(n) > 999999999
     */
    @Test
    public void testPower() {
        System.out.println("Power");
        double a = 0.0;
        int n = 0;
        Scratch_Lib instance = new Scratch_Lib();
        double expResult = 0.0;
        double result = instance.Power(a, n);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Factorial method, of class Scratch_Lib.
     * Factorial(0)=1 and Factorial(1)=1;
     * An ArithmeticException exception is thrown if abs(n) > 999999999
     */
    @Test
    public void testFactorial() {
        System.out.println("Factorial");
        int n = 0;
        Scratch_Lib instance = new Scratch_Lib();
        double expResult = 0.0;
        double result = instance.Factorial(n);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Max method, of class Scratch_Lib.
     * x=y return x 
     * if x>y return x else return y
     */
    @Test
    public void testMax() {
        System.out.println("Max");
        double a = 0.0;
        double b = 0.0;
        Scratch_Lib instance = new Scratch_Lib();
        double expResult = 0.0;
        double result = instance.Max(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Wallis method, of class Scratch_Lib.
     * pi=3.141592 if eps=1E-
     */
    @Test
    public void testWallis() {
        System.out.println("Wallis");
        double eps = 0.0;
        Scratch_Lib instance = new Scratch_Lib();
        double expResult = 0.0;
        double result = instance.Wallis(eps);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Nilakantah method, of class Scratch_Lib.
     */
    @Test
    public void testNilakantah() {
        System.out.println("Nilakantah");
        double epselon = 0.0;
        Scratch_Lib instance = new Scratch_Lib();
        double expResult = 0.0;
        double result = instance.Nilakantah(epselon);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Leibiniz method, of class Scratch_Lib.
     */
    @Test
    public void testLeibiniz() {
        System.out.println("Leibiniz");
        double eps = 0.0;
        Scratch_Lib instance = new Scratch_Lib();
        double expResult = 0.0;
        double result = instance.Leibiniz(eps);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sin method, of class Scratch_Lib.
     * //sin(0)=0 and sin(1)=0 and sin(pi/2)=1
     */
    @Test
    public void testSin() {
        System.out.println("sin");
        double x = 0.0;
        double eps = 0.0;
        Scratch_Lib instance = new Scratch_Lib();
        double expResult = 0.0;
        double result = instance.sin(x, eps);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of f method, of class Scratch_Lib.
     */
    @Test
    public void testF() {
        System.out.println("f");
        double x = 0.0;
        double eps = 0.0;
        Scratch_Lib instance = new Scratch_Lib();
        double expResult = 0.0;
        double result = instance.f(x, eps);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Alpha method, of class Scratch_Lib.
     */
    @Test
    public void testAlpha() {
        System.out.println("Alpha");
        double eps = 0.0;
        Scratch_Lib instance = new Scratch_Lib();
        double expResult = 0.0;
        double result = instance.Alpha(eps);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cosapp method, of class Scratch_Lib.
     */
    @Test
    public void testCosapp() {
        System.out.println("cosapp");
        double x = 0.0;
        double eps = 0.0;
        Scratch_Lib instance = new Scratch_Lib();
        double expResult = 0.0;
        double result = instance.cosapp(x, eps);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cos method, of class Scratch_Lib.
     * cos(pi/2)=0 cos(pi)=-1
     */
    @Test
    public void testCos() {
        System.out.println("cos");
        double x = 0.0;
        double eps = 0.0;
        Scratch_Lib instance = new Scratch_Lib();
        double expResult = 0.0;
        double result = instance.cos(x, eps);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of length method, of class Scratch_Lib.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        double x = 0.0;
        double R = 0.0;
        double eps = 0.0;
        Scratch_Lib instance = new Scratch_Lib();
        double expResult = 0.0;
        double result = instance.length(R, eps);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}