//9 Write a java program to find out students result/grade using IF condition.

import java.util.Scanner;
  public class u1p9 
{
	public static void main(String args[])
	
	{
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter the GR.NO:");
		int GR=scn.nextInt();
		
		System.out.println("Enter the Name:");
		String Name=scn.nextLine();
		
		System.out.println("Enter the marks of sub1:");
		int sub1=scn.nextInt();
		
		System.out.println("Enter the marks of sub2:");
		int sub2=scn.nextInt();
		
		System.out.println("Enter the marks of sub3:");
		int sub3=scn.nextInt();
		
		System.out.println("Enter the marks of sub4:");
		int sub4=scn.nextInt();
		
		System.out.println("Enter the marks of sub5:");
		int sub5=scn.nextInt();
		
		int total=sub1+sub2+sub3+sub4+sub5;
		int per=total/5;
		
		String result="";
		String grade="";
		
		if(per>=35)
		{
		  result="PASS";
		  if(per>=90)
			  grade="A+";
		  else if(per>=80)
			  grade="A";
		  else if(per>=70)
			  grade="B";
		  else if(per>=60)
			  grade="C";
		  else if(per>=50)
			  grade="D";
		  else
			  grade="F";
			  result="FAIL";
	    }
		
		    System.out.println("\n");
			System.out.println("| student result |");
			System.out.println("| GR.NO |"+ GR);
			System.out.println("| NAME |"+ Name);
			System.out.println("| SUBJECT1 |"+ sub1);
			System.out.println("| SUBJECT2 |"+ sub2);
			System.out.println("| SUBJECT3 |"+ sub3);
			System.out.println("| SUBJECT4 |"+ sub4);
			System.out.println("| SUBJECT5 |"+ sub5);
			System.out.println("| TOTAL MARKS |"+ total);
			System.out.println("| PERCENTAGE |"+ per);
			System.out.println("| GRADE |"+ grade);
			System.out.println("| RESULT |"+ result);
			
			scn.close();
		
		
	}
	
}