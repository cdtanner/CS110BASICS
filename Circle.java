/**
 * @(#)Circle.java
 * @CS 110 Sample Program 
 * @8-20-08
 * @Determines the circumference and area of a circle
 */


public class Circle 
{
 public static void main (String[] args) 
 {
    final double PI = 3.14159;  //constant value of Pi
  
    double area;         //calculated area
    double circum;       //calculated circumference
    double radius;       //radius value
  
    radius = 6.25;
    area = PI * radius * radius;
    circum = 2.0 * PI * radius;
  
    System.out.println
      ("The Circumference of a Circle whose radius is " 
       + radius + " is " + circum);
    System.out.println
      ("The Area of a Circle whose radius is " 
       + radius + " is " + area);
 }    
}