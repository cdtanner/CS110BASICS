/**
 * @(#)Standard.java
 * @CS 110 Sample Program 
 * @9-4-08
 * @Calculates the Standard Deviation of 5 numbers with formatted output
 */

import java.util.Scanner;
import java.lang.Math;

public class Standard 
{
 public static void main (String[] args) 
 {
  final int N = 5;
  double x1, x2, x3, x4, x5;
  double ave, sum;
  
  Scanner sc = new Scanner(System.in);
  
  //Inputs the five numbers
  System.out.println("This program will help you to ");
  System.out.println("calculate the Standard Deviation ");
  System.out.println("of 5 numbers.");
  System.out.println();
  
  System.out.println("Please enter the first number: ");
  x1 = sc.nextDouble();
  System.out.println();
  System.out.println("Please enter the second number: ");
  x2 = sc.nextDouble();
  System.out.println();
  System.out.println("Please enter the third number: ");
  x3 = sc.nextDouble();
  System.out.println();
  System.out.println("Please enter the forth number: ");
  x4 = sc.nextDouble();
  System.out.println();
  System.out.println("Please enter the fifth number: ");
  x5 = sc.nextDouble();
  
  ave = (x1 + x2 + x3 + x4 + x5)/N;
  sum = (x1 - ave) * (x1 - ave) + (x2 - ave) * (x2 - ave)
   + (x3 - ave) * (x3 - ave) + (x4 - ave) * (x4 - ave)
   + (x5 - ave) * (x5 - ave);
   
  System.out.println();
  System.out.println("The arithmatic average of the 5 numbers ");
  System.out.println("is " + ave); 
  System.out.println();
  System.out.println("The Standard Deviation of the 5 numbers ");
  System.out.println("is " + String.format("%.3f",Math.sqrt(sum/N)));  
 }    
}