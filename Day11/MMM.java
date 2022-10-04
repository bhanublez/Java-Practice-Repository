import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import static java.lang.System.in;

public class Solution {

class MMM{
    void mmm(Integer... a){
        int sum=0;int l=a.length;
        for(int i=0;i<l;i++){
           sum+=a[i];
        }
        sort(a,a+l);
        java.lang.System.out.println(sum/l);
    }
    
}
    public static void main(String[] args) {
       try{
       BufferedReader br=new BufferedReader(new InputStreamReader(in));
       int n=Integer.parseInt(br.readLine());
       MMM ob =new MMM();
       }
       (Exception e){
           System.out.println(e);
       }
    }
}