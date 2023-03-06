import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
public class MyFrame extends JFrame{

  MyFrame(){
        JFrame frame=new JFrame();
        frame.setTitle("My title is Bittle");//Use for setting title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);//set x and y dimension size
        frame.setResizable(false);//prevent from frame being rsiized
        frame.setVisible(true); //make frame visible
        ImageIcon image=new ImageIcon("aa3.jpg");//Store image in variable
        frame.setIconImage(image.getImage());//change the the deafault java icon image 
        //frame.getContentPane().setBackground(Color.green);
        frame.getContentPane().setBackground(new Color(200,152,054));//change colour of background

    }
}