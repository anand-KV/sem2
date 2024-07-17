import java.awt.*;
import java.awt.event.*;
public class calframe extends Frame implements ActionListener
{
    TextField t1,t2,t3;
    Label l1,l2,l3;
    Button b1,b2,b3,b4;
    calframe()
    {
        setLayout(new FlowLayout());
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        l1=new Label("first number:");
        l2=new Label("second number:");
        l3=new Label("third number:");
        b1=new Button("+");
        b2=new Button("-");
        b3=new Button("*");
        b4=new Button("/");
        add(l1);
        add(t1);
        
        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        t1.setText("");
        t2.setText("");
        t3.setText("");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int a,b,re=0;
        a=Integer.parseInt(t1.getText());
        b=Integer.parseInt(t2.getText());
        if(ae.getSource()==b1)
        {
            re=a+b;
            t3.setText("number:"+re);
        }
        else if(ae.getSource()==b2)
        {
            re=a-b;
            t3.setText("number:"+re);
        }
        else if(ae.getSource()==b3)
        {
            re=a*b;
            t3.setText("number:"+re);
        }
        else if(ae.getSource()==b4)
        {
            if(b==0)
            {
             t3.setText("division not possible");   
            }
            else
            {
            re=a/b;
            t3.setText("number:"+re);
            }
        }
    }
    public static void main(String ar[])
    {
        calframe f= new calframe();
        f.setTitle("calculator");
        f.setSize(400,500);
        f.setVisible(true);
    }
}