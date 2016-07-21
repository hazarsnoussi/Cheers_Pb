
package  mathematical_Functions;
/**
 *
 * @authors Team D
 */
public class Arithmetic_Functions {
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
    
    protected int round(double x){
      if ((x-(int)x)<0.5)
      return (int)x;
      else return (int)x+1;         
    }
    
    protected double fx_Radians(double x,double eps){
        Trigonometric_Functions trigo=new Trigonometric_Functions();
        //f(x)=sin(x)+pi/2 
        return (double)(trigo.sin(trigo.toRadians(x,eps),eps)+trigo.Wallis(eps));
    }  
   
    protected double fixed_Point_Radians(double eps){  
    //compute the root of a function conform to the requirements of the intermediate values theorem
     double x;
     double x0=2.0E0d;
     int i=0; 
        do
        {
         x= x0;
         x0=fx_Radians(x,eps);
         i++;
        } while((max((x-x0),(x0-x))>eps));  
    return(double)x0;   
    } 
   
    public void get_fixed_Point_Radians(double eps){
       System.out.println("Value of the fixed point in Radians = "+fixed_Point_Radians(eps));
    }  
}
