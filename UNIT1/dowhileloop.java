//6.3 wrte the program to get the number from the user and print 10 times using dowhile loop.

import java.util.Scanner;
public class dowhileloop
    {
	    public static void main(String args[])
		
		{
		   Scanner scn= new Scanner(System.in);
		   
		   System.out.println("Enter the Number:");
		   int Number=scn.nextInt();
		   
		   int i=1;
		   do
		    { 
		     System.out.println("Entered Number: " + Number);
		     i++;
		     }

                     while(i<=10);
		     
		    scn.close();
		   
		   
	    }

			
			
    }
