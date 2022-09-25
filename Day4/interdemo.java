
import java.util.Scanner;
interface CALC_DEMO
{
  public void add();
  public void multiply();
}
class compute implements CALC_DEMO
{
  double x,y,z,add;
  public void add()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter three numbers: ");
  x=sc.nextDouble();
  y=sc.nextDouble();
  z=sc.nextDouble();
  add=(x+y+z);
 System.out.println("The addition of three numbers= "+add);
 }
 public void multiply()
 {
  
  System.out.println("The multiplication of three numbers= "+(x*y*z));
 }
}
class interdemo
{
  public static void main(String[] args)
 {
  compute c1=new compute();
  c1.add();
  c1.multiply();
 }
}