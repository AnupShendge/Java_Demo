package Constructor_Chaining1;

class Temp {
	Temp() // constructor1
	{
		this(5); // calls constructor 2
		System.out.println("The Default constructor");
	}

	// parameterized constructor 2
	Temp(int x) {
		// calls constructor 3
		this(5, 15);
		System.out.println(x);
	}

	// parameterized constructor 3
	Temp(int x, int y) {
		System.out.println(x * y);
	}

	public static void main(String args[]) {
		// invokes default constructor first
		new Temp();
	}
}
