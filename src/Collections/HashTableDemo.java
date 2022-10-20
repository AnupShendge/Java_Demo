package Collections;

// Refer : https://www.youtube.com/watch?v=7fby_jzPAbg&t=570s
// HashTable is synchronised
// it doesnot allow any null keys and null values
// Inital capacity of HashTable is 11 and Load Factor (LF) is 0.75

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> marks = new Hashtable<>();
		
		marks.put("Anup", 100);
		
		marks.put("Shreyu", 200);
		
		marks.put("Bunty", 300);
		
		marks.put("Vildu", 500);
		
		marks.put("Mohit", 600);
		
		System.out.println(marks.get("Anup"));

	}

}
