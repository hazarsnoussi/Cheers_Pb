/**
 * A set of tests of the methods of the class Incarnation2
 * Authors TeamD
 **/
package mathematical_Functions;

import static org.junit.Assert.*;

import org.junit.Test;

public class Incarnation2Test {

	 /**
     * Test of fixed point radians method, of class Incarnation2.
     */
    @Test public void testComputeFixedPointRadians() {
        System.out.println("Fixed Point Test");
        Incarnation2 instance = new Incarnation2();
        assertEquals(1.598695, instance.computeFixedPointRadians(1.0E-7), 1.0E-6);
    }

    /**
     * Test of compute overlap distance method, of class Incarnation2.
     */
    @Test
    public void testComputeOverlapDistance() {
        System.out.println("computeOverlapDistance");
        Incarnation2 instance = new Incarnation2();
        assertEquals(1.2113017,instance.computeOverlapDistance(2,1.0E-7), 1.0E-6);
    }
}
