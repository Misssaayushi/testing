import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.event.*;
public class exitSwing extends JFrame implements ActionListener{
   public exitSwing()
    {
         initUI();
    }    

    public final void initUI()
    {
        JPanel panel=new JPanel();
        getContentPane().add(panel);
        setLayout(null);
        panel.setLayout(null);
        
        JButton quiButton=new JButton("quit");
        quiButton.setBounds(50,60,80,30);
        
        quiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event)
            {
                System.exit(0);
            }
        });
        panel.add(quiButton);
        setTitle("quit button");
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        public void run()
        {
            exitSwing ex=new exitSwing(){
                ex.setVisible(true);
            }
        }
    }
}
