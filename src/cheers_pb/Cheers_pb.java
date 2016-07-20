/*
  Cheers problem
@authors Team D
 */
package cheers_pb;
public class Cheers_pb {
	   public static void main(String[] args) { 
	   ///////////////***********incarnation 1*********************************///
           /*Scanner sc=new Scanner(System.in);
	    system.out.println("Radius=...");    
	    double R= sc.nextDouble();  
	    System.out.println("Epselon   
	    double eps= sc.nextDouble(); 
            */   
	   Scratch_Lib O = new Scratch_Lib();
           Incarnation2 I=new Incarnation2();
           double eps = 1.0E-7; double R=10.d;double z,y,err;
           
           System.out.println("=============================================================================");    
           System.out.println("Approximation of Pi Wallis "+ 2*O.Wallis(eps)+"exact value using Math lib= "+Math.PI);
           z = 2*O.Wallis(eps);
           y = Math.PI;
           err =O.Max(y-z,z-y);
           System.out.println("Absolute error= " +err);
           System.out.println("============================================================================="); 
           System.out.println("Values of testing parameters Radius = "+R+" & Epselon= "+eps);
           
           System.out.println("============================================================================="); 
           System.out.println("Half of the area= "+2*O.Wallis(eps)*O.Power(R,2));
           System.out.println("Exact half of the area= "+Math.PI*Math.pow(R, 2));
           System.out.println("Absolute error= "+O.Max(2*O.Wallis(eps)*O.Power(R,2)-Math.PI*Math.pow(R, 2),
                                                     Math.PI*Math.pow(R, 2)-2*O.Wallis(eps)*O.Power(R,2)));
           System.out.println("============================================================================="); 
           
           System.out.println("=============================================================================");  
           z=O.Alpha(eps);
           y=I.Gx(eps);
           System.out.println("Approximation of alpha in Radians "+z+
                   "\n exact value using Math lib with incarnation 2 functions = "+y);
           System.out.println("Asolute error for alpha= "+Math.abs(z-y));
           System.out.println("=============================================================================");
           z=O.length(R,eps);
           y=I.Hx(R,eps);
           System.out.println("Approximation of the ||x1-x2|| :"+z +"\n exact value using Math lib with incarnation 2 functions = "+y);
           System.out.println("Asolute error for the length= "+Math.abs(z-y));
         
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

  //double x=O.cos(Math.PI/2,1.0E-10);
           
           /*double x=1;
           System.out.println("cos("+x+")="+O.cos(x,1.0E-100));
           System.out.println("********************************");
           System.out.printf("%.10f%n",O.cos(x,1.0E-10) ); 
           System.out.println("Math.cos(Math.cos(+"+x+")= "+Math.cos(x));
           System.out.println("Math.cos(x)-O.cos(x,1.0E-100)="+Math.abs((Math.cos(x)-O.cos(x,1.0E-100))));*/
           /*float c1=5;
           float c2=9;
           int   n=15;
           float R=2;
           double eps=1.0E-5;
           double x= O.Trapezoidalv1(c1,c2,n,R,eps);
           double y=O.Trapezoidalv2(c1,c2,n,R);
           double p=(double)O.Wallis(1.0E-6);
           double temp = O.cos(2*p,(double)1.0E-8);//cos pi/2,
           System.out.println(temp);
           //System.out.println("Trapezoidalv1   "+x);
           //System.out.println("Trapezoidalv2   "+y);*/
 
           // double l=O.Leibiniz((float)(1.0E-3));
	    //System.out.println("Pi Leibiniz:   "+l);
          //  double w=O.Wallis((float)(1.0E-3));
            //System.out.println("Pi Wallis:            "+w);
            //double n=O.Nilakantah((float)(1.0E-3));
	    //System.out.println("Pi Nilakantah: "+n);
            //System.out.println("Math.pi:              "+Math.PI);
           
           /* System.out.println("Math.pi-Pi_Wallis    "+(Math.PI-w));
            System.out.println("Math.pi-Pi_Nilakantah "+(Math.PI-n));
            System.out.println("Math.pi-Pi_Leibiniz  "+ O.Max((Math.PI-l),(l-Math.PI)));*/
          //  System.out.println(O.sin(1,(double)1.0E-5));
           // System.out.println(Math.sin(1));
	   // System.out.println("Alpha(double eps) "+ (O.Alpha((double)1.0E-3)));
	    /* 
	    Scanner sc=new Scanner(System.in);
	    System.out.println("First center abciss=..");    
	    double c1= sc.nextDouble();                   
	    System.out.println("Second center abciss=..");
	    double c2=sc.nextDouble();
	    System.out.println("Radius=...");    
	    double R= sc.nextDouble();  
	    System.out.println("Number of division=..");
	    int n=sc.nextInt();
	    System.out.println("Epselon   
	    double eps= sc.nextDouble(); 
	    System.out.println("Approximation of overlap degree= "+ O.Trapezoidal(c1,c2,n,R,eps));   */
	    /**************incarnation 2*****************************///////////////
	    
	   /*Incarnation2 I=new Incarnation2 ();
	   System.out.println(I.g(5,(float)1.0E-3));
	   System.out.println(I.Approxf((float)1.0E-9));
	   System.out.println(0.5*Math.PI*Math.pow(5,2));*/
	    
	    
	
	 //System.out.println("f(2)"+O.f(2,(float)1.0E-3));
	//System.out.println("Pi java: "+Math.PI);
	      //System.out.println("Pi Nilakantah: "+O.Nilakantah((float)(1.0E-8)));
	      //System.out.println("Pi Wallis: "+2* O.Wallis((float)(1.0E-8)));
	      //System.out.println("sin(1): "+ O.sin(1,(float)(1.0E-9)));
	      //System.out.println("Java"+ Math.sin(1)); 
	       //System.out.println("X; x-sin(x/2)-pi/2=0 :"+ O.Alpha((float)1.0E-3));
	     // System.out.println("X; :"+ O.f(2.5,(float)1.0E-3));
	/*  ScratchLib o=new ScratchLib();
	    
	     // System.out.println("Alpha"+O.Alpha((float)(1.0E-8)));
	     //System.out.println(2-Math.sin((double)(2/2))-0.5*O.Wallis((float)1.0E-3));
	     //System.out.println(2-Math.sin((double)(2/2))-0.5*Math.PI);
	     //System.out.println(O.sin(1,(float)1.0E-3));
	     //System.out.println(Math.sin(1));
	       System.out.println(o.Power(2,5));
	       System.out.println(o.Factorial(3));
	       
	       System.out.println(o.Wallis((float)10.0E-6));
	       Leibiniz OO=new Leibiniz();
	     
	      
	           
	           //System.out.println(OO.Suite((float)(10.0E-3)));
	     //System.out.println(OO.Suite(0.0001));
	      /*int n=2;
	     n =(n<10 ? ++n:--n);
	      System.out.println(n);     
	      String ch=(n<10 ? "n++":"n--");
	      */
	// System.out.println("pi-app/pi="+(Math.PI-(double)2* O.Wallis((float)(1.0E-9)))/(double)2* O.Wallis((float)(1.0E-9)));
	      // 7 3.12148927240471
	      //6 3.121488719921366
	      //8 3.121489217180873
	      //System.out.printf("The value of e is %.4f%n", Math.E);
	      //System.out.printf("Nilakantah((float)(1.0E-6)) is %.3f%n");
	      // System.out.printf("pow(%.3f, %.3f) is %.3f%n", x, y, Math.pow(x, y));

