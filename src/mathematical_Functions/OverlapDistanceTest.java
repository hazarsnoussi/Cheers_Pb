package mathematical_Functions;

import static org.junit.Assert.*;

import org.junit.Test;

public class OverlapDistanceTest {

	@Test
	public void testComputeFixedPointRadians() {
		System.out.println("Function to compute fixed point radians");
        double eps = 0.0;
        OverlapDistance instance = new OverlapDistance();
        double expResult = 0.0;
        double result = instance.computeFixedPointRadians(eps);
        assertEquals(expResult, result, 0.0);
	}
	
	@Test
	public void testComputeOverlapDistance() {
		System.out.println("Function to compute fixed point radians");
		double radius = 10;
        double eps = 0.0;
        OverlapDistance instance = new OverlapDistance();
        double expResult = 0.0;
        double result = instance.computeOverlapDistance(radius,eps);
        assertEquals(expResult, result, 0.0);
	}
	
	

}
