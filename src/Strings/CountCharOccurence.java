package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Written below program using link : https://www.youtube.com/watch?v=3mz_3UBlK0c
public class CountCharOccurence {

	public static void main(String[] args) {
		getCharCount("Practice Makes A Man Perfect");
	
	}

	public static void getCharCount(String name) {

		Map<Character, Integer> charmap = new HashMap<Character, Integer>();

		char strArr[] = name.toCharArray(); // toCharArray returns the one character array

		for (char c : strArr) {

			if (charmap.containsKey(c)) {
				charmap.put(c, charmap.get(c) + 1);
			} else {
				charmap.put(c, 1);
			}
		}

		System.out.println(name + " : " + charmap);

	}
}
/*
 * String st ="anup p" ;
 * 
 * int c[] = new int[129] ;
 * 
 * for(int i=0; i<st.length(); i++) {
 * 
 * c[st.charAt(i)]++;
 * 
 * }
 * 
 * for(int i=0; i<c.length; i++) {
 * 
 * if(c[i]!=0) System.out.println((char)i + "--->" + c[i]); }
 */
