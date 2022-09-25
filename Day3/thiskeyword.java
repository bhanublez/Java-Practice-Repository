import java.util.Scanner;

class thiskeyword
{
  int x,y,z,product;
  
  public thiskeyword(int x,int y,int z)
  {
    this.x=x;
    this.y=y;
    this.z=z;
    product=1;
  }

  public void compute()
  {
    product=x*y*z;
  }

  public void show()
  {
    this.compute();
    System.out.println("Product of three numbers is :" +product);
  }
  
  public static void main(String[] args)
  {
    int p=0,q=0,r=0;
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the values");
    p=Sc.nextInt();
    q=Sc.nextInt();
    r=Sc.nextInt();

    thiskeyword K=new thiskeyword(p,q,r);
    K.show();
  }
}