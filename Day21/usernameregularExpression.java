// import java.io.*;
// import java.util.*;
// import java.util.regex.*;
// import java.math.*;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Regex_test rt = new Regex_test();
//        rt.checker("^[a-zA-Z]{1}[a-zA-Z0-9\\_]{7,29}$");
     
//     }
// }
// class Regex_test{
//     public static void checker(String regex_pattern){
//         Scanner sc = new Scanner(System.in);
//         int r= sc.nextInt();
//         while(r>0){
//         String input =sc.next();
//         // if(input.length()>30){
//         //     System.out.println("Invalid");
//         //      r--;
//         //     continue;
//         // }
//         // if(input.length()<8){
//         //     System.out.println("Invalid");
//         //      r--;
//         //     continue;
//         // }
//         Pattern p =Pattern.compile(regex_pattern);
//         Matcher m=p.matcher(input);
//         if(m.find()){
//             System.out.println("Valid");
//         }
//         else{
//             System.out.println("Invalid");
//         }
//         r--;
//         }
        
//     }
// }
import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[A-Za-z]\\w{7,29}$";
}
public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();
            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
