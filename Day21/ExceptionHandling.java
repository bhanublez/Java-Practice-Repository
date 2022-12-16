import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        try{
            
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            System.out.println(x/y);
            
        }catch (java.util.InputMismatchException ime) {
            System.out.println("java.util.InputMismatchException");
        } catch (java.lang.ArithmeticException ae) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        } 
    }
}


                  
        