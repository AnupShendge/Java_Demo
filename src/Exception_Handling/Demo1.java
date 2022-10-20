package Exception_Handling;

//By executing this below program we got a ArrayIndexOutOfBoundsException

// We are trying to access the 6th element of array in below program but the array size is only 5.

// This ArrayIndexOutOfBoundsException is handled in "AIOB.java" class
public class Demo1 {
	
	public void Array() {
		
		
		int a[] = new int[5];
		
		a[6] =6/2;
		
	}
	
	
	public static void main(String[] args) {
		
		
		Demo1 de = new Demo1 () ;
		
		de.Array();

		System.out.println("Due to exception occur in above step so this line wont be executed");
	}

}
