/** PlayingCard.java
  * CS 110 Sample program to use the Card class
  * dealing cards
  * */

public class PlayingCard
{
  public static void main (String [] args)
  {
    
    Card cardOne, cardTwo;
    
    cardOne = new Card();
    cardTwo = new Card();
    System.out.println("The first card is the: ");
    cardOne.printCard();
    System.out.println("\n The second card is the: ");
    cardTwo.printCard();
    
    if (cardOne.sameFace(cardTwo) || cardOne.sameSuit(cardTwo))
      System.out.print ("\nOn a roll");
    else System.out.print ("\nTrade them in");
  }
}
    