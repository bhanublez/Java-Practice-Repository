import java.util.*;
public class Dereferencing {
      public static void main(String ar[]){

    //This will return the object package name with it postion(adress)
    Object obj=new Object();  
    String text=obj.toString();
    System.out.println(text);
        /*
         Here Object is reference type
         obj is a varaible which store the new reference
         Object() is constructor of Object method         
         */


    //The below statement will throw NullpointerException
    Object ob=null;
    //String text2=ob.toString();
    //System.out.println(text2);
    //Here null mean absence of value


    }
}
