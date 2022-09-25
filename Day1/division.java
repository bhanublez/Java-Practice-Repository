import java.util.Scanner;
class division
{
	public static void main(String[] args)
	{
	 int a,b;
	 double d;
	 Scanner Sc=new Scanner(System.in);
	 System.out.println("Enter the first number");
	  a=Sc.nextInt();
	 System.out.println("Enter the second number");
	  b=Sc.nextInt();

	 d=(double) a/b;
	  System.out.println("Division is:"+ d);
	}
}