package  mathematical_Functions;
/**
 *
 * @authors TeamD
 */
public class Overlap_Distance {
     protected double fixed_Point_Radians(double eps){
     Trigonometric_Functions trigo=new Trigonometric_Functions();
     Arithmetic_Functions fn=new Arithmetic_Functions();
    //compute the root of a function conform to the requirements of the intermediate values theorem
     double x;
     double x0=2.0E0d;
     int i=0; 
        do
        {
         x= x0;
         x0=fn.fx_Radians(x,eps);
         i++;
        } while((fn.max((x-x0),(x0-x))>eps));  
    return(double)x0;   
    } 
   
    public String get_fixed_Point_Radians(double eps){
       return String.valueOf(fixed_Point_Radians(eps));
    }  
    protected double compute_Overlap_Distance(double R, double eps){
    //g(x)= 2*R(1-cos(x/2))   
    Arithmetic_Functions fn=new Arithmetic_Functions();
    Trigonometric_Functions trigo=new Trigonometric_Functions();
    return(double)(2*R*(1-trigo.cos((0.5*fixed_Point_Radians(eps)),eps)));   
    } 
    public String get_Overlap_Distance(double r, double eps){
    return String.valueOf(compute_Overlap_Distance(r,eps));
    }
}
