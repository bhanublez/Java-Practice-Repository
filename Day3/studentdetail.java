import java.util.Scanner;

class student
{
    String name;
    int rollno;
    int fees;
  

   public void getdata()
   { 
     Scanner Sc=new Scanner(System.in);
     System.out.println("Enter the name");
     name=Sc.nextLine();

    System.out.println("Enter the roll number");
    rollno=Sc.nextInt();

    System.out.println("Enter the fees");
    fees=Sc.nextInt();
   }

   public void showdata()
   {
     System.out.println("Name of the student is :" +name);
     System.out.println("Age of the student is :" +rollno);
     System.out.println("Age of the student is :" +fees);
   }
}

class sciencestudent extends student
{
   float physics;
   float chemistry;
   float maths;
   double percent;   

   public void setdata()
   {
     Scanner S=new Scanner(System.in);
     System.out.println("Enter the marks of physics");
     physics=S.nextFloat();

     System.out.println("Enter the marks of chemistry");
     chemistry=S.nextFloat();

     System.out.println("Enter the marks of maths");
     maths=S.nextFloat();
   }
  
   public void displaydata()
   {
     System.out.println("Marks of physics is :" +physics);
     System.out.println("Marks of chemistry is :" +chemistry);
     System.out.println("Marks of maths is :" +physics);
   }



   public void percentage()
   {
     percent=(physics+chemistry+maths)/3;
    
   }
   
  public void per()
  {
    System.out.println("The percentage of student is :" +percent);
  }
}

class studentdetail
{
   public static void main(String[] args)
   {
     sciencestudent obj=new sciencestudent();
     obj.getdata();
     obj.showdata();
     obj.setdata();
     obj.displaydata();
     obj.percentage();
     obj.per();
   }
}



















