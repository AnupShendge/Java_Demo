package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// Declaring the ArrayList with initial size n
		ArrayList<Integer> al = new ArrayList<Integer>();

		// Appending new elements at the end of the list
		for (int i = 1; i <= 5; i++)
			al.add(i);

		System.out.println(al);

		// Remove element at index 3
		al.remove(3);

		// Displaying the ArrayList after deletion
		System.out.println(al);

		// Printing elements one by one
		for (int i = 0; i < al.size(); i++)
			System.out.print(al.get(i) + " ");

	}

}
