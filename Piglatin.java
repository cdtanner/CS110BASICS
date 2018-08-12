/**
 * @(#)Piglatern.java
 * @CS 110 Sample Program 
 * @9-4-08
 * @Translate the input to piglatin and display the piglatin
 * @Using string functions of substring and charAT
 */

import java.util.Scanner;

public class Piglatin 
{
 public static void main (String[] args) 
 {
  String word, result;
  
  Scanner sc = new Scanner(System.in);
  
  //Translate the input word to piglatin
  System.out.println("Please enter a word: ");
  word = sc.next();
  result = word.substring(1) + word.charAt(0) + "ay";
  
  System.out.println();
  System.out.println("The translated word would be " + result);   
 }    
}