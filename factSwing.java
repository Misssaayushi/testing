import javax.swing.*;
import java.awt.event.*;

class WrongInput extends Exception {
    WrongInput(String msg) {
        super(msg);
    }
}

public class factSwing extends JFrame {

    JLabel jLabel, jLabel2;
    JButton jButton;
    JTextField jTextField;

    public factSwing() {
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        jLabel = new JLabel("Enter a digit:");
        jLabel.setBounds(10, 40, 100, 40);

        jLabel2 = new JLabel("Result");
        jLabel2.setBounds(100, 100, 400, 20);

        jTextField = new JTextField();
        jTextField.setBounds(80, 40, 100, 40);

        jButton = new JButton("Click Me");
        jButton.setBounds(200, 40, 100, 40);

        add(jTextField);
        add(jLabel);
        add(jButton);
        add(jLabel2);

        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                try {
                
                    int n = Integer.parseInt(jTextField.getText());

                
                    if (n < 0) {
                        throw new WrongInput("Enter only valid non-negative digits");
                    }

                
                    double fact = 1;
                    for (int i = n; i > 0; i--) {
                        fact =fact* i;
                    }

                    jLabel2.setText("Factorial: " + fact);
                } 
                catch (NumberFormatException | WrongInput e) {
                    jLabel2.setText("Invalid input! Enter only non-negative numbers.");
                }
            }
        });
    }

    public static void main(String[] args) {
        new factSwing();
    }
}
