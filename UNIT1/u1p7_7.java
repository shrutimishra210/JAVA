//7.7 Write a java program to use SWITCH CASE condition.

import java.util.Scanner;
   public class u1p7_7
    {
	   public static void main(String args[])
	   {
		   Scanner scn= new Scanner(System.in);
		   
		   System.out.println("Enter the number of colour:");
		   int colour=scn.nextInt();
                   
		   switch (colour)
                   {
		   case 1:
			System.out.println("VOILET");  
		   break;
		   
		   case 2:
			System.out.println("INDIGO");  
		   break;
		   
		   case 3:
			System.out.println("BLACK");  
		   break;
		   
		   case 4:
			System.out.println("GREEN");  
		   break;
		   
		   case 5:
			System.out.println("YELLOW");  
		   break;
		   
		   case 6:
			System.out.println("ORANGE");  
		   break;
		   
		   case 7:
			System.out.println("RED");  
		   break;
		   
		   default:
			System.out.println("wrong colour!");  
		   }		   
		   scn.close();
		   
		   
	   }
	   
	}