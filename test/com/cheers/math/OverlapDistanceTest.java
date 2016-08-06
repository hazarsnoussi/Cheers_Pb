/**
 * A set of tests of the methods of the class OverlapDistance
 **/
package com.cheers.math;

/**
 *
 * @authors TeamD
 */

import com.cheers.math.OverlapDistance;
import com.cheers.math.Incarnation2;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TeamD
 */
public class OverlapDistanceTest {
    
    /**
     * Test of computeFixedPointRadians method, of class OverlapDistance.
     */
    @Test public void testComputeFixedPointRadians() {
        OverlapDistance instance1 = new OverlapDistance();
        Incarnation2 instance2 = new Incarnation2();
        assertEquals(instance2.computeFixedPointRadians(2.0d,1.0E-7), instance1.computeFixedPointRadians(2.0d,1.0E-7), 1.0E-6);
    }

    /**
     * Test of ComputeOverlapDistance method, of class Incarnation2.
     */
    @Test
    public void testComputeOverlapDistance() {
        OverlapDistance instance1 = new OverlapDistance();
        Incarnation2 instance2 = new Incarnation2();
        assertEquals(instance2.computeOverlapDistance(2,2.0d,1.0E-7),instance1.computeOverlapDistance(2,2.0d,1.0E-7), 1.0E-6);
    }
    
}
