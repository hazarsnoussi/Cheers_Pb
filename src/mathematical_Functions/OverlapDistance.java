/**
 * A set of methods to compute the angle and the distance of overlap using 
 * methods based on scratch code.
 **/
package  mathematical_Functions;

/**
 *
 * @author TeamD
 */

public class OverlapDistance {

    /**
     *
     * @param root initial value of x0, for F it will be initialized to 2
     * according to its graph
     * @param epsilon fixed to 1.0E-7
     * @return the root of any : F(x)-x=0 if F fits the requirements 
     * of the Intermediate Values Theorem
     */
    protected double computeFixedPointRadians(double root,double epsilon) {
     TrigonometricFunctions trigo=new TrigonometricFunctions();
     ArithmeticFunctions fn=new ArithmeticFunctions();
     double x0;
        do{
         x0= root;
         root=fn.fxRadians(x0,epsilon);
        } while((fn.max((x0-root),(root-x0))>epsilon));  
    return(double)x0;   
    } 
   
    /**
     *
     * @param epsilon fixed to 1.0e_7
     * @param root initial value of x0 
     * @return the equivalent String value of the angle 
     * used only in the class MainJFrame to set the value of the correspondent 
     * field text
     */
    public String getFixedPointRadians(double root,double epsilon){
       return String.valueOf(computeFixedPointRadians(root,epsilon));
    } 
    
    /**
     *
     * @param radius to be inputed by the user 
     * @param root value of initialization of x0, initialized to 2
     * @param epsilon fixed to 1.0E-7
     * @return the overlap distance
     */
    protected double computeOverlapDistance(double radius,double root, double epsilon){
      
    TrigonometricFunctions trigo=new TrigonometricFunctions();
    return(double)(2*radius*(1-trigo.cos((0.5*computeFixedPointRadians(root,epsilon)),epsilon)));   
    } 
    
    /**
     *
     * @param radius to be inputed by user
     * @param root initial value of x0 
     * @param epsilon fixed to 1.0E-7
     * @return the equivalent string value of the distance of overlap
     * used only in MainJFrame class to set the value of the correspondent 
     * filed text 
     */
    public String getOverlapDistance(double radius, double root,double epsilon){
    return String.valueOf(computeOverlapDistance(radius,root,epsilon));
    }
    
}
