import java.util.*;
import java.io.*;

public class SimpleDotComTestDrive {
    public static void main (String args[]) {
    SimpleDotCom dot = new SimpleDotCom();
    int randomnum=(int) (Math.random()*5);

    int[] locations = {randomnum,randomnum+1,randomnum+2};
    dot.setLocationCells(locations);
    Scanner sc= new Scanner(System.in);
    String userGuess=null;
    
    try{
    BufferedReader is= new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter you guess please");
    userGuess = is.readLine();
    //String userGuess = sc.next();

    }catch (Exception e) {
       System.out.println(e);
    }
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