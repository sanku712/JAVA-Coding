import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener
{
    TextArea t;
    Panel p;

    String btnString[] = {"1","2","3","+","4","5","6","-","7","8","9","*","C","0","=","/"};
    Button btn[]= new Button[16];

    int num1=0, num2=0, result=0;
    char op;

    public Calculator()
    {
        Font f1= new Font("Arial",Font.PLAIN,15);
        setFont(f1);

        Font f2=new Font("Arial",Font.BOLD,20);
        t.setFont(f2);

        p=new Panel();
        add(t,  "North");
        add(t,  "Center");

        p.setLayout(new GridLayout(4,4));

        for(int i=0;i<16;i++)
        {
            btn[i]=new Button(btnString[i]);
            btn[i].addActionListener(this);
            p.add(btn[i]);
        }
        addWindowListener(new WindowAdapter()
        {
        public void WindowClosing(WindowEvent we)
        {
            System.exit(0);
            }
        });
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String str= ae.getActionCommand();

        if(str.equals("+"))
        {
            op='+';
            num1=Integer.parseInt(t.getText());
            t.setText("");
        }

        else if(str.equals("-"))
        {
            op='-';
            num1=Integer.parseInt(t.getText());
            t.setText("");
        }
        else if(str.equals("*"))
        {
            op='*';
            num1=Integer.parseInt(t.getText());
            t.setText("");       
        }
        else if(str.equals("/"))
        {
            op='/';
            num1=Integer.parseInt(t.getText());
            t.setText("");
        }

        else if(str.equals("="))
        {
            num2=Integer.parseInt(t.getText());
            switch(op)
            {
                case '+' : result = num1+num2;
                break;

                case '-' : result = num1-num2;
                break;

                case '*' : result = num1*num2;
                break;

                case '/' : result = num1/num2;
                break;
            }
            t.setText(result + "");
            result = 0;
        }
        else if(str.equals("C"))
        {
            t.setText("");
            num1 = num2 = result = 0;
        }
        else{
            t.setText(t.getText() + str);
        }
    }
    public static void main(String [] args)
    {
        Calculator c = new Calculator();

        c.setTitle("Calculator");
        c.setSize(400,300);
        c.setVisible(true);

    }

}