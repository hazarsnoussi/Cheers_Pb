package mathematical_Functions;
/**
 *
 * @authors TeamD
 */
public class TrigonometricFunctions {
ArithmeticFunctions fn=new ArithmeticFunctions();   
    protected double Wallis(double eps){
    //π/2 = (2/1) * (2/3) * (4/3) * (4/5) * (6/5) * (6/7) * (...)
        double numertator=2;
        double denumerator=3;
        int i=2;
        double predecessor;
        double successor=2.d;
        
        do
        {
            predecessor=successor;
            successor=predecessor*(double)(numertator/denumerator); 
            if (i%2==0 )
                numertator+=2;
                else denumerator+=2;
            i++;   
        }
        while(fn.max((successor-predecessor),(predecessor-successor))>eps);
    return (double)(2*predecessor);
    }  
    public void getPiNilakantah(double eps){
    System.out.println("Approximative value of PI via Nilakantah formula = "+NilakantahPI(eps));
    }
    protected double NilakantahPI(double eps){
    // π=3+(4/2*3*4)-4/(4*5*6)+4/(6*7*8)-4/(8*9*10)...
    double successor=3.d;
    double predecessor=0.d;
    int i=2;
    int j=2;
     do {
        predecessor=successor;
        successor=predecessor+(double)((double)fn.power(-1,j)*(double)(4/(double)(i*(i+1)*(i+2))));                   
        i+=2;
        j++;
     }while(fn.max(predecessor-successor,successor-predecessor)>eps);//||(i>28));
    return (double)predecessor;            
    }
     
    protected double toRadians(double inDegree,double eps){
    return(double)(NilakantahPI(eps)*inDegree)/180;
    }  
     
    protected double sin (double x,double eps){
        //sin (x) = x - (x3/3!) + (x5/5!) - (x7/7!)...
        int i=1;
        double predecessor;
        double successor =x;
        do{
            predecessor=successor;
            successor=predecessor+(double)(fn.power(-1,i))*(fn.power(x,2*i+1)/fn.factorial(2*i+1));
            i++;
        }while(fn.max((predecessor-successor),(successor-predecessor))>eps);
        return (double) predecessor;
    }
   
    protected double cos(double x,double eps){
    //Taylor_cos(x)=1-x2/2!+x4/4!-x6/6!...
        int i=1;
        double predecessor;
        double successor=1.d;
        do {
        predecessor=successor;
        successor= predecessor+(double)((double)fn.power(-1,i)*(double)((double)fn.power(x,2*i)/(double)fn.factorial(2*i)));
        i++; 
        }while(fn.max((predecessor-successor),(successor-predecessor))>eps);
        return (double)successor;
    } 
}
