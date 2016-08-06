/**
 * A set of some useful arithmetic functions made form scratch code.
 * 
 **/
package  com.cheers.math;

/**
 *
 * @author TeamD
 */

public class ArithmeticFunctions {
//An ArithmeticException exception is thrown if abs(n) > 999999999

    /**
     *
     * @param a that will be raised to a power n 
     * @param n the value of the exponent 
     * @return a to power n 
     */
        protected double power(double a,int n){
      if (n==0) return 1;
              else {
                   if(n%2==0)
                   return(double)(power(a,n/2)*power(a,n/2));
                   else return (double)(a*power(a,n/2)*power(a,n/2));
                   }
    }
     
    /**
     *
     * @param n the input for factorial method
     * @return factorial of n 
     */
    protected double factorial(int n){
        if (n==0) return 1;
        else return (double)(n*factorial(n-1));
    }
    
    /**
     *
     * @param a input for max method
     * @param b input for max method
     * @return the greater value between 2 given numbers
     */
    protected double max(double a, double b){
        if (a-b<0)
        return b;
        else return a;
    }
    
    /**
     *
     * @param x input to be converted in radians
     * @param epsilon fixed to 1.0E-7
     * @return sin(x)+pi/2
     */
    protected double fxRadians(double x,double epsilon){
        TrigonometricFunctions trigo=new TrigonometricFunctions();
        return (double)(trigo.sin(trigo.toRadians(x,epsilon),epsilon)+0.5*trigo.nilakantahPI(epsilon));
    }  
}
