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



   
   public int Sum()
   {
     return(n1+n3);
   }


     
   public double Product()
   {
     return(d1*d3);

   }



  public double Average()
  {
    double m;
   return  m=(n2+d2)/2;
  }


  public static void main(String[] args)
  {
   calculator d=new calculator(26,89,54,50.5,89.55,65.66);
   System.out.println("Sum of two integers is :" +d.Sum());
   System.out.println("Product of two doubles is :" +d.Product()); 
   System.out.println("Average of a integer and a double is :" +d.Sum());
  }




  @Override
  public double mean() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'mean'");
  }




  @Override
  public double multiply() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'multiply'");
  }




  @Override
  public int add() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
  }

}  




























