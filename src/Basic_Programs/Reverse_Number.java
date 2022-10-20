package Basic_Programs;

import java.util.Scanner;

// Note : Mod(%)--> it gives the last digit of a number Ex : 147%10 = 7
// Note : Divide(/) --> it gives the value part from last digit Ex : 147/10 = 14
public class Reverse_Number {

	public static void main(String[] args) {
		int n, r, d,rev =0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		n = s.nextInt();
		d=n;
		

		while (n>0) {

			r = n%10;  //52%10=2 so r=2,  //5%10=5 so r=5
			rev = rev*10 +r; //0*10+2=2 so rev=2 //2*10+5=25 so rev=25
			n = n/10; //52/10=5 so n=5 //5/10=1 so n=0
		}

		System.out.println("reversed number is " + rev);
		
		if(rev==d) {
			System.out.println("Number is palindrome");
		}
		else
			System.out.println("Number is not palindrome");
	}

	}

