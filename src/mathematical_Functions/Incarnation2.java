package mathematical_Functions;
public class Incarnation2 {
    protected double fxRadians(double degrees){
    //fxRadians(x)=sin(x)+pi/2
        return (double)(0.5*Math.PI)+Math.sin(Math.toRadians(degrees));
    }
    
    protected double computeFixedPointRadians(double epsilon){
    //returns the root of F(x)-x=0
        double x;
        double x0=2.d;//not arbitrary 
                     //but extracted from the graph of F(x)-x=0 
        int i=0;
        do 
        {
        x=x0;
        x0=fxRadians(x);
        i++;
        }while( Math.abs(x-x0)>epsilon);
        return (double)(x0);   
    }
   

    protected double computeOverlapDistance(double radius,double epsilon){
    //returns l=2*R*(1-cos(x/2))     
        return (double)(2*radius*(1-Math.cos(0.5*computeFixedPointRadians(epsilon))));
       
    }
}
