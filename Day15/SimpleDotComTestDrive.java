import java.util.*;
import java.io.*;

public class SimpleDotComTestDrive {
    public static void main (String args[]) {
    SimpleDotCom dot = new SimpleDotCom();
    int randomnum=(int) (Math.random()*5);

    int[] locations = {randomnum,randomnum+1,randomnum+2};
    dot.setLocationCells(locations);
    Scanner sc= new Scanner(System.in);
    BufferReader is= new BufferReader(new InputStreamReader(System.in));
    String userGuess=is.readLine();
    System.out.println("Enter you guess please");
    //String userGuess = sc.next();
    String result = dot.checkYourself(userGuess);
    }
    }
    class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    public void setLocationCells(int[] locs) {
    locationCells = locs;
    }
    public String checkYourself(String stringGuess) {
    int guess = Integer.parseInt(stringGuess);
    String result = "miss";
    for (int cell : locationCells) {
    if (guess == cell) {
    result = "hit";
    numOfHits++;
    break;
    }
    } // out of the loop
    if (numOfHits ==
    locationCells.length) {
    result = "kill";
    }
    System.out.println(result);
    return result;
    } // close method
    } // close class