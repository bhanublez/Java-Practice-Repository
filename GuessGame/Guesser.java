package GuessGame;
import java.util.*;

public class Guesser {
    private int guessedNum;
    private int guessingNum;
    public int randomNum(){
        this.guessingNum=(int) Math.random()*(100+1);
        return this.guessingNum;
    }
    public int guessNum(){
        while(1>0){
        System.out.println("Please enter your guessing number between 1 to 100");
        Scanner sc=new Scanner(System.in);
      try{
        this.guessedNum=sc.nextInt();
      }catch(Exception e){
        System.out.println("You enter incorrect type data please enter coreect data");
        continue;
      }
       if(this.guessedNum >0 && this.guessedNum<101){
            return this.guessedNum;
       }else{
        System.out.println("You have entered the digit out of bound");
        continue;
       }
        }
    }

}
