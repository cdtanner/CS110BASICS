//Exceptions3.java
//CS 110 Sample program to demonstrate exceptions

import java.io.*;


public class Exceptions3 
{ 
    public static String readData() throws IOException
    {
 String firstName, lastName;

 BufferedReader console = new BufferedReader (new InputStreamReader(System.in));
 System.out.println("Enter First Name: ");
 firstName = console.readLine();
 System.out.println("Enter Last Name: ");
 lastName = console.readLine();
 return lastName + ", " + firstName;
    }

    public static void main(String []args)            
    {
 String wholeName;
 try
     {wholeName = readData();
     System.out.println("THe name entered was: " + wholeName);
     }
 catch (IOException ex) 
     {System.err.println("error on input");
     ex.printStackTrace();
     System.exit(1);
     }
 System.out.println("that's all folks");
    }
}
  
