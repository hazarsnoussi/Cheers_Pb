package  mathematical_Functions;
/**
 *
 * @authors TeamD
 */
public class Overlap_Distance {
    protected double compute_Overlap_Distance(double R, double eps){
    //g(x)= 2*R(1-cos(x/2))   
    Arithmetic_Functions fn=new Arithmetic_Functions();
    Trigonometric_Functions trigo=new Trigonometric_Functions();
    return(double)(2*R*(1-trigo.cos((0.5*fn.fixed_Point_Radians(eps)),eps)));   
    } 
    public void get_Overlap_Distance(double r, double eps){
    System.out.println("The overlap distance = "+ compute_Overlap_Distance(r,eps));
    }
}
