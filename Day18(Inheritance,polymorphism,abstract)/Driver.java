import java.util.*; 
//abstract is just like overridding a method abstract class don't have body and other are concrete class
abstract class Driver{
        public static void main(String [] args) {
            Monster [] ma = new Monster[3];
            ma[0] = new Vampire();
            ma[1] = new Dragon();
            ma[2] = new Monster();
            for(int x = 0; x < 3; x++) {
            ma[x].frighten(x);
        }
    }
    
}
 class Monster {
    boolean frighten(int x) {
        System.out.println("arrrgh");
        return true;
        }
}
class Vampire extends Monster {
boolean frighten(int degree) {
    System.out.println("Bite!");
    return true;
}
}
class Dragon extends Monster {
boolean frighten(int degree) {
System.out.println("Breath out fire");
return true;
}
}