//Checking palindrome word
import java.io.*;
import java.util.*;

public class Palindrom_word{
public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String b="";
        for(int i=A.length()-1;i!=-1;i--){
        
        b=b.concat(A.substring(i,i+1));
         
        }
         
         if(A.equals(b)){
           System.out.println("Yes");  
         }
         else{
            System.out.println("No");  
         }
        
        
    }
}



