//6.1 wrte the program to get the number from the user and print 10 times using for loop.

import java.util.Scanner;
public class forloop
    {
	    public static void main(String args[])
		
		{
		   Scanner scn= new Scanner(System.in);
		   
		   System.out.println("Enter the Number:");
		   Integer Number=scn.nextInt();
		   
		   int i;
		   for (i=1;i<=10;i++)
		   
		   System.out.println("Entered Number: " + Number);
		   
		   scn.close();
			
		   
		   
	    }

			
			
    }