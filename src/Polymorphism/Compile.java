package Polymorphism;

// We can perfectly overload the static method, but we cant override the static methods

public class Compile {
	
	
	public  void add(int a, int b) {
		
		int c = a + b;
		
		System.out.println(c);
	}
	
	//Below method gives the error because only the return type is different 
	// but method signature also should be different
	
/*	public static void add(int a, int b) {
		
		int e = a + b ;
		
		System.out.println(e);
	}*/
	
	
	public static void add(int a, int b, int c) {
		
		int e = a + b ;
		
		System.out.println(e);
	}
	
	public static void add(int p, int q, int r, int s) {
		
		int t = p + q + r + s;
		
		System.out.println(t);
	}
	
	public double add(int a, int b, double c) {
		
		double d = a + b + c;
		
		return d;
	}
	
	

	public static void main(String[] args) {
		
		Compile c = new Compile();
		
		c.add(1, 2, 3);

		c.add(4, 5, 6, 7);
		
		 c.add(5, 10);
		
		System.out.println("Result of double " + c.add(1, 5, 3.2));

	}

}
