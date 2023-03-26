import java.util.*;

class Vec
{
   public static void main(String[] args)
   {
     int size=0, up=0;
     Scanner Sc=new Scanner(System.in);
     System.out.println("Enter the initial size of vector :");
     size=Sc.nextInt();

     System.out.println("Enter the increment size of vector :");
     up=Sc.nextInt();

     Vector<String>v=new Vector<String>(size,up);
     System.out.println("Initial size :" +v.size());
     System.out.println("Initial capacity :" +v.capacity());

     System.out.println("Enter the numbers of elements to insert in vector :");
     int n1=Sc.nextInt();
     System.out.println("Enter the elements to insert in vector :");
     for(int i=0;i<n1;i++)
     {
       String temp=Sc.next();
       v.addElement(temp);
     }

     System.out.println("Elements of vector : \n");
     Iterator it_obj=v.iterator();
     while(it_obj.hasNext())
     System.out.println(it_obj.hasNext());
     System.out.println("Current size :" +v.size());
     System.out.println("Current capacity :" +v.capacity());

     System.out.println("Enter the numbers of elements to insert in vector :");
     int n2=Sc.nextInt();

      System.out.println("Enter the elements to insert in vector :");
      for(int i=0;i<n2;i++)
      {
        String temp=Sc.next();
        v.addElement(temp);
   }
  }
}