import java.util.Scanner;

interface Sum
{
  public int add();
}

interface Product
{
  public double multiply();
}

interface Average
{
  public double mean();
}


class calculator implements Sum,Product,Average
{
  int n1,n2,n3;
  double d1,d2,d3;
  
  calculator(int x,int y,int z,double p,double q,double r)
  {
    n1=x;
    n2=y;
    n3=z;
    d1=p;
    d2=q;
    d3=r;
	
  }



   
   public int add()
   {
     return(n1+n3);
   }


     
   public double multiply()
   {
     return(d1*d3);

   }



  public double mean()
  {
    double m;
    m=(n2+d2)/2;
	return m;
  }

}
class Multiinterface
{

  public static void main(String[] args)
  {
   calculator d=new calculator(26,89,54,50.5,89.55,65.66);
   System.out.println("Sum of two integers is :" +d.add());
   System.out.println("Product of two doubles is :" +d.multiply()); 
   System.out.println("Average of a integer and a double is :" +d.mean());
  }

}  




























