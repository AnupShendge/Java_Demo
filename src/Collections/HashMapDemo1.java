package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(2, "Bangalore");
		
		hm.put(1, "Shendge");
		
		hm.put(3, "Anup");
		
		hm.put(2, "Sirsi");
		
		System.out.println(hm);
		
		for(Map.Entry<Integer, String> data : hm.entrySet()) {
			
			System.out.println("Key from map  " + data.getKey() + " Value is " + data.getValue());
			
		}

	}

}
