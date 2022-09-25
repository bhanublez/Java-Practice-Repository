import java.util.Scanner;

class Profile
{
  String name;
  String enroll;
  int sem;
 

  public void getPinfo()
  {
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the name");
    name=Sc.nextLine();

   System.out.println("Enter the enrollment number");
   enroll=Sc.nextLine();

   System.out.println("Enter the semester");
   sem=Sc.nextInt();
  } 
 
  public void showPinfo()
  {
     System.out.println("Name of student :" +name);
     System.out.println("Enrollment of student :" +enroll);
     System.out.println("Semester of student :   " +sem);
  }
}

class Mst extends Profile
{
  int mst_marks;
  int a,EEE,Dis,Data,Digital,Oopm;
 

  public void getMstinfo()
  {
    int a[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the mst marks of EEE");
    EEE=sc.nextInt();

    System.out.println("Enter the mst marks of Discrete");
    Dis=sc.nextInt();

    System.out.println("Enter the mst marks of Data");
    Data=sc.nextInt();


    System.out.println("Enter the mst marks of Digital");
    Digital=sc.nextInt();

    System.out.println("Enter the mst marks of Oopm");
    Oopm=sc.nextInt();
  }

  public void showMstinfo()
  {
     System.out.println("Marks of EEE :" +EEE);
     System.out.println("Marks of Discrete :" +Dis);
     System.out.println("Marks of Data :" +Data);
     System.out.println("Marks of Digital :" +Digital);
     System.out.println("Marks of Oopm :" +Oopm);
  }
  
  public void computeMst()
  {
    double percent=(EEE+Dis+Data+Digital+Oopm)/5;
    System.out.println("The percentage of mst is :" +percent);
  }
}




class Put extends Mst
{
  int mst_marks;
  int a,EEE,Dis,Data,Digital,Oopm;
 

  public void getPutinfo()
  {
    int a[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Put marks of EEE");
    EEE=sc.nextInt();

    System.out.println("Enter the Put marks of Discrete");
    Dis=sc.nextInt();

    System.out.println("Enter the Put marks of Data");
    Data=sc.nextInt();


    System.out.println("Enter the Put marks of Digital");
    Digital=sc.nextInt();

    System.out.println("Enter the Put marks of Oopm");
    Oopm=sc.nextInt();
  }

  public void showPutinfo()
  {
     System.out.println("Marks of EEE :" +EEE);
     System.out.println("Marks of Discrete :" +Dis);
     System.out.println("Marks of Data :" +Data);
     System.out.println("Marks of Digital :" +Digital);
     System.out.println("Marks of Oopm :" +Oopm);
  }
  
  public void computePut()
  {
    double percent=(EEE+Dis+Data+Digital+Oopm)/5;
    System.out.println("The percentage of Put is :" +percent); 

  }


   public static void main(String[] args)
   {
     Profile obj=new Profile();
     obj.getPinfo();
     obj.showPinfo();
    
  
    Mst obj1=new Mst();
    obj1.getMstinfo();
    obj1.showMstinfo();
    obj1.computeMst();


   Put obj2=new Put();
   obj2.getPutinfo();
   obj2.showPutinfo();
   obj2.computePut();
    
   }
}










































