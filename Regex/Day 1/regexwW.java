import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class regexwW {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("\\w{3}+\\W{1}+\\w{10}+\\W{1}+\\w{3}");
    
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }   
    
}