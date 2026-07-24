//7.1 Write a java program to use IF-ELSEIF-ELSE condition.

import java.util.Scanner;
   public class u1p7_3
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
           
           else if ( Marks < 20)
		   {
		   System.out.println("FAIL!!");			   
		   }	   
		   
		   else
		   {
		   System.out.println("20marks only.");			   
		   }	
		   
		   scn.close();
		   
		   
	   }
	   
	}