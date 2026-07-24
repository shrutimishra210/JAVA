//8.1 Write a java program to find ODD and EVEN number(Using command line args).

class u1p8_1 
{
	public static void main(String args[])
	
	{
		 int num = Integer.parseInt(args[0]);
		
		if(num%2==0)
		{
		 System.out.println(num+"is even");
	    }
	     
		else
		{
		 System.out.println(num+"is odd");
	    }
	}
	
}