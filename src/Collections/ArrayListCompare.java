package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {

		// Sort and then equals
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));

		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("B", "A", "C", "D", "F"));

		Collections.sort(list1);

		Collections.sort(list2);

		System.out.println(list1.equals(list2)); // false

		Collections.sort(list3);

		System.out.println(list1.equals(list3)); // true

		// Compare two lists and find out the additional elements

		ArrayList<String> list4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));

		ArrayList<String> list5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

		list4.removeAll(list5);

		System.out.println(list4);

		// Find out common elements
		ArrayList<String> lng1 = new ArrayList<String>(Arrays.asList("Java", "Selenium", "SQL"));

		ArrayList<String> lng2 = new ArrayList<String>(Arrays.asList("API", "Jenkins", "Java", "Selenium"));

		lng1.retainAll(lng2);

		System.out.println(lng1);

	}

}
