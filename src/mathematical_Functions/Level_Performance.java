package mathematical_Functions;
import java.util.Scanner;

/**
 *
 * @authors Team D
 */
public class Level_Performance {
    public double readRadius(double r){
        Scanner sc=new Scanner(System.in);
     try{
         System.out.println("Please, input a radius in [0..20]");   
         r=Double.parseDouble(sc.nextLine());    
        }
     catch(NumberFormatException e){
         System.out.println(r+" will be assigned as radius");
        }
     finally{
         if ((r>=0)&&(r<=20))
         System.out.println("Correct value for the radius");
         }
     return r;
    }
    
    public void print_error(double r, double eps){
        Trigonometric_Functions trigo=new Trigonometric_Functions();
        Arithmetic_Functions fn=new Arithmetic_Functions();
        Incarnation2 Inc=new Incarnation2();
        Overlap_Distance Odis= new Overlap_Distance();
        double x=0.375d;
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Values of testing parameters : Radius = "+r+" & Epselon= "+eps+" & (for testing cos & sin)x = "+ x);    
        double z,y,err;
        System.out.println("Approximation of Pi Wallis "+ 2*trigo.Wallis(eps)+"\n The value of PI using Math.PI = "+Math.PI);
        z = 2*trigo.Wallis(eps);
        y = Math.PI;
        System.out.println("Absolute error= " +fn.max(y-z,z-y));
        System.out.println("=============================================================================");
        y=trigo.cos(x,eps);
        System.out.println("Approximation of cos("+x+") = "+y+
                          "\n The value of cos("+x+") using Math.cos() = "+Math.cos(x));
        System.out.println("Absolute error= "+ fn.max(y-Math.cos(x),Math.cos(x)-y));
        System.out.println("=============================================================================");
        
      
        y=trigo.sin(x,eps);
        System.out.println("Approximation of sine("+x+") = "+y+
                         "\nThe value of sine("+x+")= using Math.sin()"+Math.sin(x));
        System.out.println("Absolute error= "+ fn.max(y-Math.sin(x),Math.sin(x)-y));
        
        System.out.println("=============================================================================");
        System.out.println("Half of the area = "+z*fn.power(r,2)+
                          "\nThe half of the area using Math.PI & Math.pow "+Math.PI*Math.pow(r, 2));
        System.out.println("Absolute error= "+fn.max(z*fn.power(r,2)-Math.PI*Math.pow(r, 2),Math.PI*Math.pow(r, 2)-z*fn.power(r,2)));
        System.out.println("============================================================================="); 
        y=Odis.fixed_Point_Radians(eps);
        z=Inc.fixed_Point_Radians(eps);
        System.out.println("Approximative value of the fixed point in Radians = "+y
                          + "\nThe value of the fixed point using Math.sin() "
                          + "\n& Math.PI with incarnation 2 functions = "+z);   
        System.out.println("Asolute error for the fixed point in Radians = "+fn.max((z-y),(y-z)));                                             
        System.out.println("=============================================================================");
        y=Odis.compute_Overlap_Distance(r,eps);
        z=Inc.compute_Overlap_Distance(r,eps);
        System.out.println("Approximation of the overlap distance= " +y+"\n The distance using Math.cos() and incarnation 2 functions = "+z);
        System.out.println("Asolute error for the length= "+fn.max(z-y,y-z));
        }
}
 /*
           double X=Math.toRadians(17.d);
           double R=15,z,y,err;
           System.out.println("Absolute error=" +err);
           System.out.println("Approximations for Epselon= "+eps+" and x= "+X+" Radius"+ R);
           //System.out.println("approximation of Pi "+ O.Leibiniz(eps)+"exact value using Math lib= "+Math.PI);
           /*System.out.println("approximation of Pi Nilakantah"+ O.Nilakantah(eps)+"exact value using Math lib= "+Math.PI);
           double z = O.Nilakantah(eps)-Math.PI;
           double y = Math.PI-O.Nilakantah(eps);
           double err =O.Max(y,z);
           System.out.println("Absolute error=" +err);*/
         /*  System.out.println("=============================================================================");    
           
           System.out.println("approximation of Pi Wallis "+ 2*O.Wallis(eps)+"exact value using Math lib= "+Math.PI);
           z = 2*O.Wallis(eps);
           y = Math.PI;
           err =O.Max(y-z,z-y);
           System.out.println("Absolute error=" +err);
           
           System.out.println("============================================================================="); 
           System.out.println("half of the area= "+2*O.Wallis(eps)*O.Power(R,2));
           System.out.println("============================================================================="); 
           
           z = O.cos(X,eps);
           y = Math.cos(X);
           System.out.println("approximation of cos("+X+")"+ O.cos(X,eps)+" exact value using Math lib= "+Math.cos(X));
           double w=O.cosapp(X, eps);
           err =O.Max(y-z,z-y);
           System.out.println("Absolute error1=" +err);
           z=O.cosapp(X,eps);
           err= O.Max(z-y,y-z);
           System.out.println("value of cos via an approximation + trigo rule "+z+" Absolute error2=" +err);
           System.out.println("=============================================================================");  
           z=O.sin(X,eps);y=Math.sin(X);
           System.out.println("approximation of sin("+X+")"+z +"exact value using Math lib= "+y);
           err =O.Max(y-z,z-y);

    
}*/
