import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int num1, num2;
		Scanner s= new Scanner(System.in);
		System.out.println("enter 2 numbers");
		num1= s.nextInt();
		num2= s.nextInt();
		System.out.println("Enter operator :");
		char operator= s.next().charAt(0);
		int result;
		switch(operator)
		{ 
		case '+':result= num1 + num2;
		          break;
		case '-': result=num1 - num2;
                  break;
		case '*':result= num1 * num2;
                  break;
		case '/': result=num1/num2;
        break;
		default: 
			System.out.print("entered operator is incorrect ");
			return;
		}
		System.out.print("result is :"+ result);
	}

}
