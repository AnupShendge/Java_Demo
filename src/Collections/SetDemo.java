package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
// Converting a set into a list
public class SetDemo {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		
		hs.add("Anup");
		
		hs.add("Shendge");
		
		hs.add("1234");
		
		hs.add("1234");
		
		System.out.println(hs);
		
		ArrayList<String> al = new ArrayList<>(hs);
		
		System.out.println(al.get(1));
		
		System.out.println(al);
	}

}
