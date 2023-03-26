package AdvancePatterns;
import java.util.*;
public class diamondInBlock2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of A pattern");
                    int n=sc.nextInt();
                     for(int i=0;i<n;i++){
                         for(int j=0;j<n;j++){ 
                             if(i+j>=(n-1)/2 && i+j<=(n-1)/2+(n-1) && j-i<=(n-1)/2 && i-j<=(n-1)/2 || i==0||j==n-1||i==n-1||j==0){
                                 System.out.print(" *");
                             }
                             else{ 
                                 System.out.print("  ");
                             }
                         }System.out.println();
                     }
    
    }
}
