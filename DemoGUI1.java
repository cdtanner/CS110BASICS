import javax.swing.JOptionPane;

public class DemoGUI1
{
  
  public static double calcArea(double radius)
  {
    return Math.PI * radius * radius;
  }
  
  public static double circumference (double radius)
  {
    return 2 * Math.PI * radius;
  }
  
  public static void main(String [] args)
  {
    double radius;
    double area;
    double circum;
    String message="";
    //allow user to input value of the radius after prompt
    radius = Double.parseDouble(JOptionPane.showInputDialog("enter the radius and press OK"));
    area = calcArea(radius);
    circum = circumference(radius);
    //set window return message
    message = "Radius: " + radius + "\n" + 
      "Area: " + String.format ("%2f",area) + "\n" + 
      "Circumference: " + String.format("%2f",circum);
    //place message in window
    JOptionPane.showMessageDialog(null,message,"Circle operations",JOptionPane.INFORMATION_MESSAGE);
  }
}
    
  