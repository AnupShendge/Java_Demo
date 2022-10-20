package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		
		int arr[] = {1, 4, 3, 5, 1, 5} ;
		
		System.out.println("Duplicate elements in given array: ");
		
		 //Searches for duplicate element (METHOD 1)
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i]==arr[j])
					System.out.println(arr[j]);  
				
			}
			
		}
		
	/*	// Method 2 using set
		
		Set<Integer> duplicate = new HashSet<>();
		for (Integer num :arr) {
			if(!duplicate.add(num))
			System.out.println(num);*/
			
		}

	}


