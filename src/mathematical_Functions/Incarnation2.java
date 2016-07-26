package mathematical_Functions;
/////////////////Incarnation 2 Using The Math lib  ////////////////////////////
public class Incarnation2 {
    protected double fxRadians(double x){
    //fxRadians(x)=sin(x)+pi/2
        return (double)(0.5*Math.PI)+Math.sin(Math.toRadians(x));
    }
    
////////////////////////returns the root of F(x)-x=0///////////////////////////
    protected double computeFixedPointRadians(double eps){
        double x;
        double x0=2.d;//not arbitrary 
                     //but extracted from the graph of F(x)-x=0 
        int i=0;
        do 
        {
        x=x0;
        x0=fxRadians(x);
        i++;
        }while( Math.abs(x-x0)>eps);
        return (double)(x0);   
    }
   
///////////////////////returns l=2*R*(1-cos(x/2))/////////////////////////////////////////
    protected double computeOverlapDistance(double R,double eps){
         
        return (double)(2*R*(1-Math.cos(0.5*computeFixedPointRadians(eps))));
       
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