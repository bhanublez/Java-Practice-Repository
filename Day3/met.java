

class Base
{
  public void show()
  {
    System.out.println("My name is Shashank Geed");
  }

}

class Child extends Base
{
  public void show()
  {
    System.out.println("Hello world");
  }
}


class met
{
  public static void main(String[] args)
 {
  Child c =new Child();
  c.show();
  
  Base B =new Base();
  B.show();
 }
}