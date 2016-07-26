package mathematical_Functions;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticFunctionsTest {

	/**
     * Test of Power method, of class Scratch_Lib.
     * power(x.0)=1 power(0,0)=1 and power(1,n)=1 and power(n,1)=n
     *  An ArithmeticException exception is thrown if abs(n) > 999999999
     */
    @Test
    public void testPower() {
        System.out.println("Power");
        double power = 1.0;
        int number = 1;
        ArithmeticFunctions instance = new ArithmeticFunctions();
        double expResult = 1.0;
        double result = instance.power(power, number);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of Factorial method, of class Scratch_Lib.
     * Factorial(0)=1 and Factorial(1)=1;
     * An ArithmeticException exception is thrown if abs(n) > 999999999
     */
    @Test
    public void testFactorial() {
        System.out.println("Factorial");
        int n = 0;
        ArithmeticFunctions instance = new ArithmeticFunctions();
        double expResult = 0.0;
        double result = instance.factorial(n);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of Max method, of class Scratch_Lib.
     * x=y return x 
     * if x>y return x else return y
     */
    @Test
    public void testMax() {
        System.out.println("Max");
        double a = 0.0;
        double b = 0.0;
        ArithmeticFunctions instance = new ArithmeticFunctions();
        double expResult = 0.0;
        double result = instance.max(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
    

}
