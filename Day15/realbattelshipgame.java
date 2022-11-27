import java.util.*;
import java.math.*;
import java.io.*;

public class realbattelshipgame{
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;
    private void setUpGame() {
    // fi rst make some dot coms and give them locations
    DotCom one = new DotCom();
    one.setName("Pets.com");
    DotCom two = new DotCom();
    two.setName("eToys.com");
    DotCom three = new DotCom();
    three.setName("Go2.com");
    dotComsList.add(one);
    dotComsList.add(two);
    dotComsList.add(three);
    System.out.println("Your goal is to sink three dot coms.");
    System.out.println("Pets.com, eToys.com, Go2.com");
    System.out.println("Try to sink them all in the fewest number of guesses");
    for (DotCom dotComToSet : dotComsList) {
    ArrayList<String> newLocation = helper.placeDotCom(3);
    dotComToSet.setLocationCells(newLocation);
    } // close for loop
    } // close setUpgame method
    private void startPlaying() {
    while(!dotComsList.isEmpty()) {
    String userGuess = helper.getUserInput("Enter a guess");
    checkUserGuess(userGuess);
    } // close while
    finishGame();
    } // close startPlaying method

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";
        for (DotCom dotComToTest : dotComsList) {
        result = dotComToTest.checkYourself(userGuess);
        if (result.equals("hit")) {
        break;
        }
        if (result.equals("kill")) {
        dotComsList.remove(dotComToTest);
        break;
        }
        } // close for
        System.out.println(result);
        } // close method
        private void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numOfGuesses <= 18) {
        System.out.println("It only took you " +  numOfGuesses + " guesses.");
        System.out.println(" You got out before your options sank.");
        } else {
        System.out.println("Took you long enough. "+ numOfGuesses + " guesses.");
        System.out.println("Fish are dancing with your options");
        }
        } // close method
        public static void main (String[] args) {
        realbattelshipgame game = new realbattelshipgame();
        game.setUpGame();
        game.startPlaying();
        } // close method
        }







      