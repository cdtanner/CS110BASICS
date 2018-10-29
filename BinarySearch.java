/**
 * @(#)BinarySearch.java
 * @CS 110 Sample Program
 * @11-09-08
 * @Demonstrates Binary Search Algorithm
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BinarySearch 
{
    public static void main (String[] args) throws FileNotFoundException
    {
     final int LISTLENGTH = 50;
     
     Scanner inFile = new Scanner(new File("BubbleOut.txt"));
     Scanner sc = new Scanner(System.in);
     
     int n = 0;
     int first = 0;
     int last = LISTLENGTH - 1;
     int mid = 0;
     boolean found = false;
     int[] list = new int[LISTLENGTH];
     int searchItem;
     
     System.out.println("Please enter the Integer you want to search:");
     searchItem = sc.nextInt();
     while (inFile.hasNext())
     {
      list[n] = inFile.nextInt();
      n ++;
     }
     
     while (first <= last && !found)
     {
      mid = (first + last)/2;
      if (list[mid] == searchItem)
       found = true;
      else if (list[mid] > searchItem)
       last = mid -1;
      else
       first = mid + 1;
     }
     
     if (found)
     {
      System.out.println("The " + searchItem + " is list[" 
       + mid + "] of this file");
     }
     else
      System.out.println("The " + searchItem 
       + " is not in this list");
     
     inFile.close();
     sc.close();
    }
}