import java.util.Scanner;

class student1
{
  private String name;
  private int age;
  private float cgpa;


 
   student1()
   {
    name="Shashank";
    age=20;
    cgpa=9;
   }


  public void showdata()
  {
    System.out.println("The name of student is:" +name);
    System.out.println("The age of student is:" +age);
    System.out.println("The cgpa of student is:" +cgpa);
  }

  public static void main(String[] args)
  {
    student1 obj=new student1();
    obj.showdata();
  }

 
}



