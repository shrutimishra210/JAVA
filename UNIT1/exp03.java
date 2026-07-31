public class exp03
 {
    public static void main(String[] args) 
	{
        int a = 10;
        int b = 20;
        System.out.println("With Temp Variable");
        System.out.println("Before swap: a = " + a + ", b = " + b);
        int temp = a; 
        a = b;        
        b = temp;     
        
        System.out.println("After swap:  a = " + a + ", b = " + b + "\n");
        int x = 50;
        int y = 100;
        System.out.println("Without Temp");
        System.out.println("Before swap: x = " + x + ", y = " + y);
        x = x + y;    
        y = x - y;    
        x = x - y;    
        
        System.out.println("After swap:  x = " + x + ", y = " + y + "\n");

    }
}
