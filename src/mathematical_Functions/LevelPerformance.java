/**
 * A set of methods to test the performance of our approximation for a given 
 * radius by computing the absolute error between our results and the the 
 * results based on e class java.lang.Math.
 * Beside it returns the Java version installed in the current machine, 
 * its OS name and its version
 **/
package mathematical_Functions;

/**
 *
 * @author TeamD
 */

import java.util.Scanner;
import java.lang.Exception;

/**
 *
 * @author TeamD
 */
public class LevelPerformance {
    
    /**
     *
     * @return a set of comparative results between Cheers approximation and 
     * java predefined function
     */
    public double readRadius()throws NumberFormatException{
        
        Scanner sc=new Scanner(System.in);
        double radius=-1;      
     do    
     try{
         System.out.println("Please, input a radius between [1..20]");   
         radius = Double.parseDouble(sc.nextLine());
         }
     
    catch (NumberFormatException exception1){ 
         if ((radius>20)||(radius<0)){
         System.out.println("The input radius wasn't in []");
         radius=-1;
         }
    }
     
     finally{
         if ((radius>0)&&(radius<=20))
         System.out.println("Correct value for the radius");
        
     }while ((radius <=0)||(radius>20) );
     return radius;
    }
    
    /**
     *
     * @param radius to be inputed by the user
     * @param epsilon fixed to 1.0E-7
     */
    public void print_error(double radius, double epsilon){
       
        TrigonometricFunctions trigo=new TrigonometricFunctions();
        ArithmeticFunctions fn=new ArithmeticFunctions();
        Incarnation2 Inc=new Incarnation2();
        OverlapDistance Odis= new OverlapDistance();
        double nilakantahPi = trigo.nilakantahPI(epsilon);
        double root=2.0d;
        
        System.out.println("The Java version of java  is : "+System.getProperty("java.version")+
       "\nThe current Os name and version are  : "+System.getProperty("os.name")+System.getProperty("os.version"));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Values of testing parameters : Radius = "+radius+" & Epselon= "+epsilon);    
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Approximation of PI by Nilakantah formula = "+ trigo.nilakantahPI(epsilon)+"\nMath.PI = "+Math.PI);
        System.out.println("Absolute error =" +fn.max(nilakantahPi-Math.PI,Math.PI-nilakantahPi));
        System.out.println("=============================================================================");  
        System.out.println("Approximation of the half of the area = "+0.5*nilakantahPi*fn.power(radius,2)+
                          "\nThe half of the area using Math.PI & Math.pow "+0.5*Math.PI*Math.pow(radius, 2));
        System.out.println("Absolute error= "+fn.max( ((0.5*nilakantahPi*fn.power(radius,2))-(0.5*Math.PI*Math.pow(radius, 2))),       
                                                      ((0.5*Math.PI*Math.pow(radius, 2))-(0.5*nilakantahPi*fn.power(radius,2)))));
        System.out.println("=============================================================================");
         
        double approxFixedPoint=Odis.computeFixedPointRadians(epsilon,2.0);
        double exactFixedPoint=Inc.computeFixedPointRadians(root,epsilon);
        System.out.println("Approximative value of the fixed point in Radians = "+approxFixedPoint
                          + "\nThe value of the fixed point using Math.sin() "
                          + "\n& Math.PI with incarnation 2 functions = "+exactFixedPoint);   
        System.out.println("Asolute error for the fixed point in Radians = "+fn.max((approxFixedPoint-exactFixedPoint)
                                                                                     ,(exactFixedPoint-approxFixedPoint)));                                             
        System.out.println("=============================================================================");
        double approxOverlap=Odis.computeOverlapDistance(radius,root,epsilon);
        double exactOverlap=Inc.computeOverlapDistance(radius,root,epsilon);
        System.out.println("Approximation of the overlap distance= " +approxOverlap+
                            "\nThe distance using Math.cos() and incarnation 2 functions = "+exactOverlap);
        System.out.println("Asolute error for the length= "+fn.max(approxOverlap-exactOverlap,exactOverlap-approxOverlap));
        System.out.println("=============================================================================");
    }       
}
