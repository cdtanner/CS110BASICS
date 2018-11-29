import java.awt.event.*;  
import javax.swing.*;    

public class DemoGUI3
{
  public static void main(String [] args)
  {
  JFrame window = new JFrame("Demo Window");
  JButton button = new JButton("Press Me");
  //setup response text field must be final for action listener
  final JTextField tf = new JTextField();
    
  
  //place button in window
  button.setBounds(100,100,100,100);
  //place textfield in window
  tf.setBounds(100,225,150,100);
  //set window dimensions
  window.setSize(400,500);
  //put the button and text field in the window
  window.add(button);
  window.add(tf);
  //set window properties
  window.setLayout(null);
  window.setVisible(true);
  
  //create and activate actionListener
  button.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {  
    tf.setText("Welcome to GUIS");  
  }  
  });
  }
}