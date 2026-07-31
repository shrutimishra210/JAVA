//6.4 wrte the program to get the name from the user and print 10 times using forloop.

import java.util.Scanner;
public class u1p6_4
    {
	    public static void main(String args[])
		
		{
		   Scanner scn= new Scanner(System.in);
		   
		   System.out.println("Enter the Name:");
		   String Name=scn.nextLine();
		   
		    int i;
		   for (i=1;i<=10;i++)
		   
		   System.out.println("Entered Name: " + Name);
		   
		    scn.close();
		   
		   
	    }

			
			
    }
