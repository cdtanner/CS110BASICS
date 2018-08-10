/**
 * @(#)Hello2.java
 * @CS 110 Sample Program 
 * @8-20-08
 * @Demonstrates input and Output for hello program
 */

import java.util.Scanner;

public class Hello2 
{
 public static void main (String[] args) 
 {
     String first, last;
     Scanner sc1 = new Scanner(System.in);
  
     System.out.println("Enter your first name> ");
     first = sc1.nextLine(); 
     System.out.println();
     System.out.println("Enter your last name> ");
     last = sc1.nextLine(); 
     System.out.println();
     System.out.println("Hello " + first + " " + last 
          + ", Enjoy programming.");
    }
    
}