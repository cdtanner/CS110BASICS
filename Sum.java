/**
 * @(#)Sum.java
 * @CS 110 Sample Program 
 * @8-20-08
 * @Input two integer numbers and print the sum
 */

import java.util.Scanner;

public class Sum 
{
 public static void main (String[] args) 
 {
     int x, y, z;
     Scanner sc1 = new Scanner(System.in);

     System.out.print("Enter the first integer: ");
     x = sc1.nextInt();
     System.out.print("Enter the second integer: ");
     y = sc1.nextInt(); 
     z = x + y;  

     System.out.println();
     System.out.println();
     System.out.println("The sum is: " + z);
 }  
}