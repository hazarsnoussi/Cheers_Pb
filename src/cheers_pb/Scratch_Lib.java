/*
 * Set of mathematical functions from scratch code
   Power, Factorial, Max
   Set of approximation of Pi
   Wallis, Nilakantah,Leibiniz,
   An approximation of sin
  
   An approximation of the root of 
   x-sin(x)-pi/2/=0
   An approximation via trapezoidal method
   Trapezoidal 
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
    /****************Approximaaaaaaaaaaaaaaaaaaaaaaaaaaaaations****************/
    
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
        double pi2=Wallis(eps);//half of Pi
    return (double)(sin(x,eps)+pi2);
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
     double xact=1E0;
     int i=0; 
     do
        {
        // System.out.println("i="+i);
        // System.out.println("xpre="+xpre);
        // System.out.println("xact="+xact);
         xpre= xact;
         xact=f(xact,eps);
         i++;
        }while((eps<Max((xpre-xact),(xact-xpre))));
    return (double)(xact);   //Math.round
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
    
    int i=1;
    double pred,temp;
    double succ=1.d;
    do {
        pred=succ;
        temp = (double)((double)Power(-1,i)*(double)((double)Power(x,i+1)/(double)Factorial(i+1)));
        succ=pred+temp;
        //System.out.println("(Power(-1,+"+i+")*(double)(Power("+x+","+i+"+1)/Factorial("+i);
        //System.out.println(succ); 
        //System.out.printf("%.10f%n",Max((pred-succ),(succ-pred)));
       // System.out.printf("%.10f%n",pred);
        //System.out.println("i="+i);
        i++;
       }while(Max((pred-succ),(succ-pred))>eps);
    return (double)succ;//Math.round(
    }
    
    /////////////////////////g(x)= 2*R(1-cos(x/2))/////////////////////////////
    protected double length(double R, double eps){
        double x=cos((double)0.5*Alpha(eps),eps);
        return (double)(2*R*(1-x));
    }
}
    

////////////////////////Trapezoidal///////////////////////////////////
   
    /*protected double Trapezoidalv1(float c1, float c2, int n,float R,double eps){
        int h=(int)Math.round(((c1+c2)/n));
        double x=c1;
        double sum=(double)(0.5*(g(c1,R,eps)+g(c2,R,eps)));
        for(int i=1;i<=n-1;i++){
        sum =sum+(g(x,R,eps)+g(x+h,R,eps))/2;
        x = x + h;
        }
    return(double)(h*sum);
    }
}*/
