import java.awt.*;
import java.awt.event.*;
class FrameAE extends Frame implements ActionListener
{
    TextField t1;
    Button b1,b2;

    void setframe()
    {
        setTitle("Frame Action Event: ");
        setSize(400,200);
        setVisible(true);
        setLayout(new GridLayout(3,1));

        t1=  new TextField("Click Any Button");
        
        b1 = new Button("Yes");
        b2=  new Button("No");

        add(t1);
        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            t1.setText("Yes Button Clicked");
        }
        if(e.getSource()==b2)
        {
            t1.setText("No Button Clicked");
        }
    }
}

class AEmain
{
    public static void main(String []args)
    {
        FrameAE f = new FrameAE();
        f.setframe();
    }
}