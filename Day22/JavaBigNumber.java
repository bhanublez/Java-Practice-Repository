import java.io.*;
import java.util.*;

public class JavaBigNumber {

private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       int n;
       n=Integer.parseInt(sc.nextLine());
       int r=n;
       double s[]= new double[n]; 
       String ss[]= new String[n];
       int j=0;
      while(n>0){
          ss[j]=sc.nextLine();
           //s[j]=sc.nextDouble();
             
          s[j]= Double.parseDouble(ss[j]);
          //System.out.print(" "+s[j]);
          n--;j++;
      }
    //   s[0]=Double.parseDouble(ss[0]);
    //   System.out.print(" "+s[0]);
      
      for(int i=0;i<r-1;i++){
          
           for(int p=i+1;p<r;p++){
            if(s[i]<s[p]){
                double temp=s[i];
                String temp2=ss[i];
                    ss[i]=ss[p];
                    ss[p]=temp2;
                    
                    s[i]=s[p];
                    s[p]=temp;
            }  
           }                     
      }
      for(int i=0;i<r;i++){
          System.out.println(ss[i]);
      }
       
    }
}



