//7.1 Write a java program to use IF condition.

import java.util.Scanner;
   public class u1p7_1
    {
	   public static void main(String args[])
	   {
		   Scanner scn= new Scanner(System.in);
		   
		   System.out.println("Enter the Marks:");
		   int Marks=scn.nextInt();
		   
		   if (Marks > 20)
		   {
			System.out.println("PASS!");  
		   }   
		   
		   scn.close();
		   
		   
	   }
	   
	}
		  