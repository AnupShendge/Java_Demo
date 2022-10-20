package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		// Using linkedhashset
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 4, 5, 8, 7, 4, 9, 8, 4));

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(numbers);

		ArrayList<Integer> numbersListWithoutDuplicates = new ArrayList<Integer>(lhs);

		System.out.println(numbersListWithoutDuplicates);

	}

}

