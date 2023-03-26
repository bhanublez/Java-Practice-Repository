import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class detecthtmllink {

    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);
        int N = scin.nextInt();
        scin.nextLine();    
        
        Pattern patt = Pattern.compile("<\\s*a.*?href=\"(.*?)\".*?>(.*?)</a>");
        
        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();
            String line = scin.nextLine();
            
            Matcher m = patt.matcher(line);
            
            boolean found = false;
            while (m.find()) {
                sb.append(m.group(1).trim());   
                sb.append(",");
                sb.append(m.group(2).replaceAll("<.*?>", "").trim());  
                sb.append("\n");
                found = true;
            }
            
            if (found)
                System.out.print(sb.toString());
        }
    }
}