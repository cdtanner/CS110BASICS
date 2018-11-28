/**
 * @(#)TestClassDate.java
 * @CS 110 Sample Program 
 * @10-07-08
 */

import java.util.Scanner;

public class TestClassDate 
{
 static Scanner sc = new Scanner(System.in);
 public static void main (String[] args) 
 {
  Date date1 = new Date(31, 10, 2002);
  Date date2 = new Date(31, 10);
  Date date3 = new Date(31);
  Date date4 = new Date();
    
  int day;
  int month;
  int year;
  String str;
  
  //test "get" method
  day = date1.getDay();
  month = date1.getMonth();
  year = date1.getYear();
  System.out.println("dd/mm/yyyy:  " + day + "/" 
   + month + "/" + year);
     
  //test "printdate" & "printdate2" methods
  System.out.print("date1:");
  date1.printdate();
  System.out.println();
  System.out.print("date1:");
  date1.printdate2();  
  System.out.println();
  System.out.print("The next day of " + date1 + " is " );
  date1.advance();
  date1.printdate();
  System.out.println();
  
  System.out.print("date2:");
  date2.printdate();
  System.out.println();
  System.out.print("date2:");
  date2.printdate2();
  System.out.println();
  
  System.out.print("date3:");
  date3.printdate();
  System.out.println();
  System.out.print("date3:");
  date3.printdate2();
  System.out.println();

  System.out.print("date4:");
  date4.printdate();
  System.out.println();
  System.out.print("date4:");
  date4.printdate2();
  System.out.println();
 
  //test equal method
  if (date1.equals(date2))
   System.out.println("The two dates are equal.");
  else
   System.out.println("The two dates are not equal.");
    
  //test self entered date
  System.out.println("Please enter the day:");
  day = sc.nextInt();
  System.out.println("Please enter the month:");
  month = sc.nextInt();
  System.out.println("Please enter the year:");
  year = sc.nextInt();
  Date tempDate = new Date(day, month, year);
  System.out.print("The date you entered is ");
  tempDate.printdate();
  System.out.println();
  
  //test toString method  
  str = date1.toString();
  System.out.println("Date1 is " + str);  
 }    
}