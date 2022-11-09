import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("^[a-zA-Z02468]{40}[13579\\s]{5}$");   
       
        
    }
}

class Regex_Test {