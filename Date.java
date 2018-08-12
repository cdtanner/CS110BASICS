
import java.util.Scanner;
/**
 * Date.java
 * CS 110 Sample Class
 * models a date mm/dd/yyyy
 */
public class Date
{

    private  int day;     //Date's day
    private  int month;   //Date's month
    private  int year;    //Date's year

    //constructors
    /**preconditions  m/d/y is a valid date (does no validation checks!)<br>
       postconditions Date to day => d, month => m and year => y <BR>
       repsonses -- if invalid date the erroronous data is simply passed on
       @param d -- the day 
       @param m -- the month
       @param y -- the year*/
    public Date (int d, int m, int y)   
    {
     day = d;
     month = m;
     year = y;
    }
  
    /**precondition m/d is valid<BR>
       postconditions day=d, month=m, year => 2000<BR>
       repsonses erroronous data passed on
       @param d -- the day
       @param m -- the month*/

    public Date (int d, int m)
    {
     day = d;
     month = m;
     year = 2000;
    }

    /**preconditions d is valid<br>
       postconditions day=d, year => 2000, month => 12<br>
       responses erroronous data passed on<br>
       @param d -- the day*/
    public Date (int d)
    {
     day = d;
     month = 12;
     year = 2000;
    }
    /**null constructor <br>
       preconditions none<br>
       postcondtitions -- initializes date to 31/12/2000*/
    public Date ()
    {
     day = 31;
     month = 12;
     year = 2000;
    }

    //mutators
    /**function to change the day to next day<br>
      * pre-conditions: none<br>
      * post-conditions: date is advanced by 1 day*/
    public void advance ()
    {
      day ++;      //advance one day
      switch (month)
      {
        case 1: case 3: case 5: case 7: case 8: case 10:
          //Jan, mar, may. july, aug, oct => 31 days
          if (day == 32)
          {
             day = 1;
             month++;
          }break;
        case 12:
          // december must change year as well
          if (day == 32)
          {
             day = 1;
             month = 1;
             year ++;
           }break;
        case 4: case 6: case 9: case 11:
          //apr, june, sept, nov => 30 days
          if (day == 31)
          {
            day =1;
            month++;
          }break;
        case 2:
          //Feb. leap year question
          if (day > 29 || day == 29 && 
              (year % 4 > 0  || year % 100 == 0) && year % 400 > 0)
          {
            day = 1;
            month = 3;
          }break;
      }
    }
   /** Allows data tot be input from the keyboard in mm/dd/yyyy format<br>
     * pre-conditions: user enters valid date<br>
     * post-conditions: Date reciveing the message is set to user input values<br>
     * repsonses: erronous data sent on*/ 
    public void getDate()
    {
      
      String inputDate;
      String dateParts[]= new String [3];
      
      int s,t;
      
      Scanner sc=new Scanner(System.in);
      inputDate = sc.next();
      dateParts = inputDate.split("/");
      day = Integer.parseInt(dateParts[0]);
      month =Integer.parseInt(dateParts[1]);
      year = Integer.parseInt(dateParts[2]);
      
    }
                               

    //accessors
    /** returns day of this date<br>
      * pre-conditions: none<br>
      * post-conditions: none object remains unchanged
      * @return day value*/
    public int getDay () 
    {
     
      return day;
    }

     /** returns month of this date<br>
      * pre-conditions: none<br>
      * post-conditions: none object remains unchanged
      * @return month value*/
    public int getMonth ()
    {
      return month;
    }

     /** returns year of this date
      * pre-conditions: none<br>
      * post-conditions: none object remains unchanged
      * @return year value*/
    public int getYear ()
    {
      return year;
    }

    //functions to print date
    /** displays date in mm/dd/yyyy format<br>
      * pre-conditions none<br>
      * post-conditions: the value of the date in mm/dd/yyyy format is displayed*/
    public void printdate()
    {
     System.out.print (month + "/" + day + "/" + year);
    }

    /** Displays date as month day, year format<br>
      * pre-conditions none<br>
      * post-conditions: the value of the date in month, day year format is displayed*/
    public void printdate2()
    {
      switch (month)
     {
      case 1:
        System.out.print ("January ");
        break;
      case 2:
        System.out.print ("Febuary ");
        break;
      case 3:
        System.out.print ("March ");
        break;
      case 4:
        System.out.print ("April ");
        break;
      case 5:
        System.out.print ("May ");
        break;
      case 6:
        System.out.print ("June ");
        break;
      case 7:
        System.out.print ("July ");
        break;
      case 8:
        System.out.print ("August ");
        break;
      case 9:
        System.out.print ("September ");
        break;
      case 10:
        System.out.print ("October ");
        break;
      case 11:
        System.out.print ("November ");
        break;
      case 12:
        System.out.print ("December ");
        break;
      }  
      System.out.print (day + ", " + year);
    }


    /**function to test equality<br>
      * pre-condition: d1 a valid date<br>
      * post-condtition: object reieveing the message remains unchanged<br>
      * responses: error terminate
      * @param d1 valid date to be compared with object recieving the message
      * @return True if dates are equal, false if they represent different dates*/
    public boolean equals(Date d1)
    {
     return ( day == ((Date)d1).day &&
       month == ((Date)d1).month &&
       year == ((Date)d1).year);
    }

    /**method to return the date as a string<br>
      * pre-condition none<br>
      * post-condition nonthe object remains unchanged
      * @return the string vlaue of mm/dd/yyy*/
    public String toString()
    {
     return day + "/" + month + "/" + year;
    }
}




