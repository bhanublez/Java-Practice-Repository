package c2;
import java.util.Scanner;
public class Multi
{

   
   public void multi()
   {
   int a,b,multiplication;
   Scanner Sc=new Scanner(System.in);
   System.out.println("Enter the first number");
   a=Sc.nextInt();

   System.out.println("Enter the second number");
   b=Sc.nextInt();

     multiplication=a*b;
     System.out.println("Multiplication of two numbers is :" +multiplication);
   } 
}