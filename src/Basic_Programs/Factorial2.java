package Basic_Programs;

import java.util.Scanner;

public class Factorial2 {
	
	/*int fact=1;
	
	public void Fac(int n) {
		
		for (int i=1; i<=n; i++) {
			fact = fact*i; // 2
		}
		
		System.out.println("Factorial of a given number is "+ fact);
		
		
	}*/
	
	static int Fac(int n) {
		int fact=1;
		for (int i=1; i<=n; i++) {
			fact = fact*i; // 2
		}
		
		return fact;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a number ");
		int n = s.nextInt();
		int f = Fac(n);
	
		/*Factorial2 fa = new Factorial2();
	
		fa.Fac(3);*/

	}

}
