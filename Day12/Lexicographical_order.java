import java.util.Scanner;

public class Lexicographical_order {

    public static String getSmallestAndLargest(String s, int k) {
        int n=s.length();
        String a,b;
        a=s.substring(0,k);
        
        b=s.substring(0,k);
        for(int i=1;i<n-k+1;i++){
            for(int j=0;j<n-k+1;j++){
                
            if(a.compareTo(s.substring(j,j+k))>0){
                
                a=s.substring(j,j+k); 
                //System.out.println("Check a "+a);
                }
               if(b.compareTo(s.substring(j,j+k))<0){
                b=s.substring(j,j+k);
                //System.out.println("Check b "+b);
                
                }
                
                 
                
            }
        }
        
        return a + "\n" + b;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}