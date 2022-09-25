import java.util.Scanner;

interface I1
{
  public void add();
}

interface I2
{
  public void multiply();
}

interface I3
{
  public void subtract();
}


class Calculate implements I1,I2,I3
{
  int x,y,z;

  
  Calculate(int x1,int y1,int z1)
  {
    x=x1;
    y=y1;
    z=z1;
  }
   
   public void add()
   {
    int addition=x+y+z;
    System.out.println("Addition of three numbers is :" +addition);
   }


     
   public void multiply()
   {
    int multiply=(x*y*z);
    System.out.println("Addition of three numbers is :" +multiply);

   }



  public void subtract()
  {
   System.out.println("Subtraction of three numbers is :" +(x-y-z));
  }



  public static void main(String[] args)
  {
   Calculate c=new Calculate(5500,25,620);
   c.add();
   c.multiply();
   c.subtract();
 
  }

}  




























