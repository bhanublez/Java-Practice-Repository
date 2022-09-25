 import java.awt.*;
  import java.awt.event.*;


class HyperItemEvent implements ItemListener,ActionListener
{
   Frame f;
   Panel p;
   Label l1,l2,l3,l4,l5;
    TextField t1,t2,t3,t4,t5;
    Button b1,b2;
    Checkbox c1;

   public HyperItemEvent()
  {
    f=new Frame("AWT GUI APPLICATION");
    p=new Panel();

    l1=new Label("Enter First Number:");
    l2=new Label("Enter Second Number:");
    l3=new Label("Enter Third Number:");
    l4=new Label("SUM OF THREE NUMBERS IS:");
    l5=new Label("AVERAGE OF THREE NUMBERS IS:");

    t1=new TextField(20);
    t2=new TextField(20);
    t3=new TextField(20);
    t4=new TextField(20);
    t5=new TextField(20);
   
   
   
   
    b1=new Button("SHOW RESULT");
    b1.addActionListener(this);
    b1.setVisible(false);
   
    b2=new Button("EXIT");
    b2.addActionListener(this);
 
    c1=new Checkbox("CLICK TO ENABLE RESULT BUTTON");
    c1.addItemListener(this);

   
   

    p.setLayout(new GridLayout(7,2));
    p.add(l1);
    p.add(t1);
    p.add(l2);
    p.add(t2);
    p.add(l3);
    p.add(t3);
    p.add(l4);
    p.add(t4);
   p.add(l5);
   p.add(t5);
   p.add(b2);
   p.add(c1);
   p.add(b1);
   

   f.setLayout(new FlowLayout());
   f.add(p);

   f.setSize(500,500);
   f.setVisible(true);
 }
   public void actionPerformed(ActionEvent act)
  {
   if(act.getSource()==b2)
   System.exit(0);
 
   if(act.getSource()==b1)
  {
   int x=0,y=0,z=0,sum=0;
   float avg=0.0f;

    x=Integer.parseInt(t1.getText());
    y=Integer.parseInt(t1.getText());
    z=Integer.parseInt(t1.getText());
   
    sum=x+y+z;
    avg=sum/3;
   

    t4.setText(String.valueOf(sum));
    t5.setText(String.valueOf(avg));
  }

 }
 
   public void itemStateChanged(ItemEvent ie)
  {
    if(ie.getSource()==c1)
    {
     if(c1.getState()==true)
     b1.setVisible(true);
  
     else
     b1.setVisible(false);

    }
 }


  public static void main(String[] args)
{
   new HyperItemEvent();
}
 
}
