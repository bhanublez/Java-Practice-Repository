import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import static java.lang.System.in;

public class MMMM {

    static void mmm(Integer... a){
        int sum=0;int l=a.length;
        for(int i=0;i<l;i++){
           sum+=a[i];
        }
        java.lang.System.out.println(sum/l);
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
       
       BufferedReader br=new BufferedReader(new InputStreamReader(in));
       int n=Integer.parseInt(br.readLine());
       MMMM ob =new MMMM();
       Integer arr[] ={1,2,32,23};
       mmm(arr);
       

    }
}