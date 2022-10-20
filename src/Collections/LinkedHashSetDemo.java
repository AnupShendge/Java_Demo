package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

//A LinkedHashSet is very similar to a HashSet.
//The difference is that this uses a doubly linked list to store the data and retains the ordering of the elements.

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		
		hs.add("Anup");
		
		hs.add("Shendge");
		
		hs.add("1234");
		
		hs.add(null);
		
		hs.add("1234");
		
		//System.out.println(hs);
		
		for(String s: hs) {
			
			System.out.println(s);
		}
	}

}
