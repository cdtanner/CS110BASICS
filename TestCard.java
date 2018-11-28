/**
 * @(#)TestCard.java
 * @CS 110 Sample Program 
 * @10-07-08
 */

import java.util.Scanner;


public class TestCard 
{
 static Scanner sc = new Scanner(System.in);
 
 public static void main (String[] args) 
 {
  Card card1 = new Card();
  Card card2 = new Card(Card.Suits.spades, Card.KING);
  
  int face;
  Card.Suits suit;
  String str;
  
  System.out.println("The random generated card is " + card1);
  
  face = card1.face();
  suit = card1.suit();
  System.out.println("The face of card1 is " + face);
  System.out.println("The suit of card1 is " + suit);
  card1.printcard(); 
  System.out.println();

  System.out.print("The 2nd card: ");
  System.out.println();
  card2.printcard();

  System.out.println();
  if (card1.equals(card2))
   System.out.println("These two cards are equal.");
  else
   System.out.println("These two cards are not equal.");
   
  if (card1.sameSuit(card2))
   System.out.println("These two cards have the same suit.");
  else
   System.out.println("These two cards have different suits.");
   
  if (card1.sameFace(card2))
   System.out.println("These two cards have the same face value.");
  else
   System.out.println("These two cards have different face values.");
   
  System.out.println();
  str = card1.toString();
  System.out.println("Card1 is " + str);  
  card2.setSuit(Card.Suits.hearts);
  card2.setFace(1);
  System.out.println("Card2 is " + card2);
    }    
}