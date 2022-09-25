import java.util.Scanner;

class Base
{
    String name;
    int age;
  

   public void getdata()
   { 
     Scanner Sc=new Scanner(System.in);
     System.out.println("Enter the name");
     name=Sc.nextLine();

    System.out.println("Enter the age");
    age=Sc.nextInt();
   }

   public void showdata()
   {
     System.out.println("Name of the student is :" +name);
     System.out.println("Age of the student is :" +age);
   }
}

class Derive extends Base
{
   String email;
   
   public void geteid()
   {
     Scanner S=new Scanner(System.in);
     System.out.println("Enter the email id");
     email=S.nextLine();
   }
  
   public void showeid()
   {
     System.out.println("Email id of student is :" +email);
   }
}

class inheritance
{
   public static void main(String[] args)
   {
     Derive D=new Derive();
     D.getdata();
     D.showdata();
     D.geteid();
     D.showeid();
   }
}


















