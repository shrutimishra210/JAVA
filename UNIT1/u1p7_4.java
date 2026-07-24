//7.4 Write a java program to use IF-IF-ELSE-ELSE condition.

import java.util.Scanner;
   public class u1p7_4
    {
	   public static void main(String args[])
	   {
		   Scanner scn= new Scanner(System.in);
		   
		   System.out.println("Enter the VivaMarks:");
		   int VivaMarks=scn.nextInt();
		   
		    if (VivaMarks >= 40)
	   {

		   System.out.println("Enter the ExamMarks:");
                   int ExamMarks=scn.nextInt();

                   if (ExamMarks>= 40)
		
                 {
                   System.out.println("PASS");
                 }

		   else
		 {
                   System.out.println("FAIL");
                 }

	   }

		else
		{
                System.out.println("Your Viva Marks is LESS! for the eligibility of subjective exam criteria");
                }    		  		   
		   scn.close();
		   
		   
	   }
	   
	}