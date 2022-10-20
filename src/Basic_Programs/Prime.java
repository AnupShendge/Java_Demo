package Basic_Programs;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int n,i;
		Scanner s = new Scanner (System.in);
		System.out.println("Enter any number");
		n = s.nextInt();
		
		for(i=2;i<n;i++) {    // Here why we started with i=2 bcz 2 is the lowest prime number

			if(n%2==0) {
				System.out.println("Not a prime");
				break;
			}
		}
		if(n==i) {
			System.out.println("Number is prime");
		}
	}

}
