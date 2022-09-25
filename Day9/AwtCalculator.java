import java.awt.*;
import java.awt.event.*;

class AwtCalculator implements ActionListener
{
  Frame f;
  Panel p;
  Label ln1,ln2,ln3,lres,lresout;
  TextField tn1,tn2,tn3;
  Button btn1,btn2,btn3;  

  public AwtCalculator()
  {
    f=new Frame("AWT GUI APPLICATION");
    p=new Panel();

    ln1=new Label("Enter the first number :");
    ln2=new Label("Enter the second number :");
    ln3=new Label("Enter the third number");
    lres=new Label("######AVERAGE#####");
    lresout=new Label("Display the resuly here....");
    tn1=new TextField(20);
    tn2=new TextField(20);
    tn3=new TextField(20);


    btn1=new Button("COMPUTE");
    btn1.addActionListener(this);

    btn2=new Button("REFRESH");
    btn2.addActionListener(this);

    btn3=new Button("EXIT");
    btn3.addActionListener(this);

    p.setLayout(new GridLayout(6,2));
    p.add(ln1);
    p.add(tn1);
    p.add(ln2);
    p.add(tn2);
    p.add(ln3);
    p.add(tn3);
    p.add(lres);
    p.add(lresout);
    
    p.add(btn1);
    p.add(btn2);
    p.add(btn3);

    f.setLayout(new FlowLayout());
    f.add(p);
    f.setSize(400,400);
    f.setVisible(true);
  }

  
   public void actionPerformed(ActionEvent act)
   {
    if(act.getSource()==btn1)
     {
      double n1=0.0,n2=0.0,n3=0.0;
      n1=Double.parseDouble(tn1.getText());
      n2=Double.parseDouble(tn2.getText());
      n3=Double.parseDouble(tn3.getText());

      double s_3=n1+n2+n3;
      double avg=s_3/3;
      lresout.setText(String.valueOf(avg));
     }

     if(act.getSource()==btn2)
     {
       tn1.setText("");
       tn2.setText("");
       tn3.setText("");
       lresout.setText("Display the result here......");
     }
 
     if(act.getSource()==btn3)
     {
       System.exit(0);
     }
   }

  public static void main(String[] args)
  {
   new AwtCalculator();
  }
}























