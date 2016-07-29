/**
 * A set of methods to compute the angle and the distance of overlap using 
 * the predefined methods the class java.lang.Math.
 **/
package mathematical_Functions;

/**
 *
 * @author TeamD
 */

public class Incarnation2 {

    /**
     *
     * @param degrees input in degrees 
     * @return the equivalent value in radians 
     * returns fxRadians(x)=sin(x)+pi/2
     * using java.lang.Math methods
     */
    protected double fxRadians(double degrees){
        return (double)(0.5*Math.PI)+Math.sin(Math.toRadians(degrees));
    }
    
    /**
     *
     * @param root value is not arbitrary 
     * but extracted from the graph of F(x)-x=0 
     * root will be equal to 2 in our program
     * root value is not arbitrary 
     * but extracted from the graph of F(x)-x=0 
     * root will be equal to 2 in our program
     * @param epsilon will be equal to 1.0E-7 for optimization purpose
     * @return the x0 where f(x0)=x0
     * It aims to return the root of any : F(x)-x=0 if F fits the requirements 
     * of the Intermediate Values Theorem
     */
    protected double computeFixedPointRadians(double root,double epsilon){
    
        double x;
        double x0=root;
        do 
        {
        x=x0;
        x0=fxRadians(x);
        }while( Math.abs(x-x0)>epsilon);
        System.out.println(fxRadians(x0));
        return (double)(x0);   
    }
   
    /**
     *
     * @param radius to be inputed by user 
     * @param root value of initialization of x0, initialized to 2 
     * @param epsilon fixed to 1.0E-7
     * @return the distance of overlap between the 2 coasters to satisfy the
     * requirements of the problem
     * returns l=2*R*(1-cos(x/2))
     */
    protected double computeOverlapDistance(double radius,double root,double epsilon){
        return (double)(2*radius*(1-Math.cos(0.5*computeFixedPointRadians(root,epsilon))));
       
    }
}
