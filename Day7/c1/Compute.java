package c1;
import java.util.Scanner;   


public class  Compute
{
   public void sub()
   {
   int a,b,subtraction;
   Scanner Sc=new Scanner(System.in);
   System.out.println("Enter the first number");
   a=Sc.nextInt();

   System.out.println("Enter the second number");
   b=Sc.nextInt();
 

   
     subtraction=a-b;
     System.out.println("Subtraction of two numbers is :" +subtraction);
   }

}