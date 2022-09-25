import java.util.Scanner;

class Sahil
{
  public static void main(String[] args)
  {
    int a,b,result;
    Scanner Sc=new Scanner(System.in);  
   System.out.println("Enter the first number");
    a=Sc.nextInt();

    System.out.println("Enter the second number");
    b=Sc.nextInt();

   try
   {
    result=a/b;
    System.out.println("Result of division is :" +result);
   }

  catch(ArithmeticException e)
  {
    System.out.println("Re enter the number");
    
    System.out.println("Enter the first number");
    a=Sc.nextInt();

    System.out.println("Enter the second number");
    b=Sc.nextInt();

    result=a/b;
    System.out.println("Result of division is :" +result);
  }


   finally
   {
     System.out.println("Exception handling program is implemented successfully");
   }
  }

}