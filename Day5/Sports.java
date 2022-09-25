import java.util.Scanner;

interface Player
{
  void showPlayerDetails();
  
}

class CricketPlayer implements Player
{

   int m,r,w,c;
   CricketPlayer(int matches,int runs,int wickets,int catches)
   {
      m=matches;
      r=runs;
      w=wickets;
      c=catches;
   }

   public void showPlayerDetails()
   {
     System.out.println("Numbers of cricket matches :" +m);
     System.out.println("Total runs :" +r);
     System.out.println("Total wickets fallen :" +w);
     System.out.println("Total catches :" +c);
   }

}

class TennisPlayer implements Player
{
   int m,t,g;
   TennisPlayer(int matches,int titles,int grandslams)
   {
      m=matches;
      t=titles;
      g=grandslams;
   }
   

   public void showPlayerDetails()
   {
     System.out.println("Total tennis matches :" +m);
     System.out.println("Total numbers of titles won :" +t);
     System.out.println("Total grandslams :" +g);
   }

}


class FootballPlayer implements Player
{
  int m,g;

  FootballPlayer(int matches,int goals)
  {
    m=matches;
    g=goals;
  }

  public void showPlayerDetails()
  {
     System.out.println("Total football matches :" +m);
     System.out.println("Total numbers goals :" +g);
  }
 
}

class Sports
{
   public static void main(String[] args)
   {
     CricketPlayer obj=new CricketPlayer(250,12000,2500,2000);
     obj.showPlayerDetails();

     TennisPlayer T=new  TennisPlayer(200,50,25); 
     T.showPlayerDetails();

     FootballPlayer F=new FootballPlayer(500,1000);
     F.showPlayerDetails();
   }
}






