import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class Button_method implements ActionListener{
    public static JButton button;
    public static void actionPerformed(ActionEvent e){
    if(e.getSource()==button){
 System.out.println("poo");
    }
}
    public static void main(String ar[]){
    JFrame frame =new JFrame("Button working");
     button =new JButton();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setSize(500,500);
    frame.setVisible(true);
    button.setBounds(200,100,100,50);
    frame.add(button);
    //6.17
}
}   