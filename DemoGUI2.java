import javax.swing.JFrame;
import javax.swing.JButton;

public class DemoGUI2
{
  public static void main(String [] args)
  {
    JFrame window = new JFrame("Demo Window");
    JButton button = new JButton("OK");
    //set dimensions of window
    window.setSize(400,500);
    //place and size button
    button.setBounds(180,245,80,80);
    //put button in window
    window.add(button);
    //set window properties
    window.setLayout(null);
    window.setVisible(true);
  }
}
      