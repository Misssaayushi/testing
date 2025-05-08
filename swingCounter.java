import java.awt.*; // using awt container and component classes
import java.awt.event.*; // using awt event classes and listener interfaces
//import javax.swing.*;
// an awt program inherits from the top -level container java.awt.fram
import javax.swing.JFrame;

public class swingCounter extends JFrame {
    private Label label1;  //declare a label component
    private Label label2; 
    private TextField tfCount; //declare a text field compnent
    private Button btnCount; //declare a button compnent
    private int Count=0; //conter's value
    JFrame frame;
    int digit;
    


    //constructor to set-up gui components and event handlers
    public swingCounter()
    {
        setLayout(new FlowLayout());

        //"super" frame,which is a container , sets its layout to flowlayput to arrange
        //the components from left to right , and flow to next row from top to bottom
        label1 = new Label("Table"); //construct the label componet
        add(label1);  //"super" frame container adds label component

        label2=new Label();

        tfCount =new TextField(Count + " ",10);  //construct the label component
        tfCount.setEditable(false);//set to read only
        add(tfCount);//"super " frame container adds textfield componet

        btnCount =new Button("click");
        add(btnCount);
        BtnCountListener listener=new BtnCountListener();
        btnCount.addActionListener(listener);

        //"btnCount" is the source object that fires an actionevent when clicked

        setTitle("Awt Counter");  //"super" frame sets its title
        setSize(300,100); //"super" frame sets its initial size

        setVisible(true); //"super" frame shows
        
    }
//the entry main method
    public static void main(String[] args)
    {
        //invoke the constructor to setup the GUI , by allocating an instance
        swingCounter app=new swingCounter();
        // or simply "new swingCounter();" for an anonymus instance
    }

    //define an inner class to handle the "count" button-click

    private class BtnCountListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            ++Count;
            tfCount.setText(Count + " ");
        }
    }
}
