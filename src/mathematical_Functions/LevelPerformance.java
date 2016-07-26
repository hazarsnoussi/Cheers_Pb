/**
 *
 * @authors Team D
 */
package mathematical_Functions;
import java.util.Scanner;

public class LevelPerformance {
    
    public double readRadius(double radius){
        Scanner sc=new Scanner(System.in);
     try{
         System.out.println("Please, input a radius in [1..20]");   
         radius=Double.parseDouble(sc.nextLine());    
        }
     catch(NumberFormatException e){
         System.out.println("The input radius wasn't in [1..20]");
        }
     finally{
         if ((radius>0)&&(radius<=20))
         System.out.println("Correct value for the radius");
         else {
            radius=1;
            System.out.println("The radius will be = "+ radius);
            
            }
         }
     return radius;
    }
    
    public void print_error(double radius, double epsilon){
        TrigonometricFunctions trigo=new TrigonometricFunctions();
        ArithmeticFunctions fn=new ArithmeticFunctions();
        Incarnation2 Inc=new Incarnation2();
        OverlapDistance Odis= new OverlapDistance();
        double nilakantahPi = trigo.NilakantahPI(epsilon);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Values of testing parameters : Radius = "+radius+" & Epselon= "+epsilon);    
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Approximation of PI by Nilakantah formula = "+ trigo.NilakantahPI(epsilon)+"\nMath.PI = "+Math.PI);
        System.out.println("Absolute error =" +fn.max(nilakantahPi-Math.PI,Math.PI-nilakantahPi));
        System.out.println("=============================================================================");  
        System.out.println("Approximation of the half of the area = "+0.5*nilakantahPi*fn.power(radius,2)+
                          "\nThe half of the area using Math.PI & Math.pow "+0.5*Math.PI*Math.pow(radius, 2));
        System.out.println("Absolute error= "+fn.max( ((0.5*nilakantahPi*fn.power(radius,2))-(0.5*Math.PI*Math.pow(radius, 2))),       
                                                      ((0.5*Math.PI*Math.pow(radius, 2))-(0.5*nilakantahPi*fn.power(radius,2)))));
        System.out.println("=============================================================================");
         
        double approxFixedPoint=Odis.computeFixedPointRadians(epsilon);
        double exactFixedPoint=Inc.computeFixedPointRadians(epsilon);
        System.out.println("Approximative value of the fixed point in Radians = "+approxFixedPoint
                          + "\nThe value of the fixed point using Math.sin() "
                          + "\n& Math.PI with incarnation 2 functions = "+exactFixedPoint);   
        System.out.println("Asolute error for the fixed point in Radians = "+fn.max((approxFixedPoint-exactFixedPoint)
                                                                                     ,(exactFixedPoint-approxFixedPoint)));                                             
        System.out.println("=============================================================================");
        double approxOverlap=Odis.computeOverlapDistance(radius,epsilon);
        double exactOverlap=Inc.computeOverlapDistance(radius,epsilon);
        System.out.println("Approximation of the overlap distance= " +approxOverlap+
                            "\nThe distance using Math.cos() and incarnation 2 functions = "+exactOverlap);
        System.out.println("Asolute error for the length= "+fn.max(approxOverlap-exactOverlap,exactOverlap-approxOverlap));
        System.out.println("=============================================================================");
    }       
}
