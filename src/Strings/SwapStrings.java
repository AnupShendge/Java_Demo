package Strings;

import java.util.Scanner;

public class SwapStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first string");
		
		String a = sc.nextLine();
		
		System.out.println("Enter the second string");
		
		String b = sc.nextLine();
		
		a = a + b; // anupshendge
		
		b = a.substring(0, a.length()-b.length());
		
		a = a.substring(b.length());
		
		System.out.println("After swapping values are");
		
		System.out.println("First string is " + a);
		
		System.out.println("Second string is  " + b);

			
	}

}
