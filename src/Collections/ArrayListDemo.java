package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		// Stores only string types
		ArrayList<String> al = new ArrayList<>();

		al.add("Anup");

		al.add("Shendge");

		al.add("Bangalore");

		al.add("Anup");

		System.out.println("Before inserting a new element " + al);

		// To insert a new element
		al.add(1, "Prashanth"); // add (index, object)

		System.out.println("After inserting a new element " + al);

		// To change element or replace
		al.set(3, "Sirsi");

		System.out.println("After changing an element " + al);

		// To retreive a specific element
		System.out.println(al.get(1));

		// To Verify the given values present or not
		System.out.println(al.contains("Anup"));    // true
		System.out.println(al.contains("Anupiii")); // false

		System.out.println(al.indexOf("Bangalore"));

		System.out.println(al.size());

		int list = al.size();

		// For each loop
		System.out.println("Triggers the for each loop");

		for (Object obj : al) {

			System.out.println(obj);

		}

		System.out.println();

		// Stores all data types nothing but the heterogenous
		/*
		 * ArrayList<Object> all = new ArrayList<Object>();
		 * 
		 * ArrayList al = new ArrayList(); // This also can be write to store the any data types
		 * 
		 * all.add("Anup"); all.add(123); all.add('A'); all.add(10.33); all.add(true);
		 * 
		 * System.out.println(all);
		 * 
		 * // Remove an element from the above arrayList
		 * 
		 * all.remove("Anup");
		 * 
		 * System.out.println(all);
		 */

		// Using iterator
		System.out.println("Triggers the Iterator loop");
		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println();

		// Just a normal for loop
		System.out.println("Triggers the Normal for loop");
		for (int i = 0; i < list; i++) {

			System.out.println(al.get(i));
		}

	}

}
