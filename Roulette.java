/**
 * @(#)Roulette.java
 * @CS 110 Sample Program 
 * @9-4-08
 * @Simulate a Roulette play using random method
 * @Calculates the probability of winning in 5000 tries
 */

import java.lang.Math;
import java.util.Scanner;

public class Roulette 
{
 public static void main (String[] args) 
 {
  int x;
  int count = 0;
  double prob;
  
  Scanner sc = new Scanner(System.in);
  
  //Bet on a number between 0 and 37
  System.out.println
   ("Welcome to the Roulette Simulation Program.");
  System.out.println();
  System.out.println
   ("Please bet on a number between 0 and 37: ");
  x = sc.nextInt();
  
  //Calculate the number of times winning in 5000 tries 
  for (int i = 0; i < 5000; i++)
  {
    //generate a random number between 0-37
   double r = Math.random() * 38;
   //is it the one bet on?
   //yes, increment the counter
   if ((int)r == x)
   {
    count++;
   }
  }
  
  //Get the probability of winning
  prob = (double)count/5000;
  
  System.out.println();
  System.out.println
   ("The probability you win a game in 5000 tries");
  System.out.println
   ("would be " + prob);  
 }        
}