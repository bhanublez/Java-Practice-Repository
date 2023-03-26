//Use of Scannner.hasNext();
import java.io.*;
import java.util.*;

public class Scanner_hasNext {

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        
        for(int i=1;sc.hasNext();i++) {
            String s=sc.nextLine();
            System.out.println(i + " " + s);
           
        }
    }
}