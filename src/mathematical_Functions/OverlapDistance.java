package  mathematical_Functions;
/**
 *
 * @authors TeamD
 */
public class OverlapDistance {
     protected double computeFixedPointRadians(double eps){
     TrigonometricFunctions trigo=new TrigonometricFunctions();
     ArithmeticFunctions fn=new ArithmeticFunctions();
    //compute the root of a function conform to the requirements of the intermediate values theorem
     double x;
     double root=2.0E0d;
     int i=0; 
        do
        {
         x= root;
         root=fn.fxRadians(x,eps);
         i++;
        } while((fn.max((x-root),(root-x))>eps));  
    return(double)root;   
    } 
   
    public String getFixedPointRadians(double eps){
       return String.valueOf(computeFixedPointRadians(eps));
    } 
    
    protected double computeOverlapDistance(double R, double eps){
    //distance= 2*R(1-cos(x/2))   
    TrigonometricFunctions trigo=new TrigonometricFunctions();
    return(double)(2*R*(1-trigo.cos((0.5*computeFixedPointRadians(eps)),eps)));   
    } 
    
    public String getOverlapDistance(double r, double eps){
    return String.valueOf(computeOverlapDistance(r,eps));
    }
    
}
