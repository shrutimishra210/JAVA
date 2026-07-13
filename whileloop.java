//6.2 wrte the program to get the number from the user and print 10 times using whileloop.

import java.util.Scanner;
public class whileloop
    {
	    public static void main(String args[])
		
		{
		   Scanner scn= new Scanner(System.in);
		   
		   System.out.println("Enter the Integer:");
		   int  Userinteger=scn.nextInt();
		   
		   		    
			   
		     System.out.println("Entered Integer: " + Userinteger);
		      int i=1;
		     while(i<=10)
               
		     {
                          System.out.println(Userinteger);
			  i++;
                     }
			 
		    
		   
		     scn.close();
		   
		   
	    }

			
			
    }