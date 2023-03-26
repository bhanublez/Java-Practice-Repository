import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.math.*;

public class positivelookingbehind {

    public static void main(String[] args) {
        Regex_test rt= new Regex_test();
        rt.chk("(?<=[13579])\\d");
        
    }
}
class Regex_test{
    public static void chk(String ss){
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        Pattern p= Pattern.compile(ss);
        Matcher m= p.matcher(s);
        int count=0;
        while(m.find()){
            count++;
        }      
        System.out.println("Number of matches : "+count);
}
}