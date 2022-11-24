//Learing Arraylist implimentation in programs bascic
import java.util.*;

public class arraylist{
    public static void main(String args[]){
  ArrayList<String> myList= new ArrayList<String>();
  String s= new String("Hello");
  myList.add(s);
  String b=new String("Bola");
  myList.add(b);
  int theSize=myList.size();
  System.out.println("Size of my list is "+theSize);
  boolean isin=myList.contains(s);
  System.out.println("Boolean of my list is "+isin);
  int indx=myList.indexOf(b);
   System.out.println("insex value of element s of mylist is "+indx);
   boolean empty=myList.isEmpty();
   System.out.println("IS empty or not "+empty);
    myList.remove(s);
    
    }

}