/**
 * A set of trigonometric functions made form scratch code 
 **/
package mathematical_Functions;

/**
 *
 * @author TeamD
 */

public class TrigonometricFunctions {
    
ArithmeticFunctions fn=new ArithmeticFunctions();   
  
    /**
     *
     * @param epsilon fixed to 1.0e-7
     * @return an approximate value of PI using Nilakantah formula 
     * π=3+(4/2*3*4)-4/(4*5*6)+4/(6*7*8)-4/(8*9*10)...
     */
    protected double nilakantahPI(double epsilon){
    
    double successor=3.d;
    double predecessor=0.d;
    int i=2;
  
     do {
        predecessor=successor;
        successor=predecessor+(double)((double)fn.power(-1,1+i/2)*(double)(4/(double)(i*(i+1)*(i+2))));                   
        i+=2;
       
     }while(fn.max(predecessor-successor,successor-predecessor)>epsilon);
    return (double)predecessor;            
    }
    
     /**
     *
     * @param epsilon fixed to 1.0E-7
     * print the value of PI through Nilakantah method
     */
    public void getPiNilakantah(double epsilon){
    System.out.println("Approximative value of PI via Nilakantah formula = "+nilakantahPI(epsilon));
    }
 
    /**
     *
     * @param inDegree degree value to be converted in radians
     * @param eps fixed to 1.0E-7
     * @return the equivalent value in radians
     */
    protected double toRadians(double inDegree,double eps){
    return(double)(nilakantahPI(eps)*inDegree)/180;
    }  
     
    /**
     *
     * @param x value given to sine to compute sin(x)
     * @param epsilon fixed to 1.0E-7
     * @return sin(x)
     * using Taylor formula sin (x) = x - (x3/3!) + (x5/5!) - (x7/7!)...
     */
    protected double sin (double x,double epsilon){
        int i=1;
        double predecessor;
        double successor =x;
        do{
            predecessor=successor;
            successor=predecessor+(double)(fn.power(-1,i))*(fn.power(x,2*i+1)/fn.factorial(2*i+1));
            i++;
        }while(fn.max((predecessor-successor),(successor-predecessor))>epsilon);
        return (double) predecessor;
    }
   
    /**
     *
     * @param x input for the sine 
     * @param eps fixed to 1.0E-7
     * @return cos(x)
     * using Taylor_cos(x)=1-x2/2!+x4/4!-x6/6!...
     */
    protected double cos(double x,double eps){
        int i=1;
        double predecessor;
        double successor=1.d;
        do {
        predecessor=successor;
        successor= predecessor+(double)((double)fn.power(-1,i)*(double)((double)fn.power(x,2*i)/(double)fn.factorial(2*i)));
        i++; 
        }while(fn.max((predecessor-successor),(successor-predecessor))>eps);
        return (double)successor;
    }
}
