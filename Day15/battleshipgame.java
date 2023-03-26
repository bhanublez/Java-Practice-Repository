import java.util.*;
import java.io.*;
import java.math.*;

class battleshipgame{
    
    
    private int numOfGuesses=0;
    private ArrayList<String> d_list = new ArrayList<String>();
    private GameHelper helper = new GameHelper();
    
    private void setUpGame(){
            
            String one = new String("Bhanu");
            //one.setName("Bhanu");
            String two = new String("Rahul");
            //two.setName("Vishal");
            String three = new String("Vishal");
            //three.setName("Rahul");
            d_list.add(one);
            d_list.add(two);
            d_list.add(three);
    System.out.println("Your goal is to sink three names");
    System.out.println("Bhanu, Rahul, Vishal");
    System.out.println("Try to sink them all in the fewest number of guesses");
    for(String nameTest: d_list){
        ArrayList<String> newLocation=helper.placeDotCom(3);
        //d_list.setLocationCells(newLocation);
    }                 
    }
    private void startPlaying(){

    }

public static void main(String args[]){
    battleshipgame game= new battleshipgame();
    game.setUpGame();
    game.startPlaying();

}

}