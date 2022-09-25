import java.applet.*;
import java.awt.*;

public class Shape extends Applet
{
   public void paint(Graphics g)
   {
     g.setColor(Color.red);
     g.drawRect(550,50,550,50);
     g.fillRect(550,50,550,50);
     

     g.setColor(Color.yellow);
     g.drawOval(150,50,250,50);
     g.fillOval(150,50,250,50);
   
   }
} 

/*
<applet code="Shape.class" width="3000" height="3000">
</applet>
*/