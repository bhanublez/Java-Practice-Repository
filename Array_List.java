import java.util.*;
import java.util.ArrayList;
class Array_List
{
  public static void main(String[] args)
  {
    ArrayList<String> arr_list=new ArrayList<String>();
    Scanner Sc=new Scanner(System.in);
    int num=0;

    System.out.println("Enter the number of elements to insert in the ArrayList :");
    num=Sc.nextInt();

    System.out.println("Enter the elements ArrayList :");
    for(int i=0;i<num;i++)
    {
      String temp=Sc.next();
      arr_list.add(temp);
    }

   System.out.println("Traversing the elements of ArrayList");
   System.out.println("Elements of ArrayList are : \n");
   Iterator it1=arr_list.iterator();

   while(it1.hasNext())
   System.out.println(it1.next());
  }
}