import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class arm_Swing  extends JFrame{
    JLabel enterNo,result;
    JTextField number;
    JButton armstrong,close,clear;
    JPanel panel=new JPanel();

    public arm_Swing()
    {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,500);
        setTitle("armstrong checker");
       // setLocationRelativeTo(null); //centre the Jframe on screen

        panel.setLayout(null);
        panel.setBounds(50,80,320,250);
        
    
        enterNo=new JLabel("enter any number=");
        enterNo.setBounds(30,40,150,30);

        number=new JTextField();
        number.setBounds(200,40,100,30);

        armstrong=new JButton("Armstrong");
        armstrong.setBounds(60,80,200,30);

        close=new JButton("Close");
        close.setBounds(60,160,80,30);

        result=new JLabel();
        result.setBounds(80,120,130,30);

        clear=new JButton("clear");
        clear.setBounds(150,160,80,30);

        add(panel);
        panel.add(close);
        panel.add(armstrong);
        panel.add(number);
        panel.add(enterNo);
        panel.add(result);
        panel.add(clear);

        panel.setBackground(Color.CYAN);

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
