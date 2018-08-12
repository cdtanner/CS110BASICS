import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Wind {
 // constant field values, for setColor function
 private final int BACKGROUND = 1;
 private final int MESSAGE_BACKGROUND = 2;
 private final int MESSAGE_TEXT = 3;
 private final int PROMPT_BACKGROUND = 4;
 private final int PROMPT_TEXT = 5;
 private final int INPUT_BACKGROUND = 6;
 private final int INPUT_TEXT = 7;
 
 // constant color values, for setColor function
 public static final int[] RED = { 255 , 0 , 0 };
 public static final int[] GREEN = { 0 , 255 , 0 };
 public static final int[] BLUE = { 0 , 0 , 255 };
 public static final int[] YELLOW = { 255 , 255 , 0 };
 public static final int[] ORANGE = { 255 , 150 , 0 };
 public static final int[] PURPLE = { 128 , 0 , 128 };
 public static final int[] PINK = { 255 , 20 , 147 };
 public static final int[] GRAY = { 100 , 100 , 100 };
 public static final int[] BLACK = { 0 , 0 , 0 };
 public static final int[] WHITE = { 255 , 255 , 255 };

 
 // interface class
 Twindow tw;

 // constructor
 /** null constructor creates a window of set size/shape<br>
   * pre conditions none<br>
   * post conditions single window created with two output areas<br>
   * labled message and prompt<br>
   * and one input area labeled input
   */
 Wind() {
  tw = new Twindow();
 }

 // Field manipulation methods
 
/** set color of basic background of the window<br>
   * pre-conditions give legal values for background color<br>
   *  valid values are RED, GREEN, BLUE, YELLOW, ORANGE, PURPLE, PINK, GRAY, BLACK, and WHITE<br>
   * post-condition background color is set accordingly<br>
   * responses to abnormal behavior<br>
   * invalid color value given???<br>
   */
 public void setBackgroundColor(int[] color){
  tw.setColor(BACKGROUND, color);
 }
 
 //message
 /** sets string value to be displayed in the window in the lower position<br>
   * pre conditions: valid string expression is given<br>
   * postcondition: expression is displayed in lower part of window centered.<br>
   */
 public void setMessage(String newMessage) {
  tw.setMessage(newMessage);
 }
 
/** set color of basic background of the message area<br>
   * pre-conditions give legal values for color<br>
   *  valid values are RED, GREEN, BLUE, YELLOW, ORANGE, PURPLE, PINK, GRAY, BLACK, and WHITE<br>
   * post-condition background color is set accordingly<br>
   * responses to abnormal behavior<br>
   * invalid color value given???<br>
   */
 public void setMessageBackgroundColor(int[] color) {
  tw.setColor(MESSAGE_BACKGROUND, color);
 }
 
 /** set color of the text of the message<br>
   * pre-conditions give legal values for color<br>
   *  valid values are RED, GREEN, BLUE, YELLOW, ORANGE, PURPLE, PINK, GRAY, BLACK, and WHITE<br>
   * post-condition message text color is set accordingly<br>
   * responses to abnormal behavior<br>
   * invalid color value given???<br>
   */
 public void setMessageTextColor(int[] color) {
  tw.setColor(MESSAGE_TEXT, color);
 }
 
 /** set the text of the message as bold<br>
   * pre-conditions none <br>
   * post-condition message text color is set bold<br>
   */
 public void setMessageTextBold() {
  tw.setBold(MESSAGE_TEXT);
 }
 
 //prompt
 /** sets string value to be displayed as the prompt<br>
   * pre conditions: valid string expression is given<br>
   * postcondition: expression is displayed in upper left hand area of the window<br>
   */
 public void setPrompt(String newProblem) {
  tw.setPrompt(newProblem);
 }

 /** set color of basic background of the prompt area<br>
   * pre-conditions give legal values for color<br>
   *  valid values are RED, GREEN, BLUE, YELLOW, ORANGE, PURPLE, PINK, GRAY, BLACK, and WHITE<br>
   * post-condition background color is set accordingly<br>
   * responses to abnormal behavior<br>
   * invalid color value given???<br>
   */
 public void setPromptBackgroundColor(int[] color) {
  tw.setColor(PROMPT_BACKGROUND, color);
 }
 
 
 /** set color of the text of the prompt<br>
   * pre-conditions give legal values for color<br>
   *  valid values are RED, GREEN, BLUE, YELLOW, ORANGE, PURPLE, PINK, GRAY, BLACK, and WHITE<br>
   * post-condition prompt text color is set accordingly<br>
   * responses to abnormal behavior<br>
   * invalid color value given???<br>
   */
 public void setPromptTextColor(int[] color) {
  tw.setColor(PROMPT_TEXT, color);
 }
 
/** set the text of the message as bold<br>
   * pre-conditions none <br>
   * post-condition message text color is set bold<br>
   */
   public void setPromptTextBold() {
  tw.setBold(PROMPT_TEXT);
 }
 
 //input
   /**flushes (Clears) the input area<br>
     * pre conditions none<br>
     * post conditions area cleared<br>
     */
 public void clearInput() {
   tw.setInput();
 }
 
/** set color of the background of the input area<br>
   * pre-conditions give legal values for color<br>
   *  valid values are RED, GREEN, BLUE, YELLOW, ORANGE, PURPLE, PINK, GRAY, BLACK, and WHITE<br>
   * post-condition background color is set accordingly<br>
   * responses to abnormal behavior<br>
   * invalid color value given???<br>
   */
  public void setInputBackgroundColor(int[] color) {
  tw.setColor(INPUT_BACKGROUND, color);
 }

  /** set color of the text of the input area<br>
   * pre-conditions give legal values for color<br>
   *  valid values are RED, GREEN, BLUE, YELLOW, ORANGE, PURPLE, PINK, GRAY, BLACK, and WHITE<br>
   * post-condition input text color is set accordingly<br>
   * responses to abnormal behavior<br>
   * invalid color value given???<br>
   */
 public void setInputTextColor(int[] color) {
  tw.setColor(INPUT_TEXT, color);
 }
 
 /** set the text of the message as bold<br>
   * pre-conditions none <br>
   * post-condition message text color is set bold<br>
   */
public void setInputTextBold() {
  tw.setBold(INPUT_TEXT);
 }
 
 // Data Retrieval Methods
/**accept input from user as a string<br>
  * pre conditions  data<br>
  * post conditions the data input is returned as a string<br>
  */
public String getInput() {
  return tw.getInput();
 }

/**waits a prespecified amount of time<br>
  * pre conditions: amount of time in seconds to wait<br>
  * post conditions: program waits accordingly<br>
  */
public void wait(int seconds){
  try{
    Thread.sleep(seconds * 1000);
  }
  catch (Exception e) {
    System.out.println("Have Mrs. Tanner yell at Cristin because there is something wrong with her code");
  }
}
 

 private class Twindow extends JFrame {
  // Containers
  Container container;
  
  // Fields
  private JTextField messageField;
  private JTextField promptField;
  private JTextField inputField;

  // variables
  private String inputValue;
  private boolean inputReady;

  // Constructor
  Twindow() {
   //ensure code closing when window is killed
   addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) {
     System.exit(0); // An Exit Listener
    }
   });
   
   //continue setting up frame
   this.setSize(360, 180);
   promptSetup();
   inputSetup();
   messageSetup();
   containerSetup();
   setVisible(true);
  }

  // Field Setup Methods
  private void messageSetup(){
   messageField = new JTextField(25);
   messageField.setHorizontalAlignment(messageField.CENTER);
   messageField.setEditable(false);
  }

  private void promptSetup() {
   promptField = new JTextField(15);
   promptField.setHorizontalAlignment(promptField.CENTER);
   promptField.setEditable(false);
  }

  private void inputSetup() {
   inputField = new JTextField(8);
   inputField.setHorizontalAlignment(inputField.CENTER);
   inputField.setEditable(true);
   inputField.addActionListener(new Listener());
  }
  
  private void containerSetup(){
   container = getContentPane();
   container.setLayout(layoutSetup());
   container.add(promptField);
   container.add(inputField);
   container.add(messageField);
  }
  
  private FlowLayout layoutSetup(){
   FlowLayout flow = new FlowLayout();
   flow.setHgap(10);
   flow.setVgap(35);
   return flow;
  }

  // Field Manipulation Methods
  public void setColor(int target, int[] color){
   switch (target){
   case BACKGROUND : setBackgroundColor(color[0] , color[1] , color[2]);break;
   case MESSAGE_BACKGROUND : setMessageBackgroundColor(color[0] , color[1] , color[2]);break;
   case MESSAGE_TEXT : setMessageTextColor(color[0] , color[1] , color[2]);break;
   case PROMPT_BACKGROUND : setPromptBackgroundColor(color[0] , color[1] , color[2]);break;
   case PROMPT_TEXT : setPromptTextColor(color[0] , color[1] , color[2]);break;
   case INPUT_BACKGROUND : setInputBackgroundColor(color[0] , color[1] , color[2]);break;
   case INPUT_TEXT : setInputTextColor(color[0] , color[1] , color[2]);break;
   }
  }
  
  //toggles bold text
  public void setBold(int target){
   switch (target){
   case MESSAGE_TEXT : messageField.setFont(new Font(messageField.getFont().getName(),
     messageField.getFont().isBold() ? Font.PLAIN : Font.BOLD, messageField.getFont().getSize()));break;
   case PROMPT_TEXT : promptField.setFont(new Font(promptField.getFont().getName(),
     promptField.getFont().isBold() ? Font.PLAIN : Font.BOLD, promptField.getFont().getSize()));break;
   case INPUT_TEXT : inputField.setFont(new Font(inputField.getFont().getName(),
     inputField.getFont().isBold() ? Font.PLAIN : Font.BOLD, inputField.getFont().getSize()));break;
   }
  }
  
  public void setBackgroundColor(int R, int G, int B){
   container.setBackground(new Color(R,G,B));
  }
  
  //message
  public void setMessage(String newMessage) {
   messageField.setText(newMessage);
  }
  
  public void setMessageBackgroundColor(int R, int G, int B) {
   messageField.setBackground(new Color(R, G, B));
  }
  
  public void setMessageTextColor(int R, int G, int B) {
   messageField.setForeground(new Color(R, G, B));
  }
  
  //prompt
  public void setPrompt(String newProblem) {
   promptField.setText(newProblem);
  }
  
  public void setPromptBackgroundColor(int R, int G, int B) {
   promptField.setBackground(new Color(R, G, B));
  }
  
  public void setPromptTextColor(int R, int G, int B) {
   promptField.setForeground(new Color(R, G, B));
  }
  
  //input
  public void setInput() {
   inputField.setText("");
  }
  
  public void setInputTextColor(int R, int G, int B) {
   inputField.setForeground(new Color(R, G, B));
  }
  
  public void setInputBackgroundColor(int R, int G, int B){
   inputField.setBackground(new Color(R,G,B));
  }

  // Data Retrieval Methods
  public String getInput() {
   inputReady = false;
   try{
   while (!inputReady) { Thread.currentThread().sleep(100); }
   }catch(Exception e){ System.out.println("Have Mrs.Tanner yell at Ryan because theres a prompt.");}
   return inputValue;
  }
  
  public void wait(int seconds){
    try{
      Thread.sleep(seconds * 1000);
    }
    catch (Exception e) {
      System.out.println("Have Mrs. Tanner yell at Cristin because there is something wrong with her code");
    }
  }

  // action Listener
  private class Listener implements ActionListener {
  // @Override
   public void actionPerformed(ActionEvent e) {
    inputValue = inputField.getText();
    inputReady = true;
   }
  }
 }
}
