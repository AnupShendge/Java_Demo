package Exception_Handling;

 // Here line number 14 is not printed because in line number 13 we got exception

// And a compiler checks for the corresponding exception

public class AIOB {
	
	public void Array() {
		
		try {
			int a[] = new int[5] ;
			a[6] = 6/2;
			System.out.println("Last Statement of try block");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Accessing array elements outside of the limit");
		}
	}

	public static void main(String[] args) {
		
		AIOB ai = new AIOB() ;
		
		ai.Array(); 

	}

}
