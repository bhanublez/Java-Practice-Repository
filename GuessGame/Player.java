package GuessGame;

public class Player {
    private String guessername;
    private int gNum;
    public Player(String name){
        this.guessername=name;
    }
      public int gNum(){
        return this.gNum;
    }
    public String getName(){
        return guessername;
    }
}
