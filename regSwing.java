import javax.swing.*;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.*;

public class regSwing extends JFrame
{
    JLabel label1, label2,label3,label4,label5;

    CheckboxGroup box=new CheckboxGroup();
    Checkbox c1,c2,c3;

    Checkbox h1,h2,h3,h4;
    
    JTextField text1,text2;

    JButton button;
  
    public regSwing()
    {
        label1=new JLabel("enter your name");
        label1.setBounds(20,30,100,30);

        text1=new JTextField();
        text1.setBounds(140,30,100,30);

        label2=new JLabel("enter your age");
        label2.setBounds(20,80,100,30);

        text2=new JTextField();
        text2.setBounds(140,80,100,30);

        label3=new JLabel("enter your semester");
        label3.setBounds(20,130,100,30);

        c1=new Checkbox("Ist sem",box,false);
        c1.setBounds(150,130,60,30);

        c2=new Checkbox("IInd sem",box,false);
        c2.setBounds(240,130,60,30);

        c3=new Checkbox("IIIrd sem",box,false);
        c3.setBounds(310,130,60,30);

        label4=new JLabel("select your state");
        label4.setBounds(20,170,100,30);

        String country[]={"select","hyderabad","chennai","bengaluru","mumbai",
        "delhi","rajasthan"};
        JComboBox combo=new JComboBox<>(country);
        combo.setBounds(130,180,90,20);

        label5=new JLabel("select your hobbies");
        label5.setBounds(20,210,100,30);

        h1=new Checkbox("reading");
        h1.setBounds(130,210,80,30);

        h2=new Checkbox("music");
        h2.setBounds(210,210,60,30);

        h3=new Checkbox("journaling");
        h3.setBounds(280,210,80,30);

        h4=new Checkbox("sketching");
        h4.setBounds(370,210,80,30);


        button=new JButton("SUBMIT");
        button.setBounds(50,270,100,30);

        
        add(combo);

        add(label1); add(label2);add(label3);add(label4);add(label5);

        add(text1);add(text2);
        
        add(c1);add(c2);add(c3);

        add(h1);add(h2);add(h3);add(h4);

        add(button);
        
        setLayout(null);
        setSize(600,600);;
        setVisible(true);
        setTitle("registration window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                text1.setText("");
                text2.setText("");

                combo.setSelectedIndex(0);

                h1.setState(false);
                h2.setState(false);
                h3.setState(false);
                h4.setState(false);

                c1.setState(false);
                c2.setState(false);
                c3.setState(false);

                button.setText("Submitted");
            }
        });
    }
    public static void main(String[] args)
    {
        new regSwing();
    }
}
