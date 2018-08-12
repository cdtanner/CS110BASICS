/**UseWind.java
  * CS110 sample program to use the Wind class to manipulate 
  * graphics windows. Class Wind written by Ryan Knost
  * Spring 2011
  */

 public class UseWind
 {
  public static void main(String [] args)
  {
   String name;
   
   //declare/create the window by invoking the constructor
   Wind testWindow = new Wind();
   
   //Set color of various window components
   testWindow.setBackgroundColor(Wind.RED);
   testWindow.setPromptBackgroundColor(Wind.BLUE);
   testWindow.setPromptTextColor(Wind.YELLOW);
   testWindow.setMessageBackgroundColor(Wind.YELLOW);
   testWindow.setMessageTextColor(Wind.BLUE);
   
   //display a prompt in the window
   testWindow.setPrompt("Hi Who's This?");
   
   //accept input from the window
   name = testWindow.getInput();
   
   //display output at the bottom of the window
   testWindow.setMessage("Welcome to CS 110 Graphics " + name + "!");
   testWindow.setMessage("Welcome to CS 110 Graphics " + "!");
   
 }
 }