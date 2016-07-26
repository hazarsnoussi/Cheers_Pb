package  mathematical_Functions;
/**
 *
 * @authors Team D
 */
public class ArithmeticFunctions {
//An ArithmeticException exception is thrown if abs(n) > 999999999
    protected double power(double a,int n){
      if (n==0) return 1;
              else {
                   if(n%2==0)
                   return(double)(power(a,n/2)*power(a,n/2));
                   else return (double)(a*power(a,n/2)*power(a,n/2));
                   }
    }
     
    protected double factorial(int n){
        if (n==0) return 1;
        else return (double)(n*factorial(n-1));
    }
    
    protected double max(double a, double b){
        if (a-b<0)
        return b;
        else return a;
    }
    
    protected double fxRadians(double x,double eps){
        //fxRadians(x)=sin(x)+pi/2
        TrigonometricFunctions trigo=new TrigonometricFunctions();
        return (double)(trigo.sin(trigo.toRadians(x,eps),eps)+0.5*trigo.NilakantahPI(eps));
    }  
}
