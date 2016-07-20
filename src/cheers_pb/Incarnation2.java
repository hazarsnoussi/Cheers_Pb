package cheers_pb;
/////////////////Incarnation 2 Using The Math lib  ////////////////////////////
public class Incarnation2 {
////////////////////////F returns F(x)=sin(x)+pi/2///////////////////////////
    protected double Fx (double x){
        return (double)(0.5*Math.PI)+Math.sin(Math.toRadians(x));
    }
////////////////////////F returns the root of F(x)=0///////////////////////////
///////////////////F is a genaral approximation for all functions admitting////
////////////////////////at least a root////////////////////////////////////////
////////////////////////The choice of the intial value is not arbitrary////////
////////////////////////x0 is extracted from CFx///////////////////////////////
    protected double Gx(double eps){
        
        double pred;
        double x0=2.d;
        int i=0;
        do 
        {
        pred=x0;
        x0=Fx(pred);
        i++;
        }while( Math.max((pred-x0),(x0-pred))>eps);
        return (double)(x0);   
    }
////////////////////////Hx returns the length solution of ///////////////////////
///////////////////////l=2*R*(1-cos(x/2))/////////////////////////////////////////
    protected double Hx (double R,double eps){
         
        return (double)(2*R*(1-Math.cos(0.5*Gx(eps))));
       
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