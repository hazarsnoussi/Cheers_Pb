package mathematical_Functions;

import static org.junit.Assert.*;

import org.junit.Test;

public class Incarnation2Test {

	 /**
     * Test of fixed point radians method, of class Incarnation2.
     */
    @Test
    public void testFixedPointRadians() {
        System.out.println("Fx");
        double x = 0.0;
        Incarnation2 instance = new Incarnation2();
        double expResult = 0.0;
        double result = instance.fxRadians(x);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of fixed point degrees method, of class Incarnation2.
     */
    @Test
    public void testFixedPointDegrees() {
        System.out.println("Gx");
        double eps = 0.0;
        Incarnation2 instance = new Incarnation2();
        double expResult = 0.0;
        double result = instance.computeFixedPointRadians(eps);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of compute overlap distance method, of class Incarnation2.
     */
    @Test
    public void testComputeOverlapDistance() {
        System.out.println("Hx");
        double R = 0.0;
        double eps = 0.0;
        Incarnation2 instance = new Incarnation2();
        double expResult = 0.0;
        double result = instance.computeOverlapDistance(R, eps);
        assertEquals(expResult, result, 0.0);
    }

}
