package Arrays;

import java.util.Scanner;

public class CombineTwoArray {

	public static void main(String[] args) {
		
		System.out.println("First array elements");
		
		int arr1[] = readArr();
		

		System.out.println("Second array elements");
		
		int arr2[] = readArr() ;
		
		int rs[] = Combine(arr1, arr2) ;
		
		System.out.println("After Combine");
		
		disArr(rs);
		
		

	}
	
	static int[] Combine(int a[], int b[]) {
		
		int rs[] = new int[a.length+b.length];
		
		for (int i = 0; i < a.length; i++) {
			rs[i] = a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			rs[a.length+i] = b[i];
		}
		
		return rs ;
		
	}
	static int[] readArr() {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		
		int n = sc.nextInt();
		
		int ar[] = new int[n] ;
		
		System.out.println("Enter " + n + " Elements");
		
		for(int i=0 ; i<n ; i++) {
			
			ar[i] = sc.nextInt();
		}
		
		return ar;
	}
	
	static void disArr(int ar[]) {
		for(int i=0; i<ar.length;i++) {
			System.out.println(ar[i] + " ");
		}
		
		System.out.println();
	}

}
