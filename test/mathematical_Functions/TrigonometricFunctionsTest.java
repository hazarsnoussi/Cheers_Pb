/**
 * A set of tests of the methods of the class TrigonometricFunctions
 **/
package mathematical_Functions;

/**
 *
 * @authors TeamD
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TeamD
 */
public class TrigonometricFunctionsTest {
    //Test of NilakantahPI method, of class TrigonometricFunctions.

    /**
    * A set of tests obtained through our approximation & java predefined 
    *functions
    */
        @Test
    public void testNilakantahPI() {
        TrigonometricFunctions instance = new TrigonometricFunctions();
        assertEquals(Math.PI, instance.nilakantahPI(1.0E-7),1.0E-6);
    }
  
    /**
     * Test of toRadians method, of class TrigonometricFunctions.
     */
        @Test
    public void testToRadians() {
        TrigonometricFunctions instance = new TrigonometricFunctions();
        assertEquals(Math.toRadians(10), instance.toRadians(10,1E-7),1.0E-6);
    }

    /**
     *  Test of sin method, of class TrigonometricFunctions.
     */
        @Test
    public void testSin() {
        TrigonometricFunctions instance = new TrigonometricFunctions();
        assertEquals(Math.sin(0.3), instance.sin(0.3,1.0E-7),1.0E-6);
    }
    
    /**
     * Test of cos method, of class TrigonometricFunctions.
     */
        @Test
    public void testCos() {
        TrigonometricFunctions instance = new TrigonometricFunctions();
        assertEquals(Math.cos(0.3), instance.cos(0.3,1.0E-7),1.0E-6);
    }
}
