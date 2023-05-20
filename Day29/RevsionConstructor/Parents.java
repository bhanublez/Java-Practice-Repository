package RevsionConstructor;

class Parent {
    private String name;
    private int age;
    
    public Parent() {
        System.out.println("Kuck to hoga means something took place");
    } 
    
    public Parent(String tName, int tAge) {
    name = tName;
    age = tAge;
    }

    //super keyword not used
    public class Child1 extends Parent {
        public Child1() {
        name = "Lord Danzo Panzo Ranzo";
        age =782;
        }
       }

       //super keyword is used
       public class Child2 extends Parent {
        public Child2() {
        super("Lord panzo Danzo", 4232); 
        }
       }
        
   }
   
