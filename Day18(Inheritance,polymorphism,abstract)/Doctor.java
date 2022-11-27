import java.util.*;

class Doctor{
    boolean workathospital;
    void treatpatient(){
        //perform checkup
    }
}
class familydoctor extends Doctor{
    boolean comeathouse;
    
    void giveAdvice(){
 //give homespun advice
    }
}
class Surgeon extends Doctor{
    void treatpatient(){
        
        //perform surgery
    }
    void Incision(){
        //makes incision (yikes!)
    }
}