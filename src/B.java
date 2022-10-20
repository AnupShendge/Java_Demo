
public class B extends A {
	
	public void M1() {
		
		System.out.println("Am in m1 method of class B");
		super.M2();  // Using super keyword also can call the super super class method
		//M2();  Method of class can call other inherited method directly by the name
	}
	
	public static void main(String[] args) {
		
		
			B b = new B();
			b.M1();
	}
		
	}


