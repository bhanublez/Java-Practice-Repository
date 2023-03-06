import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
public class method_panel{

    public static void main(String ar[]){
        JLabel label=new JLabel();
        label.setText("Hello caty");
        ImageIcon icon =new ImageIcon("cat.jpg");
        label.setIcon(icon);
        JPanel redpanel=new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0,250,250);
        
        JPanel bluepanel=new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250,0,250,250);

        JPanel greenpanel=new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,250,250,250);
        
        //redpanel.setLayout(new BorderLayout());

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        redpanel.add(label);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
        

    }
}