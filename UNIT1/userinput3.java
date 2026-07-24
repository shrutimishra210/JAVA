//3 Write a java program to get personal information from user and display on screen.*/

import java.util.Scanner;
   public class userinput3
    {
	   public static void main(String args[])
	   {
		   Scanner scn= new Scanner(System.in);

		   System.out.print("Enter the Name:");
		   String Name=scn.nextLine();
		   
		   System.out.print("Enter the Age:");
		   String Age=scn.nextLine();
		   
		   System.out.print("Enter the Mobileno:");
		   String Mobileno=scn.nextLine();
		   
		   System.out.print("Enter the Email:");
		   String Email=scn.nextLine();
		   
		   System.out.print("Enter the City:");
		   String City=scn.nextLine();
		   
		   scn.close();
		   
		   
		   System.out.println("Entered Name: " + Name);
		   System.out.println("Entered Age: " + Age);
		   System.out.println("Entered Mobileno: " + Mobileno);
		   System.out.println("Entered Email: " + Email);
		   System.out.println("Entered City: " + City);
		   
	       	   
	
		   
		   
	   }
	   
	}
