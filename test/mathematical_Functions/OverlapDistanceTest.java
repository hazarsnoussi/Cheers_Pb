/**
 * A set of tests of the methods of the class OverlapDistance
 **/
package mathematical_Functions;

/**
 *
 * @authors TeamD
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class OverlapDistanceTest {
    
    /**
     * Test of fixed point radians method, of class OverlapDistance.
     */
    @Test public void testComputeFixedPointRadians() {
        System.out.println("Fixed Point Test");
        OverlapDistance instance1 = new OverlapDistance();
        Incarnation2 instance2 = new Incarnation2();
        assertEquals(instance2.computeFixedPointRadians(2.0d,1.0E-7), instance1.computeFixedPointRadians(2.0d,1.0E-7), 1.0E-6);
    }

    /**
     * Test of compute overlap distance method, of class Incarnation2.
     */
    @Test
    public void testComputeOverlapDistance() {
        System.out.println("computeOverlapDistance");
        OverlapDistance instance1 = new OverlapDistance();
        Incarnation2 instance2 = new Incarnation2();
        assertEquals(instance2.computeOverlapDistance(2,2.0d,1.0E-7),instance1.computeOverlapDistance(2,2.0d,1.0E-7), 1.0E-6);
    }
    
}
