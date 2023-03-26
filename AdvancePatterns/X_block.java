package AdvancePatterns;
import java.util.*;
public class X_block {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of A pattern");
                    int n=sc.nextInt();
                     for(int i=0;i<n;i++){
                         for(int j=0;j<n;j++){ 
                             if(i==j||i+j==n-1||i==0||j==0||j==n-1||i==n-1 ){
                                 System.out.print(" *");
                             }
                             else{ 
                                 System.out.print("  ");
                             }
                         }System.out.println();
                     }
    }
}
