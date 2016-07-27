/**
 * A set of tests of the methods of the class TrigonometricFunctions
 * Authors TeamD
 **/
package mathematical_Functions;

import org.junit.Test;
import static org.junit.Assert.*;

public class TrigonometricFunctionsTest {
    

   //Assert.assertEquals(null, expResult, result, result);

    /**
     * Test of NilakantahPI method, of class TrigonometricFunctions.
     */
    @Test
    public void testNilakantahPI() {
        System.out.println("NilakantahPI");
        TrigonometricFunctions instance = new TrigonometricFunctions();
        assertEquals(Math.PI, instance.nilakantahPI(1.0E-7),1.0E-6);
    }
    /**
     * Test of toRadians method, of class TrigonometricFunctions.
     */
    @Test
    public void testToRadians() {
        System.out.println("toRadians");
        TrigonometricFunctions instance = new TrigonometricFunctions();
        assertEquals(Math.toRadians(10), instance.toRadians(10,1E-7),1.0E-6);
    }

    /**
     * Test of sin method, of class TrigonometricFunctions.
     */
    @Test
    public void testSin() {
        System.out.println("sin");
        
        TrigonometricFunctions instance = new TrigonometricFunctions();
        assertEquals(Math.sin(0.3), instance.sin(0.3,1.0E-7),1.0E-6);
    }

    /**
     * Test of cos method, of class TrigonometricFunctions.
     */
    @Test
    public void testCos() {
        System.out.println("cos");
        TrigonometricFunctions instance = new TrigonometricFunctions();
        assertEquals(Math.cos(0.3), instance.cos(0.3,1.0E-7),1.0E-6);
    }
    
}
