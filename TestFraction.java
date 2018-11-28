/**
 * @(#)TestFraction.java
 * @CS 110 Sample Program 
 * @10-07-08
 */

import java.util.Scanner;


public class TestFraction 
{
 static Scanner sc = new Scanner(System.in);
 
 public static void main (String[] args) 
 {
  Fraction f1 = new Fraction(4, 5);
  Fraction f2 = new Fraction(4);
  Fraction f3 = new Fraction();
  Fraction f4 = new Fraction();
  int numerator;
  int denominator;
  int n;
  int d;
  
  numerator = f1.getNumerator();
  denominator = f1.getDenominator();
  System.out.println("The Numerator of Fraction f1 is " 
   + numerator);
  System.out.println("The Denominator of Fraction f1 is " 
   + denominator);
  
  numerator = f2.getNumerator();
  denominator = f2.getDenominator();
  System.out.println("The Numerator of Fraction f2 is " 
   + numerator);
  System.out.println("The Denominator of Fraction f2 is " 
   + denominator);
  System.out.println();
  
  System.out.println("Please enter the fraction a n/d: ");
  f3.inputFraction();
  
  
  System.out.println("Fraction f1 add f3 is " + f1.Add(f3));
  System.out.println("Fraction f1 substract f3 is " + 
   f1.Substract(f3));
  System.out.println("Fraction f1 multiply f3 is " + 
   f1.Multiply(f3));
  System.out.println("Fraction f1 divide f3 is " + 
   f1.Divide(f3));
  
  System.out.println();
  System.out.println("Please enter a new fraction to compare" +
   " with Fraction f1.");
   f4.inputFraction();  
  
  System.out.println();
  if (f1.equals(f4))
  {
   System.out.println("Fraction f1 " + f1 + " is equal to " +
    "Fraction f4 " + f4);
  }
  else
  {
   System.out.println("Fraction f1 " + f1 + 
    " and Fraction f4 " + f4 + " are different");
  }
   System.out.print ("enter the numerator: ");
   n = sc.nextInt();
   f4.setNumerator(n);
   System.out.print ("enter the denominator: ");
   d = sc.nextInt();
   f4.setDenominator(d);
   
   System.out.println ("fraction f4 is now: " + f4);
   
       
 }   
}