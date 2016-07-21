package mathematical_Functions;
/////////////////Incarnation 2 Using The Math lib  ////////////////////////////
public class Incarnation2 {
////////////////////////F returns F(x)=sin(x)+pi/2///////////////////////////
    protected double fx_Radians(double x){
        return (double)(0.5*Math.PI)+Math.sin(Math.toRadians(x));
    }
    protected double fx_Degrees(double x){
         return (double)(0.5*Math.PI)+Math.sin(x);
    }
////////////////////////F returns the root of F(x)=0///////////////////////////
///////////////////F is a genaral approximation for all functions admitting////
////////////////////////at least a root////////////////////////////////////////
////////////////////////The choice of the intial value is not arbitrary////////
////////////////////////x0 is extracted from CFx///////////////////////////////
    protected double fixed_Point_Radians(double eps){
        
        double x;
        double x0=2.d;
        int i=0;
        do 
        {
        x=x0;
        x0=fx_Radians(x);
        i++;
        }while( Math.abs(x-x0)>eps);
        return (double)(x0);   
    }
    
    protected double fixed_Point_Degrees(double eps){
        double x;
        double x0=2.d;
        int i=0;
        do 
        {
        x=x0;
        x0=fx_Degrees(x);
        i++;
        }while( Math.abs(x-x0)>eps);
        return (double)(x0);   
    }
////////////////////////Hx returns the length solution of ///////////////////////
///////////////////////l=2*R*(1-cos(x/2))/////////////////////////////////////////
    protected double compute_Overlap_Distance(double R,double eps){
         
        return (double)(2*R*(1-Math.cos(0.5*fixed_Point_Radians(eps))));
       
    }
}
 ///////////////***********incarnation 2 Main program*********************************///
 /*     
   public static void main(String[] args) { 
	   
	   Scratch_Lib O = new Scratch_Lib();
           Incarnation2 I= new Incarnation2();
           double R=15;
           System.out.println("The two coasters need to be moved on top of each by"+I.Hx(15,1E-10)+
           "\n such that the area of the overlapping region is half the area of any one of the coasters="+
           0.5*Math.PI*Math.pow(R, 2));
*/