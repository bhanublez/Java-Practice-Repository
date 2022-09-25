import java.util.Scanner;

class Student
{
   String name;
   int rollno;
   int fees;

   Student(String n,int r,int f)
   {
     name=n;
     rollno=r;
     fees=f;
   }

   public void show()
   {
     System.out.println("Name of student :" + name);
     System.out.println("Roll number of student :" + rollno);
     System.out.println("Fees of student :" + fees);
   }

}

class Sciencestudent extends Student
{
   int physics,chemistry,maths;
   Sciencestudent(String name,int rollno,int fees,int p,int c,int m)
   {
      super(name,rollno,fees);
      physics=p;
      chemistry=c;
      maths=m;
   }
   

   public void display()
   {
     System.out.println("Marks of physics :" +physics);
     System.out.println("Marks of chemistry :" +chemistry);
     System.out.println("Marks of maths :" +maths);
   }

   public void percentage()
   {
     double percent;
     percent=(physics+chemistry+maths)/3;
     System.out.println("Percentage :" +percent);
   }
}


class superdemo
{
  public static void main(String[] args)
  {
    Sciencestudent obj=new Sciencestudent("Shashank",154,50000,92,86,96);
    obj.show();
    obj.display();
    obj.percentage();
  }
 
}





















