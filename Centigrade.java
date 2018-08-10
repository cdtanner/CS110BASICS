/**
 * @(#)Centigrade.java
 * @CS 110 Sample Program 
 * @8-20-08
 * @Demonstrates interactive input
 * @Calculates farenheit temperature from Centigrade
 */

import java.util.*;

public class Centigrade 
{
 public static void main (String[] args) 
 {
  double cent;
  double farenheit;
    
  Scanner sc = new Scanner(System.in);

  System.out.println
    ("Enter the Centigrade temperature to be converted");
  cent = sc.nextDouble(); 
  farenheit = 1.8 * cent + 32.0;
  
  System.out.println();
  System.out.println();
  System.out.println("The Farenheit Equivalent is: " 
       + farenheit);  
    }     
}