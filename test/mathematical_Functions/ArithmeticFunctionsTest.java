/**
 * A set of tests of the methods of the class ArithmeticFunctions
 **/
package mathematical_Functions;

/**
 *
 * @authors TeamD
 */

import static org.junit.Assert.*;

import org.junit.Test;

/**
 *
 * @author TeamD
 */
public class ArithmeticFunctionsTest {
   
    /**
     * Test of Power method
     * An ArithmeticException exception is thrown if abs(n) > 999999999 
     */
        @Test
    public void testpower() {
        ArithmeticFunctions instance = new ArithmeticFunctions();
        instance.power(2,3);
        assertEquals(8, instance.power(2,3), 0.0);
    }

    /**
     * Test of Factorial method
     * An ArithmeticException exception is thrown if abs(n) > 999999999
     */
        @Test
    public void testfactorial() {
        ArithmeticFunctions instance = new ArithmeticFunctions();
        assertEquals(6,instance.factorial(3), 0.0);
    }

    
    /**
     *Test of max method
     */
        @Test
    public void testMax() {
        ArithmeticFunctions instance = new ArithmeticFunctions();
        assertEquals(5, instance.max(1,5), 0.0);
    }
    
}
