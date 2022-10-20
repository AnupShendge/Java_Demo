package Basic_Programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int temp=0,a,d, num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		num = s.nextInt();
		d=num;

		while(num>0) {

			a = num%10;
			temp = temp*10+a;
			num = num/10;
			
		}

		if(temp==d) {
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not palindrome number");
		}
	}

}
