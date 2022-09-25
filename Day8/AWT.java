import java.awt.*;

class AWT
{
Frame f;
Panel p;
Label ln1,ln2,ln3,lres,lresout;
TextField tn1,tn2,tn3;
Button btn1,btn2,btn3;


public AwtGuiAppPr21()
{
f=new Frame("AWT GUI APPLICATION");
p=new Panel();

ln1=new Label("Enter First Number:");
ln2=new Label("Enter Secound Number:");
ln3=new Label("Enter Third Number:");
lres=new Label("#### AVERAGE ####");
lresout=new Label("Display the Result here......:");
tn1=new TextField(20);
tn2=new TextField(20);
tn3=new TextField(20);
btn1=new Button("COMPUTE");
btn2=new Button("REFRESH");
btn3=new Button("EXIT");

p.setLayout(new GridLayout(6,2));
p.add(ln1);
p.add(ln2);
p.add(ln3);
p.add(tn1);
p.add(tn2);
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


public static void main(String[] args)
{
new AWT();
}
}

