/**
 * @(#)ExamAve.java
 * @CS 110 Sample Program 
 * @8-20-08
 * @Demonstrates interactive input and string input
 * @Calculating exam averages
 */


import java.util.Scanner;

public class ExamAve 
{
 public static void main (String[] args) 
 {
  final int NUMOFEXAMS = 3; //number of exam scores
  int exam1;   //input exam 1 score
  int exam2;   //input exam 2 score
  int exam3;   //input exam 3 score
  double average;   //calculated averge
  String lastName;  //input last name
  String ave2places;

  Scanner sc1 = new Scanner(System.in);

  //input student's name and exam scores
  System.out.println("Enter your name: ");
  lastName = sc1.next();
  System.out.println();
  System.out.println("Enter first exam score: ");
  exam1 = sc1.nextInt();
  System.out.println();
  System.out.println("Enter second exam score: ");
  exam2 = sc1.nextInt();
  System.out.println();
  System.out.println("Enter third exam score: ");
  exam3 = sc1.nextInt();
  
  //calculate the average
  average =(float)(exam1 + exam2 + exam3)/NUMOFEXAMS;
  
  //display the results
  System.out.println();
  System.out.println();
  ave2places = String.format ("%.2f", average);
  System.out.println(lastName + " your average is: " 
       + ave2places); 
    }   
    
}