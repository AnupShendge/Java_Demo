package Strings;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		
		Scanner stt = new Scanner(System.in);
		System.out.println("enter a string");
		String s = stt.next();
		
		String rev = "";
		for (int i=s.length()-1; i>=0; i--) {
			
			rev = rev+s.charAt(i);
			
		}
		System.out.println("Reversed string is "+rev);
		
		if(s.equals(rev)) {
			System.out.println("String is palindrome");
			
		}
		else
		{
			System.out.println("String is not a palindrome");
		}
		
		/*//Logic 2 : Using character array
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.next();
		String revv = "";
		
		char a[]=str.toCharArray();
		int len = a.length;
		
		for (int i = a.length-1; i>=0; i--) {
			
			revv = revv+a[i];
			
		}
		System.out.println("Reversed string is "+revv);*/
		
		

	}

}
