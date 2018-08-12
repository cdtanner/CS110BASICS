/** License.java
  * CS 110 Sample Program
  * uses the Date class 
  * creates a license so to speak
  * */

import java.util.Scanner;

public class License 
{
  public static void main (String [] args)
  {
    
    Scanner sc = new Scanner (System.in);
    
    String last, first, middle;
    Date birthDate, dateExpires;
    char sex;
    int curYear;
    
    System.out.print("enter the current year: ");
    curYear=sc.nextInt();
    sc.nextLine();
    System.out.print ("Enter your first name: ");
    first = sc.nextLine();
    System.out.print ("Enter your middle name: ");
    middle = sc.nextLine();
    System.out.print("Enter your last name: ");
    last = sc.nextLine();
    System.out.print("Enter M for Male, F for Female");
    sex = sc.next().charAt(0);
    sex = Character.toUpperCase(sex);
    
    System.out.print ("Enter your date of birth dd/mm/yyyy");
    birthDate = new Date();
    birthDate.getDate();
    
    dateExpires = new Date(birthDate.getDay(), birthDate.getMonth(),curYear+5);
    
    System.out.println("CS 110 License to Code");
    System.out.println ("Issued to: " + last + ", " + first + " " + middle);
    System.out.println(sex + " Expires: " + dateExpires);
    }
}
