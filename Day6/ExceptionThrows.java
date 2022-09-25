import java.util.Scanner;

class ExceptionThrows
{
  public static void compute(int a1,int b1,int c1,int d1,int f1) throws ArithmeticException

  {
    int g=a1+b1+c1,h=d1-f1,result=0;
   
    try
    {
      result=g/h;
    }

   catch(ArithmeticException e)
   {
    System.out.println("Exception caught divide by zero exception");
    System.out.println("System generated message :" +e.getMessage());
   }

  System.out.println("Result of computation is :" +result);
  }

 
  public static void main(String[] args)
  {
    int a=0,b=0,c=0,d=0,f=0;
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter three positive numbers");
    a=Sc.nextInt();
    b=Sc.nextInt();
    c=Sc.nextInt();

    System.out.println("Enter two positive numbers");
    d=Sc.nextInt();
    f=Sc.nextInt();
  
  
  compute(a,b,c,d,f);
  System.out.println("Exception handled successfully");
  }
}







