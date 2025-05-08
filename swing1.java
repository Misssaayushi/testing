import javax.swing.*;
import java.awt.Label;
import java.awt.event.*;

public class swing1 implements ActionListener
{
    JFrame frame;
    JButton button;
    JLabel label;
    swing1()
    {
        frame=new JFrame("IG");
        button=new JButton("follow my Id");
        button.setBounds(100,150,120,30);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.setSize(500,600);
        
        label=new JLabel();
        label.setBounds(100,100,200,40);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);

        // button.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e)
        //     {
        //         button.setText("Following!");
        //         label.setText("you have a new message!!");
        //     }
        // });

        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        button.setText("Following!");
        label.setText("you have a new message!!");
    }
    public static void main(String[] args)
    {
        new swing1();
    }
}