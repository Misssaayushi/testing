import javax.swing.*;
import java.awt.event.*;

public class swapSwing extends JFrame{
    JLabel label1;
    JLabel label2;
    JButton button;
    JTextField text1;
    JTextField text2;

    public swapSwing(){
        setSize(400,300);
        setLayout(null);
        

        label1=new JLabel("enter first digit");
        label1.setBounds(20,30,100,30);

        text1=new JTextField();
        text1.setBounds(170,30,100,30);

        label2=new JLabel("enter second digit");
        label2.setBounds(20,60,150,30);

        text2=new JTextField();
        text2.setBounds(170,60,100,30);

        button=new JButton("SWAP!");
        button.setBounds(20,100,170,20);

        add(label1);
        add(text1);
        add(label2);
        add(text2);
        add(button);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        button.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    String one=text1.getText();
                    String two=text2.getText();

                    text1.setText(two);
                    text2.setText(one);
                }
            }
        );

    }

   

    public static void main(String[] args)
    {
        new swapSwing();
    }

}
