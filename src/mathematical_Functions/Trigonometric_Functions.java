package mathematical_Functions;
/**
 *
 * @authors TeamD
 */
public class Trigonometric_Functions {
Arithmetic_Functions fn=new Arithmetic_Functions();   
    protected double Wallis(double eps){
    //π/2 = (2/1) * (2/3) * (4/3) * (4/5) * (6/5) * (6/7) * (...)
        double num=2;
        double den=3;
        int i=2;
        double p1;
        double p2=2.d;
        
        do
        {
            
            p1=p2;
            p2=p1*(double)(num/den); 
            if (i%2==0 )
                num+=2;
                else den+=2;
            i++;   
        }
        while(fn.max((p1-p2),(p2-p1))>eps);
    return (double)(p1);
    }  
    public void get_PI_Wallis(double eps){
    System.out.println("Approximative value of PI via Wallis formula = "+2*Wallis(eps));
    }
    protected double Nilakantah(double eps){
    // π=3+(4/2*3*4)-4/(4*5*6)+4/(6*7*8)-4/(8*9*10)...
    double succ=3.d;
    double pred=0.d;
    int i=2;
     do {
         pred=succ;
        // if (i%2==0)
        // succ=pred+(double)((4/(double)(i*(i+1)*(i+2))));
        // else succ=pred-(double)((4/(double)(i*(i+1)*(i+2))));
        succ=pred+(double)((double)fn.power(-1,i)*(double)(4/(double)(i*(i+1)*(i+2))));                   
         //System.out.println("term i="+i);
     }while(fn.max(pred-succ,succ-pred)>eps);//||(i>28));
    return (double)pred;            
    }
    
     protected double Leibiniz (double eps){
    //π= 4-(4/3)+(4/5)-(4/7)+(4/9)...
        double u1;
        double u2=4.d;
        int i=2;
        do{
           u1=u2; 
           u2=u1+(double)((double)((4*fn.power(-1,i-1)))/(double)(i+1)); 
           i++;
        }
        while(fn.max(u2-u1,u1-u2)>eps);
        return u2;
        }
     
    protected double toRadians(double degree,double eps){
    return(double)(Wallis(eps)*degree)/90;//x*pi/180 & wallis returns pi/2
    }  
     
    protected double sin (double x,double eps){
        //sin (x) = x - (x3/3!) + (x5/5!) - (x7/7!)...
        int i=3;
        int j=1;
        double pred;
        double succ=x;
        do{
            pred=succ;
            succ=pred+(double)(fn.power(-1,j))*(fn.power(x,i)/fn.factorial(i));
            i+=2;
            j++;
        }while(fn.max((pred-succ),(succ-pred))>eps);
        return (double) pred;
    }
   
    protected double cosapp (double x,double eps ){
    //cos(x)=sin(0.5*pi-x)
        double pi2=(double)((Wallis(eps)));
        double temp =pi2-x;
        return (double)sin(temp,eps);
    }   
    
    protected double cos(double x,double eps){
    //Taylor_cos(x)=1-x2/2!+x4/4!-x6/6!...
        int i=2;
        int j=1;
        double pred,temp;
        double succ=1.d;
        do {
        pred=succ;
        temp = (double)((double)fn.power(-1,j)*(double)((double)fn.power(x,i)/(double)fn.factorial(i)));
        succ=pred+temp;
        i+=2;
        j++;
        }while(fn.max((pred-succ),(succ-pred))>eps);
        return (double)succ;
    } 
}
