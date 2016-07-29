/**
 * A set of methods to compute the angle and the distance of overlap using 
 * methods based on scratch code.
 **/

package  mathematical_Functions;

/**
 *
 * @authors TeamD
 */

public class OverlapDistance {
     protected double computeFixedPointRadians(double root,double epsilon) {
     TrigonometricFunctions trigo=new TrigonometricFunctions();
     ArithmeticFunctions fn=new ArithmeticFunctions();
    //returns the root of any : F(x)-x=0 if F fits the requirements 
    //of the Intermediate Values Theorem
     double x0;
     int i=0; 
        do
        {
         x0= root;//according to the graph of f(x)= 
         root=fn.fxRadians(x0,epsilon);
         i++;
        } while((fn.max((x0-root),(root-x0))>epsilon));  
    return(double)x0;   
    } 
   
    public String getFixedPointRadians(double epsilon,double root){
       return String.valueOf(computeFixedPointRadians(epsilon,root));
    } 
    
    protected double computeOverlapDistance(double radius,double root, double epsilon){
    //distance= 2*R(1-cos(x/2))   
    TrigonometricFunctions trigo=new TrigonometricFunctions();
    return(double)(2*radius*(1-trigo.cos((0.5*computeFixedPointRadians(root,epsilon)),epsilon)));   
    } 
    
    public String getOverlapDistance(double radius, double root,double epsilon){
    return String.valueOf(computeOverlapDistance(radius,root,epsilon));
    }
    
}
