import java.util.*;
import java.io.*;
class Overloads{
    String unique_id;
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public void setUniqueID(String theID) {
        unique_id= theID;
        System.out.println("Pasting "+unique_id);
        }
    public void setUniqueID(int ssNumber) {
        String numString = "Testing" + ssNumber;
        setUniqueID(numString);
        }
    public static void main(String args []){
        System.out.println("Hello balo");
        Overloads ob= new Overloads();
        Scanner sc= new Scanner(System.in);
        double x,y;
         x=sc.nextDouble();
         y=sc.nextDouble();
         System.out.println(ob.add(x,y));
         int a,b;
         a= sc.nextInt();
         b= sc.nextInt();
         System.out.println(ob.add(a,b));
         ob.setUniqueID(a);
        //  try{
        //     BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        

        // }catch(Exception e){
        //      System.out.println(e);
        //  }
    }
}