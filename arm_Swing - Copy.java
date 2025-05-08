import javax.swing.*;
import java.awt.event.*;

public class arm_Swing  extends JFrame{
    JLabel enterNo,result;
    JTextField number;
    JButton armstrong,close,clear;

    public arm_Swing()
    {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400,500);

        enterNo=new JLabel("enter any number=");
        enterNo.setBounds(30,40,100,30);

        number=new JTextField();
        number.setBounds(200,40,100,30);

        armstrong=new JButton("Armstrong");
        armstrong.setBounds(60,80,130,30);

        close=new JButton("Close");
        close.setBounds(220,80,80,30);

        result=new JLabel();
        result.setBounds(140,160,200,30);

        clear=new JButton("clear");
        clear.setBounds(40,120,190,30);

        add(close);
        add(armstrong);
        add(number);
        add(enterNo);
        add(result);
        add(clear);

        armstrong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                
                try{
                    int value=Integer.parseInt(number.getText());
                    if(arm(value))
                    {
                        result.setText(value+" is armstrong");
                    }
                    else{
                        result.setText(value+" is not armstrong");
                    }
                }
                catch(NumberFormatException ex)
                {
                    result.setText("please enter valid digit");
                }
              

            }
        });
        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                result.setText(" ");
                number.setText("0");

            }
        });
    }
    public Boolean arm(int value)
        {
           int n= String.valueOf(value).length();
           
            int temp=value;
            double sum=0;
            while(value!=0)
            {
                int digit=value%10;
                sum=sum+Math.pow(digit, n);
                value=value/10;
            }
            return sum==temp;
            
        }

    public static void main(String[] args)
    {
        new arm_Swing();
    }
}
