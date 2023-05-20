package GuessGame;
import java.util.*;

public class Umpire {
   private int guessingNum;
    public void randomNums(){
        Random rand=new Random();
        this.guessingNum=rand.nextInt(100);
        System.out.println(guessingNum);
    }
    // public int randomNum(){
    //     this.guessingNum=(int) Math.random()*(100+1);
    //     return this.guessingNum;
    // }
    public String checker(int num){
      String str="";
        if(num==guessingNum){
        str="Congratulation Guessed the correct digit";
       }else if(num>guessingNum){
        str="Sorry guessed a digit greater then the required digit";
       }else if(num<guessingNum){
        str="Sorry  guessed a digit lesseer the the required digit";
       }
        
        return str;
    }
    public int change(String str){
        if(str.equals("Congratulation Guessed the correct digit")){
            return -1;
        }
        return 1;
    }
}
