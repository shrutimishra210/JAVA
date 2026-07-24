//8.2 Write a java program to find ODD and EVEN number.

import java.util.Scanner;
  public class u1p8_2 
{
	public static void main(String args[])
	
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int Number=scn.nextInt();
		
		if(Number%2==0)
		{
		 System.out.println(Number+"is even");
	    }
	     
		else
		{
		 System.out.println(Number+"is odd");
	    }
	}
	
}
