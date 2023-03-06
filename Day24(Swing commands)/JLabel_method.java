import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
public class JLabel_method{

    public static void main(String ar[]){
        JLabel label=new JLabel();
        ImageIcon image=new ImageIcon("lala.gif");
        Border border=BorderFactory.createLineBorder(new Color(54,154,215),3);
        label.setText("Bro, do you even know me!");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//CENTER,TOP ,BOTTOM
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setIconTextGap(25);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
       // label.setBounds(0,0,480,460);
        JFrame frame =new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
        //5.57
        


    }
}
