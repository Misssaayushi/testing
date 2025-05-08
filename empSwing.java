import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class empSwing extends JFrame {
    JTextField name, sname, points;
    JLabel Lname, Lsname, Lpoints, Lmsg;
    JButton execute, finish;

    public empSwing() {
        setTitle("Employee Selection");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center the window
        setLayout(new GridLayout(5, 2, 10, 10)); // Use GridLayout for better alignment

        // Creating components
        Lname = new JLabel("Enter your name:");
        name = new JTextField();

        Lsname = new JLabel("Enter your surname:");
        sname = new JTextField();

        Lpoints = new JLabel("Enter your points:");
        points = new JTextField();

        execute = new JButton("EXECUTE");
        finish = new JButton("FINISH");

        Lmsg = new JLabel("", SwingConstants.CENTER);

        // Adding components to frame
        add(Lname);
        add(name);
        add(Lsname);
        add(sname);
        add(Lpoints);
        add(points);
        add(execute);
        add(finish);
        add(Lmsg);

        // Execute Button Action
        execute.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                System.out.println("EXECUTE button clicked!");
                try {
                    int n = Integer.parseInt(points.getText());

                    if (n > 500) {
                        Lmsg.setText("Invalid");
                    } else if (n > 100) {
                        Lmsg.setText("Congratulations!! " + name.getText() + " " + sname.getText() + " you're selected");
                    } else if (n > 90) {
                        Lmsg.setText("Near to success");
                    } else if (n > 50) {
                        Lmsg.setText("Try again!");
                    } else {
                        Lmsg.setText("Invalid");
                    }
                } catch (NumberFormatException ex) {
                    Lmsg.setText("Please enter a valid number.");
                }
            }
        });

        // Finish Button Action
        finish.addActionListener(e -> {
            System.out.println("finsih button clicked!");
            Lmsg.setText("");
            name.setText("");
            sname.setText("");
            points.setText("");
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new empSwing();
    }
}
