/** OneProblem.java
  * Sample CS 110 program
  * uses Problem class and Wind classto display a problem and accept users 
  * answer*/

import java.util.Scanner;

public class OneProblem
{
  public static void main (String [] args)
  {
    Problem aProb = new Problem();
    Wind flashCard = new Wind();
    
    int ans;
    
    //Set color of various window components
   flashCard.setBackgroundColor(Wind.GREEN);
   flashCard.setPromptBackgroundColor(Wind.BLUE);
   flashCard.setPromptTextColor(Wind.YELLOW);
   flashCard.setInputBackgroundColor(Wind.BLUE);
   flashCard.setInputTextColor(Wind.YELLOW);
   flashCard.setMessageBackgroundColor(Wind.YELLOW);
   flashCard.setMessageTextColor(Wind.BLUE);
   
   //set message to bold
   flashCard.setMessageTextBold();
   
   
   flashCard.setPrompt(aProb.displayProblem());
   ans = Integer.parseInt(flashCard.getInput());
   if (ans == aProb.correctAnswer())
      flashCard.setMessage("great you got it right");
    else
      flashCard.setMessage("sorry your answer is incorrect, try again");
  }
}

    