package Collections;

// The objects that we insert into the HashSet do not guarantee to be inserted in the same order. 
// The objects are inserted based on their hashcode.
// This class also allows the insertion of NULL elements

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Anup");
		
		hs.add("Shendge");
		
		hs.add("1234");
		
		hs.add(null);
		
		hs.add("1234");
		
		for(String s: hs) {
			
			System.out.println(s);
		}
		
		// To remove an element from the hashSet
		hs.remove("1234");
		System.out.println("After removing" + hs);

		// Contains()
		System.out.println(hs.contains("Anup"));
		System.out.println(hs.contains("Anupiii"));
	}

}
