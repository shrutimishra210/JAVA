//2Write a java program to get a name from user and display on screen.

import java.util.Scanner;
   public class UserInput
    {
	   public static void main(String args[])
	   {
		   Scanner scn= new Scanner(System.in);
		   System.out.println("Enter the string:");
		   String UserInputString=scn.nextLine();
		   
		   System.out.println("Enter the integer:");
		   int UserInputInteger=scn.nextInt();
		   
		   scn.close();
		   
		   System.out.println("Entered string: " + UserInputString);
		   System.out.println("Entered integer: " + UserInputInteger);
		   
		   
	   }
	   
	}
		   
    