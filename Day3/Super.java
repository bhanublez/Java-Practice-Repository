class Base
{
  public void show()
  {
    System.out.println("My name is Shashank Geed");
  }

}

class Child extends Base
{
  public void display()
  {
   super.show();
   System.out.println("Hello child class");
  } 
}

class Super
{
  public static void main(String[] args)
  {
    Child c=new Child();
    c.display();
  }
}