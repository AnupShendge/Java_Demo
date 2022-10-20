package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {
	
	public static void main(String[] args) {
		printDuplicateCharacters("Practice Makes A Man Perfect");
	
	}
	
	public static void printDuplicateCharacters(String name) {

		Map<Character, Integer> charmap = new HashMap<Character, Integer>();

		char strArr[] = name.toCharArray(); // toCharArray returns the one character array

		for (char c : strArr) {

			if (charmap.containsKey(c)) {
				charmap.put(c, charmap.get(c) + 1);
			} else {
				charmap.put(c, 1);
			}
		}
		
		
		Set<Map.Entry<Character, Integer>> entrySet = charmap.entrySet();
		System.out.println("List of duplicate characters in String--> " + name);
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1)
			{ 
				System.out.println( entry.getKey() + "---->" +  entry.getValue());	
				}
			}
		}
}






	
