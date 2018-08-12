/**
 * @(#)Rectangle.java
 * @CS 110 Sample Program 
 * @8-20-08
 * @Determines the area and perimeter of a rectangle
 * @ whose height is 6 and length is 5
 */


public class Rectangle 
{

 public static void main (String[] args) 
 {
  int length;     //length of the rectangle
  int height;     //height of the rectangle
  int area;       //calculated area
  int perimeter;  //calculated perimeter
  
  height = 3;
  length = 4;
  area = height * length;
  perimeter = 2 * height + 2 * length;
  
  System.out.println(" AREA = " + area);
  System.out.println (" PERIMETER = " + perimeter);
 }   
    
}