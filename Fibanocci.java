import java.util.*;
public class Fibanocci 
{
	public static void main(String[] args) 
	{

        int count = 7, num1 = 0, num2 = 1, sum;
        System.out.println("Fibonacci series is");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");

            
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
