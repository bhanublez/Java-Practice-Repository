import java.util.Scanner;
public class matrixadd {
public static void main(String[] args) {
	int i,j;
	Scanner Sc=new Scanner(System.in);
	int a[][]= new int[3][3];
	int b[][]= new int[3][3];
	System.out.println("Enter the first array elements");
	for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
			a[i][j]=Sc.nextInt();
		}
	}
	for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
		System.out.print("\t"+a[i][j]);	
		}
		System.out.println(" ");
	}
	System.out.println("Enter element of second array");
	for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
			b[i][j]=Sc.nextInt();
		}
	}
	for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
			a[i][j]=a[i][j]+b[i][j];
			System.out.print("\t"+b[i][j]);
		}
		System.out.println("\t");
	}
	System.out.println("Sum of both array shown below:");
	for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
		System.out.print("\t"+a[i][j]);	
		}
		System.out.println(" ");
	}
}
	
}
