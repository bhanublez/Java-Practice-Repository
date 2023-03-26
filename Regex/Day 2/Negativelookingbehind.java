import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.math.*;


public class Negativelookingbehind {

    public static void main(String[] args) {
       Regex_test rt= new Regex_test();
       rt.checker("(?<![aeiouAEIOU]).");
    }
    
}
 class Regex_test{
     
     public static void checker(String regex_pattern){
         Scanner sc= new Scanner(System.in);
         String input=sc.nextLine();
         Pattern p= Pattern.compile(regex_pattern);
         Matcher m=p.matcher(input);
         int count =0;
         while(m.find()){
             count++;
        
         }
         
         System.out.println("Number of matches : "+count); 
     }
 }