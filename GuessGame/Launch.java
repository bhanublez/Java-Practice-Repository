package GuessGame;
import java.util.*;
public class Launch {
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Guesser Game!!");
        System.out.println(
            "In this game player need to guess the randomly gerated number. In range 1 to 100 \n"+
            "The game is available in two modes \" VS Computer \"  and \" Vs Human.\n"+
            "This game is Multi player game. \n"+
            "Please enter S to start and any other character key to exit."
        );

        Scanner sc=new Scanner(System.in);
        String c=sc.next();
        String mode,name;
        c=c.toLowerCase();
        if(c.equals("s")){
            while(1>0){
                System.out.println("If want to paly against computer press C and If want to play with friend's press F  ");
                mode=sc.next();
                mode=mode.toLowerCase();
                if(mode.equals("c")){
                    Scanner nm=new Scanner(System.in);
                    System.out.println("Please Enter your name");
                    name =nm.nextLine();
                    Player p= new Player(name);
                    Player com= new Player("Computer");
                    Guesser gss=new Guesser();
                    Umpire um=new Umpire();
                    um.randomNums();
                    int flag=0,guess;
                    while(1>0){
                        if(flag==0){
                            System.out.println("Hello Sir "+p.getName()+" Your turn");
                             guess=gss.guessNum(); 
                             String str=um.checker(guess);
                             System.out.println(str);
                            flag=um.change(str);
                            if(flag==-1){
                                break;
                            }
                        }else{
                            System.out.println("Computer turn");
                            guess=gss.hashCode();
                            System.out.println(um.checker(guess));
                            flag=0;
                        }
                        
                    }                
                }else if(mode.equals("f")){
                            System.out.println("Enter number of player gone paly?");
                            int num=sc.nextInt();
                            Scanner nm=new Scanner(System.in);
                            Player[] arr=new Player[num];
                            for(int i=0;i<num;i++){
                                System.out.println("Enter player name");
                                name =nm.nextLine();
                                 arr[i]=  new Player(name);
                            } int j=0;
                            Umpire um=new Umpire();
                            Guesser gss=new Guesser();
                            um.randomNums();
                            while(1>0){
                                System.out.println(arr[j].getName()+" Turn");
                                int guess=gss.guessNum();
                                String str=um.checker(guess);
                                System.out.println(str);
                                int temp=um.change(str);
                                if(temp==-1){
                                    break;
                                }
                                j++;
                                if(j==num){
                                    j=0;
                                }
                            }              
                                    }
                           else
                           {
                            System.out.println("Entered wrong key");
                           }
           
        }
        }else{
            System.out.println("Thanking for playing");
            System.exit(0);
        }
    }
}
