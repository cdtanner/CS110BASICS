/**
 * @(#)ExchSrt.java
 * @CS 110 Sample Program
 * @11-09-08
 * @Produces a sample program to illustrate arrays using the exchange sort
 */

import java.util.Scanner;
import java.io.*;

public class ExchSrt 
{
 public static void main (String[] args) throws FileNotFoundException
 {
  Scanner inFile = new Scanner(new FileReader("10integers.txt"));  
  
  int[] list = new int[10];
  int tmp, currentSmallest;
  int count = 0;
  int i, j;
  
  while(inFile.hasNext())
  {
    list[count] = inFile.nextInt();
    count++;
  }
  
  //start exchange sort
  //outer loop cycles thru all elements 
  for (i = 0; i < count - 1; i ++)
  {
    currentSmallest = i;
    //inner loop cycles thru unsorted elements
    //to find the smallest
    for (j = i + 1; j < count; j ++)
    {
      if (list[j] < list[currentSmallest])
        currentSmallest = j;
    }
    tmp = list[i];
    list[i] = list[currentSmallest];
    list[currentSmallest] = tmp;   
  }
  
  for (i = 0; i < count; i ++)
  {
    System.out.println(list[i]);
  }
  inFile.close();
  }
}