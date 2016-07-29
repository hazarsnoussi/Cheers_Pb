/**
 * A set of tests of the methods of the class Incarnation2
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
public class Incarnation2Test {
    
    /**
     * Test of ComputeFixedPointRadians method, of class Incarnation2.
     */
    @Test public void testComputeFixedPointRadians() {
        Incarnation2 instance = new Incarnation2();
        assertEquals(1.598695, instance.computeFixedPointRadians(2.0d,1.0E-7), 1.0E-6);
    }

    /**
     * Test of ComputeOverlapDistance method, of class Incarnation2.
     */
    @Test
    public void testComputeOverlapDistance() {
        Incarnation2 instance = new Incarnation2();
        assertEquals(1.2113017,instance.computeOverlapDistance(2,2.0d,1.0E-7), 1.0E-6);
    }
}
