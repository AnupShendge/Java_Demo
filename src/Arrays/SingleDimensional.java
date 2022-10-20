package Arrays;

public class SingleDimensional {

	public static void main(String[] args) {
		
		int a[] = new int[5]; // declares an array and allocates the memory for the value
		a[0] =2;
		a[1] =4;
		a[2] =6;
		a[3] =8;
		a[4] =10;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		
		//Another way of creating an array and allocates the memory for the value
		
		/*int b[]= {3,6,9,12,15};
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			
		}*/
		
		

	}

}
