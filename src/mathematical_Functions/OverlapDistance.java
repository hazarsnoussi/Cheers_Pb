/**
 * A set of methods to compute the angle and the distance of overlap using 
 * methods based on scratch code.
 * 
 * @authors TeamD
 **/

package  mathematical_Functions;

public class OverlapDistance {
     protected double computeFixedPointRadians(double epsilon){
     TrigonometricFunctions trigo=new TrigonometricFunctions();
     ArithmeticFunctions fn=new ArithmeticFunctions();
    //compute the root of a function conform to the requirements of the intermediate values theorem
     double x;
     double root=2.0E0d;
     int i=0; 
        do
        {
         x= root;
         root=fn.fxRadians(x,epsilon);
         i++;
        } while((fn.max((x-root),(root-x))>epsilon));  
    return(double)root;   
    } 
   
    public String getFixedPointRadians(double epsilon){
       return String.valueOf(computeFixedPointRadians(epsilon));
    } 
    
    protected double computeOverlapDistance(double radius, double epsilon){
    //distance= 2*R(1-cos(x/2))   
    TrigonometricFunctions trigo=new TrigonometricFunctions();
    return(double)(2*radius*(1-trigo.cos((0.5*computeFixedPointRadians(epsilon)),epsilon)));   
    } 
    
    public String getOverlapDistance(double radius, double epsilon){
    return String.valueOf(computeOverlapDistance(radius,epsilon));
    }
    
}
