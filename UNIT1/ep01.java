import java.util.Scanner;

public class ep01
{
    public static void main(String[] args)
	{
        Scanner scn = new Scanner(System.in);
       
        System.out.print("Enter a number: ");
        int number = scn.nextInt();
        
        System.out.println("Multiplication table for " + number + ":");
        
        
        for (int i = 1; i <= 10; i++)
		{
           System.out.println(number + " x " + i + " = " + (number * i));
        }
        
        scn.close();
    }
}