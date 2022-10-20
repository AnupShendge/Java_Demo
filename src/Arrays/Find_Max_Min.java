package Arrays;

public class Find_Max_Min {

	public static void main(String[] args) {
		
		
		int[] a = {14, 58, 10, 98, 75} ;
		
		int maxNumber = a[0] ; // 14
		
		int minNumber = a[0] ; // 14
		
		for (int i = 0; i < a.length; i++) {
			if(maxNumber < a[i]) {
				maxNumber = a[i] ; 
			} else if (minNumber > a[i]) {
				minNumber = a[i] ; 
			}
		}
		
		System.out.println("Largest number is :" + maxNumber + " Smallest number is " + minNumber);

	}

}
