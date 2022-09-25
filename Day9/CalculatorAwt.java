

import java.awt.*;
  import java.awt.event.*;


class Awt3 implements ActionListener
{
   Frame f;
   Panel p;
   Label ln1,ln2,lres,lresout;
    TextField tn1,tn2;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;

   public Awt3()
{
    f=new Frame("AWT GUI APPLICATION");
    p=new Panel();

    ln1=new Label("Enter First Number:- ");
     ln2=new Label("Enter Second Number:- ");
    lres=new Label("####RESULT####");
    lresout=new Label("Display the Result here....");

    tn1=new TextField(20);
    tn2=new TextField(20);
   
    btn1=new Button("ADD");
    btn1.addActionListener(this);
    btn2=new Button("SUB");
    btn2.addActionListener(this);
    btn3=new Button("MUL");
    btn3.addActionListener(this);
    btn4=new Button("MODE");
    btn4.addActionListener(this);
    btn5=new Button("DIVIDE");
    btn5.addActionListener(this);

    btn6=new Button("REFRESH");
    btn6.addActionListener(this);
    btn7=new Button("EXIT");
    btn7.addActionListener(this);

    p.setLayout(new GridLayout(8,2));
    p.add(ln1);
    p.add(tn1);
    p.add(ln2);
    p.add(tn2);
   
   

   p.add(lres);
   p.add(lresout);

   p.add(btn1);
   p.add(btn2);
   p.add(btn3);
   p.add(btn4);
   p.add(btn5);
   p.add(btn6);
   p.add(btn7);

   f.setLayout(new FlowLayout());
   f.add(p);

   f.setSize(400,400);
   f.setVisible(true);
}
   public void actionPerformed(ActionEvent act)
{
   if(act.getSource()==btn1)
{
   int n1,n2;
   n1=Integer.parseInt(tn1.getText());
   n2=Integer.parseInt(tn2.getText());
   int sum=n1+n2;
   lresout.setText(String.valueOf(sum));
}
    if(act.getSource()==btn2)
{
   int n1,n2;
   n1=Integer.parseInt(tn1.getText());
   n2=Integer.parseInt(tn2.getText());
   int sub=n1-n2;
   lresout.setText(String.valueOf(sub));
}
    if(act.getSource()==btn3)
{
   int n1,n2;
   n1=Integer.parseInt(tn1.getText());
   n2=Integer.parseInt(tn2.getText());
   int mul=n1*n2;
   lresout.setText(String.valueOf(mul));
}
   if(act.getSource()==btn4)
   {
   int n1,n2;
   n1=Integer.parseInt(tn1.getText());
   n2=Integer.parseInt(tn2.getText());
   int mode=n1%n2;
   lresout.setText(String.valueOf(mode));
}
   if(act.getSource()==btn5)
   {
   int n1,n2;
   n1=Integer.parseInt(tn1.getText());
   n2=Integer.parseInt(tn2.getText());
   int div=n1/n2;
   lresout.setText(String.valueOf(div));
}
    if(act.getSource()==btn6)
{
    double n1,n2,n3=0.0;
    tn1.setText("");
    tn2.setText("");
   
   lresout.setText("Display the Result here.....");
}
   if(act.getSource()==btn7)
{
    System.exit(0);
}
}

  public static void main(String[] args)
{
   new Awt3();
}
}