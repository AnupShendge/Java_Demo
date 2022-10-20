package Polymorphism;
//  Refer : https://www.geeksforgeeks.org/different-ways-method-overloading-java/
// below code is the example of Early Binding (Compile Time Ployphormism)
// Compile Time Ployphormism can be achieved through "Method Overloading"

// Return type of method does not matter in case of method overloading, it can be same or different.

// With the different return type is explained in "Compile.java" class

// For Run Time Polymorphism explained in the methodOverriding package

public class CompileTimePoly {
	
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Sum of two numbers is " + c);
	}
	
	public void add(int a, int b, int c) {
		
		int d= a+b+c;
		System.out.println("Sum of three numbers is " + d);
	}

	public static void main(String[] args) {
		
		CompileTimePoly ctp = new CompileTimePoly();
		
		ctp.add(5, 10);
		
		ctp.add(12, 14, 16);



	}

}
