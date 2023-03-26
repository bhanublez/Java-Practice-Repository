package AdvancePatterns;
import java.util.*;

import Day28_literals.null_literal;
public class A {
    public static void main(String[] args) {
        
                /*This pattern to be drawn below 
                  * * * * 
                *         *
                * * * * * *
                *         *
                *         *                
                 */

       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the size of A pattern");
       int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){ 
                if(i==0 && j>0 && j<n-1 ||i==(n-1)/2 ||j==0 && i>0 ||j==(n-1) && i>0 ){
                    System.out.print(" *");
                }
                else{ 
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
}
