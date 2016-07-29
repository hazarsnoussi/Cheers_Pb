/**
 * A set of methods to compute the angle and the distance of overlap using 
 * the predefined methods the class java.lang.Math.
 **/

package mathematical_Functions;

/**
 *
 * @authors TeamD
 */

public class Incarnation2 {
    protected double fxRadians(double degrees){
    //fxRadians(x)=sin(x)+pi/2
        return (double)(0.5*Math.PI)+Math.sin(Math.toRadians(degrees));
    }
    
    protected double computeFixedPointRadians(double root,double epsilon){
    //returns the root of any : F(x)-x=0 if F fits the requirements 
    //of the Intermediate Values Theorem
        double x;
        double x0=root;//root value is not arbitrary 
                     //but extracted from the graph of F(x)-x=0 
                     //root will be equal to 2 in our program
        int i=0;
        do 
        {
        x=x0;
        x0=fxRadians(x);
        i++;
        }while( Math.abs(x-x0)>epsilon);
        System.out.println(fxRadians(x0));
        return (double)(x0);   
    }
   

    protected double computeOverlapDistance(double radius,double root,double epsilon){
    //returns l=2*R*(1-cos(x/2))     
        return (double)(2*radius*(1-Math.cos(0.5*computeFixedPointRadians(root,epsilon))));
       
    }
}
