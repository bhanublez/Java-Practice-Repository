import java.util.Scanner;

class matrixadd
{
	public static void main(String[] args)
	{
	 int i,j,r1,c1,r2,c2;
	 Scanner Sc=new Scanner(System.in);

	 System.out.println("Enter the first dimension of array");
	  r1=Sc.nextInt();
	  c1=Sc.nextInt();

	  
	 System.out.println("Enter the second dimension of array");
	  r2=Sc.nextInt();
	  c2=Sc.nextInt();

	 int a[][]=new int[r1][c1];
	 
	 System.out.println("Enter the first array elements");
	 for(i=0;i<r1;i++)
	 {
	    for(j=0;j<c1;j++)
		{
		  a[i][j]=Sc.nextInt();
		}
		System.out.print(" ");
	 }

	
	  int b[][]=new int[r2][c2];

	   
	 System.out.println("Enter the second array elements");
	 for(i=0;i<r2;i++)
	 {
	    for(j=0;j<c2;j++)
		{
		  b[i][j]=Sc.nextInt();
		}
		System.out.print(" ");
	 }

	 int c[][]=new int[r1][c2];

	   for(i=0;i<r1;i++)
	 {
	    for(j=0;j<c2;j++)
		{
		  c[i][j]=a[i][j]+b[i][j];
		}
		
	 }

	  System.out.println("Addition of matrix");

	  
	   for(i=0;i<r1;i++)
	 {
	    for(j=0;j<c2;j++)
		{
		  c[i][j]=a[i][j]+b[i][j];
		}
		System.out.println(" ");
		
	 }



	}
}