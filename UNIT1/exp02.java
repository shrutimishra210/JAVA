import java.util.Scanner;

public class exp02
 {
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        System.out.println("AREA OF RECTANGLE");
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double rectangleArea = length * width;
        double rectanglePerimeter = 2 * (length + width);

        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Perimeter of Rectangle: " + rectanglePerimeter);
        System.out.println(); 

        System.out.println("AREA OF CIRCLE");
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        
        double circleArea = 3.14 * radius * radius;
        double circlePerimeter = 2 * 3.14 * radius; 
 
        System.out.format("Area of Circle: %.2f\n", circleArea);
        System.out.format("Perimeter (Circumference) of Circle: %.2f\n", circlePerimeter);

        
        scanner.close();
    }
}
