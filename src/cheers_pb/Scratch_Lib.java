/*
 * Set of mathematical functions from scratch code
   Power, Factorial, Max
   Set of approximation of Pi
   Wallis, Nilakantah,Leibiniz,
   An approximation of sin
  
   An approximation of the root of 
   x-sin(x)-pi/2/=0
   
 */
package cheers_pb;
public class Scratch_Lib {
 //***************Basic useful Methods*************************************//
    
 ///////////////////////////////////Power///////////////////////////////////
    /*An ArithmeticException exception is thrown if abs(n) > 999999999*/
    protected double Power(double a,int n){
      if (n==0) return 1;
              else {
                   if(n%2==0)
                   return(double)(Power(a,n/2)*Power(a,n/2));
                   else return (double)(a*Power(a,n/2)*Power(a,n/2));
                   }
    }
    
 ////////////////////////////////Factorial////////////////////////////////   
    protected double Factorial(int n){
        if (n==0) return 1;
        else return (double)(n*Factorial(n-1));
    }
    
 //////////////////////////////////Max////////////////////////////////////////// 
    protected double Max(double a, double b){
     if (a-b<0)
     return b;
             else return a;
    }
    /////////////////////////////Round//////////////////////////////////////////
    ///////////////////////////returns the round of a given double//////////////
    protected int Round(double x){
      if ((x-(int)x)<0.5)
      return (int)x;
      else return (int)x+1;         
    }
  
    ///////////////////////************************/////////////////////////////
    /****************Approximaaaaaaaaaaaaaaaaaaaaaaaaaaaaation
     * @param eps
     * @param epss*
     * @return ***************/
    
    //////////////////////////////////////PI wallis////////////////////////// 
    ///////////π/2 = (2/1) * (2/3) * (4/3) * (4/5) * (6/5) * (6/7) * (...)//////
    //************************input epselon,returns pi/2/*****************//////
    protected double Wallis(double eps){
   
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
        while(Max((p1-p2),(p2-p1))>eps);
    return (double)(p1);
    }
    
    
    //////////////////////////////PI  Nilakantah///////////////////////////////  
    /////////////////////Pi=3+(4/2*3*4)-4/(4*5*6)+4/(6*7*8)-4/(8*9*10)...
    //********************input epselon,returns Pi*****************************//
    protected double Nilakantah(double epselon){
    
    double succ=3.d;
    double pred=0.d;
    int i=2;
     do {
         pred=succ;
         if (i%2==0)
         succ=pred+(double)((4/(double)(i*(i+1)*(i+2))));
         else succ=pred-(double)((4/(double)(i*(i+1)*(i+2))));
//succ=pred+(double)((double)O.Power(-1,i)*(double)(4/(double)(i*(i+1)*(i+2))));                   
         i++;
//System.out.println("term i="+i);
     }while(Max(pred-succ,succ-pred)>epselon);//||(i>28));
return (double)pred;            
    }
    


    //////////////////////Gregory-Leibniz Series.///////////////////////////////
    ///////////////////// Pi= 4-(4/3)+(4/5)-(4/7)+(4/9)...//////////////////////
    //******************input epselon, returns Pi*****************************//     
    protected double Leibiniz (double eps){
        double u1;
        double u2=4.d;
        int i=2;
        do 
        {
           u1=u2; 
        
        u2=u1+(double)((double)((4*Power(-1,i-1)))/(double)(i+1)); 
        
        //System.out.println((float)(4*Power(-1,i-1))/(float)(i+1)); 
       //System.out.println("u1="+ u1);System.out.println("max(u2-u1)="+ Max((u2-u1),(u1-u2)));
       i++;
        }
        while(Max(u2-u1,u1-u2)>eps);
        return u2;
        }
    
    
    
    ////////////////////////////Sinus///////////////////////////////////////////
    /////////////////********** //sin (x) = x - (x3/3!) + (x5/5!) - (x7/7!).../
    //******************inputs x & epselon, returns the sin*****************************//
    protected double sin (double x,double eps){

        int i=1;
        double pred;
        double succ=x;
        do{
        pred=succ;
        //System.out.println("i="+i);
        if (i%2==0)
        succ=pred+(double)(Power(x,i+2)/Factorial(i+2));
        else succ=pred-(double)(Power(x,i+2)/Factorial(i+2));
        //System.out.println(succ); 
        i++;
        }while(Max((pred-succ),(succ-pred))>eps);
        return (double) pred;//Math.round(
    }
    
    
    
    //////////////////////f(x)=sin(x)+pi/2///////////////////////////////////
    /////////////////////f returns f(x)/////////////////////////////////////////
    ///////////////////input x & epselon////////////////////////////////////////
    protected double f(double x,double eps){
    return (double)(sin(toRadians(x,eps),eps)+Wallis(eps));
    } 
    
    protected double toRadians(double degree,double eps){
    return(double)(Wallis(eps)*degree)/90;//x*pi/180 & wallis returns pi/2
    }   
    /////////////////////Alpha compute the root of any given equation///////////
    ////////////////////f(x)=0//////////////////////////////////////////////////
    ///////According to its graph the root is between 1 & 2/////////////////////
    /////////////////////our intervall will be [1..2]///////////////////////////
    ////////////////////the max number of iterations will be (log(2))/2////////
    //////////////////////input x & epselon///////////////////////////////////// 
    ////////////////////////////alpha in degrees approximation///////////////////
    protected double Alpha(double eps){  
     double xpre;
     double xact=2.0E0d;
     int i=0; 
        do
        {
         xpre= xact;
         xact=f(xpre,eps);
         i++;
        } while((Max((xpre-xact),(xact-xpre))>eps));
       
    return (double)xact;   
    }
    /////////////////////cosine///////////////////////////////////////////////
    //////////////////*****cos(x)=sin(0.5*pi-x)***************************/////
    protected double cosapp (double x,double eps ){
        double pi2=(double)((Wallis(eps)));
        double temp =pi2-x;
        return (double)sin(temp,eps);
    }   
    
    /////////////////////cosine///////////////////////////////////////////////
    //////////////////*****cos(x)=1-x2/2!+x3/3!-x5/5!...***************************/////
    protected double cos(double x,double eps){
    
    int i=2;
    int j=1;
    double pred,temp;
    double succ=1.d;
    do {
        pred=succ;
        temp = (double)((double)Power(-1,j)*(double)((double)Power(x,i)/(double)Factorial(i)));
        //System.out.println("(double)((double)Power(-1,"+j+")*(double)((double)Power(x,"+i+")/(double)Factorial("+i+"!");
        succ=pred+temp;
        i=i+2;
        j=j+1;
       }while(Max((pred-succ),(succ-pred))>eps);
    return (double)succ;//Math.round(
    }
    
    /////////////////////////g(x)= 2*R(1-cos(x/2))/////////////////////////////
    protected double length(double R, double eps){
        
     return(double)(2*R*(1-cos((0.5*Alpha(eps)),eps)));
       
    }
}
 