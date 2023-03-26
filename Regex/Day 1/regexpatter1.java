import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class regexpatter1 {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
tester.checker("^[1-3][0-2][xs0][30Aa][xsu][//.,]$");

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