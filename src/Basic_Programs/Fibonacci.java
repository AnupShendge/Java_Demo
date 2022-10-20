package Basic_Programs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int n , i , first =0, second =1 , next;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number of terms of series");
		n = sc.nextInt();

		for(i=0;i<=n;i++) {

			System.out.print(first +" ");

			next = first + second;
			first = second;
			second = next;
		}

	}

}
