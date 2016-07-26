/**
 *
 * @authors Team D
 */
package mathematical_Functions;
import java.util.Scanner;

public class LevelPerformance {
    
    public double readRadius(double r){
        Scanner sc=new Scanner(System.in);
     try{
         System.out.println("Please, input a radius in [1..20]");   
         r=Double.parseDouble(sc.nextLine());    
        }
     catch(NumberFormatException e){
         System.out.println("The input radius wasn't in [1..20]");
        }
     finally{
         if ((r>0)&&(r<=20))
         System.out.println("Correct value for the radius");
         else {
            r=1;
            System.out.println("The radius will be = "+ r);
            
            }
         }
     return r;
    }
    
    public void print_error(double r, double eps){
        TrigonometricFunctions trigo=new TrigonometricFunctions();
        ArithmeticFunctions fn=new ArithmeticFunctions();
        Incarnation2 Inc=new Incarnation2();
        OverlapDistance Odis= new OverlapDistance();
        double nilakantahPi = trigo.NilakantahPI(eps);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Values of testing parameters : Radius = "+r+" & Epselon= "+eps);    
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Approximation of PI by Nilakantah formula = "+ trigo.NilakantahPI(eps)+"\nMath.PI = "+Math.PI);
        System.out.println("Absolute error =" +fn.max(nilakantahPi-Math.PI,Math.PI-nilakantahPi));
        System.out.println("=============================================================================");
        System.out.println("Approximation of the half of the area = "+0.5*nilakantahPi*fn.power(r,2)+
                          "\nThe half of the area using Math.PI & Math.pow "+0.5*Math.PI*Math.pow(r, 2));
        System.out.println("Absolute error= "+fn.max( ((0.5*nilakantahPi*fn.power(r,2))-(0.5*Math.PI*Math.pow(r, 2))),       
                                                      ((0.5*Math.PI*Math.pow(r, 2))-(0.5*nilakantahPi*fn.power(r,2)))));
        System.out.println("=============================================================================");
        
        double approxFixedPoint=Odis.computeFixedPointRadians(eps);
        double exactFixedPoint=Inc.computeFixedPointRadians(eps);
        System.out.println("Approximative value of the fixed point in Radians = "+approxFixedPoint
                          + "\nThe value of the fixed point using Math.sin() "
                          + "\n& Math.PI with incarnation 2 functions = "+exactFixedPoint);   
        System.out.println("Asolute error for the fixed point in Radians = "+fn.max((approxFixedPoint-exactFixedPoint)
                                                                                     ,(exactFixedPoint-approxFixedPoint)));                                             
        System.out.println("=============================================================================");
        double approxOverlap=Odis.computeOverlapDistance(r,eps);
        double exactOverlap=Inc.computeOverlapDistance(r,eps);
        System.out.println("Approximation of the overlap distance= " +approxOverlap+
                            "\nThe distance using Math.cos() and incarnation 2 functions = "+exactOverlap);
        System.out.println("Asolute error for the length= "+fn.max(approxOverlap-exactOverlap,exactOverlap-approxOverlap));
        System.out.println("=============================================================================");
    }       
}
