//Exceptions3a.java
//CS 110 Sample program to demonstrate exceptions

import java.io.*;


public class Exceptions3a 
{ 
    public static String readData()  throws IOException
    {
 String firstName, lastName;

 BufferedReader console = new BufferedReader (new InputStreamReader(System.in));
 System.out.println("Enter First Name: ");
 firstName = console.readLine();
 System.out.println("Enter Last Name: ");
 lastName = console.readLine();
 return lastName + ", " + firstName;
    }

    public static void main(String []args) throws IOException
    {
 String wholeName;
 
 wholeName = readData();
 System.out.println("THe name entered was: " + wholeName);
 
    }
}
  
