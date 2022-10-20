package Strings;

import java.util.Scanner;

public class Reverse_String2 {

	public static void main(String[] args) {
		
		Scanner stt = new Scanner(System.in);
		System.out.println("enter a string");
		String s = stt.next();
		String st = revMethod(s);
		System.out.println("Reversed string is " + st  );
		checkPalindrome(st, s);
		
	}
	
	
		
	static String revMethod(String s) {
		
		String rev = "";
		for (int i=s.length()-1; i>=0; i--) {
			
			rev = rev+s.charAt(i);
			
		}
			return rev;
	}
	
	static String checkPalindrome(String st, String s) {
		
		if (st.equals(s)) {
			System.out.println("String is a palindrome");
		}else
			{
			System.out.println("String is a not a palindrome");	
			}
		return s;
	}
		
		
		
		
		
}