import java.util.Scanner;

class compute
{
  int a,b,c;
  
  public void add()
  {
   Scanner Sc=new Scanner(System.in);
   System.out.println("Enter the first number");
   a=Sc.nextInt();

   System.out.println("Enter the second number");
   b=Sc.nextInt();
 
   c=a+b;
   System.out.println("The addition of two numbers is :" +c);    
  }

  
  public int add(int x,int y)
  {
     int w,z;
     w=x;
     z=y;
     return(w+z);

  }
  

  public double add(double p,double q,double r)
  {
   double w,x,y;
   w=p;
   x=q;
   y=r;
   return(p+q+r);
  }

  public static void main(String[] args)
  {
   compute obj=new compute();
   obj.add();

   int s1=obj.add(5,8);
   System.out.println("Addition of two integers :" +s1);

   double s2=obj.add(3.2,5.8,9.7);
   System.out.println("Addition of two double numbers :" +s2);
  }
}