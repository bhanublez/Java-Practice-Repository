import java.io.*;
import java.util.*;

public class use_String_operator {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if(A.compareTo(B)>0)
        System.out.println("Yes");
        else System.out.println("No");
        String X=A.substring(0,1).toUpperCase().concat(A.substring(1,A.length()));
        String Y=B.substring(0,1).toUpperCase().concat(B.substring(1,B.length()));

System.out.println(X+" "+Y);
        
    }
}



