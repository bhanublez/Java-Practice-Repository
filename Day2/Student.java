import java.util.Scanner;

class Student
{
  private String name;
  private int age;
  private float cgpa;

  public void getdata()
  {
   Scanner Sc=new Scanner(System.in);
   System.out.println("Enter the name,age and cgpa of student");
   name=Sc.nextLine();
   age=Sc.nextInt();
   cgpa=Sc.nextFloat(); 
  }

  public void showdata()
  {
    System.out.println("The name of student is:" +name);
    System.out.println("The age of student is:" +age);
    System.out.println("The cgpa of student is:" +cgpa);
  }

  public static void main(String[] args)
  {
    Student obj=new Student();
    obj.getdata();
    obj.showdata();
  }






}