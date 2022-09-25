import java.util.Scanner;

interface I1
{
  public void show();
}

class c1 implements I1
{
  String name;
  
  public void show()
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the name");
   name=sc.nextLine();
  }
 
  public void display()
  {
   System.out.println("Name of student is :" +name);
  }
}
 

class c2 extends c1
{
  int age;
  
  public void show()
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the age");
   age=sc.nextInt();
  }
 
  public void display()
  {
   System.out.println("Age of student is :" +age);
  }
}

class c3 extends c2
{
  String email;
  
  public void show()
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the email");
   email=sc.nextLine();
  }
 
  public void display()
  {
   System.out.println("Email of student is :" +email);
  }
}

class Shyam
{
  public static void main(String[] args)
  {
   c1 c=new c1();
   c.show();
   c.display();

   c2 obj=new c2();
   obj.show();
   obj.display();


   c3 d=new c3();
   d.show();
   d.display();



  }
}
















