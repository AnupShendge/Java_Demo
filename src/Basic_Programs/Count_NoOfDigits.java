package Basic_Programs;

import java.util.Scanner;

public class Count_NoOfDigits {

	public static void main(String[] args) {
		int count=0, no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		no = sc.nextInt();

		if(no<0) {
			no = no * -1;
		}
		else if(no==0) {
			no =1;
		}
		while(no>0) {

			no = no/10;
			count++;
		}
		System.out.println("Number of digits in a given number is " + count);
	}

}
