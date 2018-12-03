//Exceptions2.java
//CS 110 sample program to demonstrate exception handling

import java.util.Scanner;

public class Exceptions2
{
    public static void main(String [] args)
    {
 Scanner sc = new Scanner (System.in);
 String numString;
 int num;
 double average;
 int total = 100;
 boolean legal = false;

     System.out.println("enter a number");
     numString = sc.next();
     num = Integer.parseInt(numString);
     if (num == 0) throw new ArithmeticException("");

  while (!legal)
      {   try
     {System.out.println("enter a number");
     numString = sc.next();
     num = Integer.parseInt(numString);
     if (num == 0) throw new ArithmeticException("");
     average = (double)total/num;
     System.out.println (" average = " + average);
            legal = true;
     }
 catch (ArithmeticException ex)
     {average = 0;
     System.out.println("Cant divide by 0");
     System.out.println (ex);
     }
 catch (NumberFormatException ex)
     {System.out.println(ex);
     System.out.println("you must enter a number");
     }
 finally
     {System.out.println("That's all folks!");
     }
      }
    }
}
