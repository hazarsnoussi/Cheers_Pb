package mathematical_Functions;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrigonometricFunctionsTest {

	/**
     * Test of Nilakantah method, of class Scratch_Lib.
     */
    @Test
    public void testNilakantah() {
        System.out.println("Nilakantah");
        double epselon = 0.0;
        TrigonometricFunctions instance = new TrigonometricFunctions();
        double expResult = 3.14;
        double result = instance.NilakantahPI(epselon);
        assertEquals(expResult, result, 0.0);
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
        TrigonometricFunctions instance = new TrigonometricFunctions();
        double expResult = 0.0;
        double result = instance.sin(x, eps);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        TrigonometricFunctions instance = new TrigonometricFunctions();
        double expResult = 0.0;
        double result = instance.cos(x, eps);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
