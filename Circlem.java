/**
 * @(#)Circlem.java
 * @CS 110 Sample Program 
 * @9-10-08
 * @Determines the circumfrence and area of a circle
 * @Using math functions
 */


import java.lang.Math;

public class Circlem 
{
 public static void main (String[] args) 
 {
  
  double area;     //calculated area
  double circum;  //calculated circumference
  double radius;  //radius value
  
  radius = 6.25;
  area = Math.PI * Math.pow(radius,2);
  circum = 2.0 * Math.PI * radius;
  
  System.out.println
      ("The Circumference of a Circle whose radius is " 
       + radius + " is " + circum);
  System.out.println
      ("The Area of a Circle whose radius is " 
       + radius + " is " + area);
 }      
}