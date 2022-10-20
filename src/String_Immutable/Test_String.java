package String_Immutable;

 // We can use == operators for reference comparison (address comparison)
 // .equals() method for content comparison. 
// In simple words, == checks if both objects point to the same memory location.
   // whereas .equals() evaluates to the comparison of values in the objects.

public class Test_String {

	public static void main(String[] args) {
		
		
		String s1 = "Anup" ;  // it stores in the pool memory generates id s1 =19
		
		String s2 = "Anup" ;  // Same id is stored in s2 = 19
		
		String s3 = new String("Anup") ; // it stores in the heap memory
		
		System.out.println(s1 == s2);   // True
		
		System.out.println(s1 == s3);   // False
		
		System.out.println(s1.equals(s2)); // True
		
		System.out.println(s1.equals(s3)) ;  // True
	
		/*if (s1==s3) {                    // This condition returns False
			System.out.println("True");
		} else {
			System.out.println("False");
		}*/
		
		/*if (s1.equals(s2)) {          // This condition returns True
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}*/
		
		
		
		}

}
