/**
 * @(#)BubbleSort.java
 * @CS 110 Sample Program
 * @11-09-08
 * @Demonstrates Bubble Sort algorithms
 */

import java.util.Scanner;
import java.io.*;

public class BubbleSort 
{
    static final int LISTLENGTH = 50;
    
    public static void main (String[] args) throws FileNotFoundException
    { 
     Scanner inFile = new Scanner(new FileReader("BubbleIn.txt"));
     PrintWriter outFile = new PrintWriter("BubbleOut.txt");
     
     int n = 0;
     int[] list = new int[LISTLENGTH];
     
     
     //read in the set of values to be sorted and store in array
     while (inFile.hasNext())
     {
      list[n] = inFile.nextInt();
      n ++;
     }
     
     //sort the set
     bubbleSort (list, LISTLENGTH);
     
     //save the sorted set to a file for use in the future
     for (int i = 0; i < LISTLENGTH; i ++)
     {
       outFile.println(list[i]);
     }
     inFile.close();
     outFile.close();
    }
    
    public static void bubbleSort (int list [], int listLength)
    {
      int temp;
      
      //outer loop for each element in the array
     for (int i = 0; i < LISTLENGTH - 1; i ++)
     {
       //inner loop cycles thru the unsorted segments
      for (int j = 0; j < LISTLENGTH -1 - i; j ++)
      {
        //exchange the values
       if (list[j] > list[j+1])
       {
        temp = list[j];
        list[j] = list[j+1];
        list[j+1] = temp;
       }
      }
     }
    }
}