package Basic_Programs;

import java.util.Scanner;

public class Fibonacci2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter number of terms of series");
		int n = s.nextInt();
		fib(n);
	}
		
		static int fib(int n) {
			int  first =0, second =1 , next;
			for(int i=0;i<=n;i++) {

				System.out.print(first +" ");

				next = first + second;
				first = second;
				second = next;
			}
			
			return first;
		}

}
