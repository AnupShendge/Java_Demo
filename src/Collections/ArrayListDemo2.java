package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		// How To convert Arrays into ArrayList

		String arr[] = { "anup", "prashant", "shendge" };

		for (String str : arr) {

			System.out.println(str); // anup
									//	prashant
									//	shendge

		}

		ArrayList al = new ArrayList(Arrays.asList(arr));

		System.out.println(al); // [anup, prashant, shendge]

	}

}



