//Scanning and printing double,int and String
/*
If you use the nextLine() method immediately following the nextInt() method,
 recall that nextInt() reads integer tokens; because of this, the last newline 
character for that line of integer input is still queued in the input buffer and 
the next nextLine() will be reading the remainder of the integer line (which is empty).
*/
import java.util.*;

public class Scan_int_double_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d=scan.nextDouble();
        String s=scan.nextLine();
        s= scan.nextLine();    
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}