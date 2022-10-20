package Collections;

import java.util.HashMap;

//The elements in the map are indexed using the keys

public class HashMapDemo {

	public static void main(String[] args) {


		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "Anup");
		
		hm.put(2, "Shendge");
		
		hm.put(3, "Sirsi");
		
		hm.put(3, "Bangalore");// Store the latest value if both key are same
		
		hm.put(4, "Anup");   // Value can be duplicate but key must be unique
		
		System.out.println(hm);
		
		hm.remove(4) ;
		
		String value = hm.get(3);
		
		System.out.println("Value for key-3 is " + value);
		
		System.out.println(hm.containsKey(5));
		
		System.out.println(hm);
		
	}

}
