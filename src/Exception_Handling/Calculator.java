package Exception_Handling;

import java.util.Scanner;

public class Calculator {
	
	
	public void Divide(int a, int b) {
		
		try {
			double result = a/b; 
			System.out.println("Division result is " + result);
		}
		
		catch(ArithmeticException  ae) {
			System.out.println("Enter a second number which is greater than 0");
		}
		
		catch(NullPointerException e) {
			
			System.out.println("This null pointer exception is not occured here as above catches the Airthematic Exception");
		}
		
		}
	
	public void Display() {
		System.out.println("Display method is printed because exception is caught in catch block");
	}

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		Scanner s = new Scanner(System.in) ;
		
		System.out.println("Enter a first number");
		int a = s.nextInt();
		
		System.out.println("Enter a second number");
		int b = s.nextInt();
		
		c.Divide(a, b);
		
		c.Display();
		

	}

}
