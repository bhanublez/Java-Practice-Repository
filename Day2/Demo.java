import java.util.Scanner;

class Box
{
   float length;
   float breadth;
   float height;
   float volume;

  public void setvalue()
  {
   Scanner Sc=new Scanner(System.in);
   System.out.println("Enter the length of box");
   length=Sc.nextFloat();

   System.out.println("Enter the breadth of box");
   breadth=Sc.nextFloat();

   System.out.println("Enter the height of box");
   height=Sc.nextFloat(); 
  }

  public void showdata()
  {
    System.out.println("The length of box is:" +length);
    System.out.println("The breadth of box is:" +breadth);
    System.out.println("The height of box is:" +height);
  }

  public void volume()
  {
   volume=length*breadth*height;
   System.out.println("The volume of box is :" +volume);
  }

}

class Demo
{
  public static void main(String[] args)
  {
    Box B=new Box();
    B.setvalue();
    B.showdata();
    B.volume();
  }

}












