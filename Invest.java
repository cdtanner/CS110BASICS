/**
 * @(#)Invest.java
 * @CS 110 Sample Program 
 * @9-4-08
 * @Calculates the interest after you deposit money in Bank
 * @Also demonstrates formatting decimal output
 */

import java.util.Scanner;
import java.lang.Math;

public class Invest 
{
 public static void main (String[] args) 
 {
  double capital, interestEarned, rate;
  int month;
  
  Scanner sc = new Scanner(System.in);
  
  System.out.println
   ("Welcome to the profit calculation program.");
  System.out.println();
  
  System.out.println
   ("Please enter your Capital (in dollars): ");
  capital = sc.nextDouble();
  
  System.out.println();
  System.out.println
   ("Please enter the interest rate per month: ");
  rate = sc.nextDouble();
  
  System.out.println();
  System.out.println
   ("Please enter the number of months you want to ");
  System.out.println
   (" deposit your money: ");
  month = sc.nextInt();
  
  interestEarned = capital * Math.pow(1 + rate*.01, month) - capital;
  
  System.out.println();
  System.out.println
   ("The interest earned on your investment would be " + String.format ("%.2f",interestEarned)); 
    }       
}