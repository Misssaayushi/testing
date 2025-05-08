import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;


public class admissionSwing extends JFrame {
    JButton ad;
    JButton fee;
    JButton close;
    JPanel adPanel,feePanel;

    JLabel name, age,sem,state,hobby;

    CheckboxGroup box=new CheckboxGroup();
    Checkbox c1,c2,c3;

    Checkbox h1,h2,h3,h4;
    
    JTextField text1,text2;

    JButton button;

    public admissionSwing()
    {
        setLayout(null);
        setVisible(true);
        setSize(700,700);
        setTitle("MLSU");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.darkGray);

        ad=new JButton("admission");
        ad.setBounds(30,20,100,30);

        close=new JButton("close");
        close.setBounds(260,20,100,30);

        add(ad);
        add(close);

        adPanel=new JPanel();
        adPanel.setLayout(null);
        adPanel.setBounds(30,80,500,500);
        adPanel.setBackground(Color.pink);
        adPanel.setVisible(false);
        add(adPanel);

        feePanel=new JPanel();
        feePanel.setLayout(null);
        feePanel.setBounds(30,80,500,500);
        feePanel.setBackground(Color.orange);
        feePanel.setVisible(false);
        add(feePanel);

        ad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                adPanel.setVisible(true);
                admission();
                revalidate();
                repaint();
            }
        });
        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });

        
    }

    public void admission()
    {
        name=new JLabel("enter your name");
        name.setBounds(20,30,100,30);

        text1=new JTextField();
        text1.setBounds(140,30,100,30);

        age=new JLabel("enter your age");
        age.setBounds(20,80,100,30);

        text2=new JTextField();
        text2.setBounds(140,80,100,30);

        sem=new JLabel("enter your semester");
        sem.setBounds(20,130,100,30);

        c1=new Checkbox("Ist sem",box,false);
        c1.setBounds(150,130,60,30);

        c2=new Checkbox("IInd sem",box,false);
        c2.setBounds(240,130,60,30);

        c3=new Checkbox("IIIrd sem",box,false);
        c3.setBounds(310,130,60,30);

        state=new JLabel("select your state");
        state.setBounds(20,170,100,30);

        String country[]={"select","hyderabad","chennai","bengaluru","mumbai","delhi","rajasthan"};
        JComboBox combo=new JComboBox<>(country);
        combo.setBounds(130,180,90,20);

        hobby=new JLabel("select your hobbies");
        hobby.setBounds(20,210,100,30);

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

        fee=new JButton("calculate Fees");
        fee.setBounds(170,270,200,30);
        
        adPanel.add(combo);

        adPanel.add(name); adPanel.add(age);adPanel.add(sem);adPanel.add(state);adPanel.add(hobby);

        adPanel.add(text1);adPanel.add(text2);
        
        adPanel.add(c1);adPanel.add(c2);adPanel.add(c3);

        adPanel.add(h1);adPanel.add(h2);adPanel.add(h3);adPanel.add(h4);

        adPanel.add(button);

        adPanel.add(fee);

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

                box.setSelectedCheckbox(null);

                button.setText("Submitted");
            }
        });

        fee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                feePanel.setVisible(true);
                adPanel.setVisible(false);
                admission();
                revalidate();
                repaint();
            }
        });
              
    }


    

    public static void main(String[] args)
    {
        new admissionSwing();
    }
}
