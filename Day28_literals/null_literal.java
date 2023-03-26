package Day28_literals;

public class null_literal {
 public static void main(String[] args) {
    null_literal object = null;
    null_literal[] objects = new null_literal[]{new null_literal(), null, new null_literal()};
    myMethod(null);
    if (objects != null) {
    // Do something
    }
 }

private static void myMethod(Object object) {
   // System.out.println("Just a local mymethod bla bal");
}   
}
