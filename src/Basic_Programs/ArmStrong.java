package Basic_Programs;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		int arm=0, a, d, no;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		no = s.nextInt();
		d=no;

		while(no>0) {

			a = no%10;
			arm = arm + a*a*a;
			no = no/10;
			
		}

		if(arm==d) {
			System.out.println("Arm strong number");
		}
		else
		{
			System.out.println("Not arm strong number");
		}

	}

}
