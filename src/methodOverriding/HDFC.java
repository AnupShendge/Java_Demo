package methodOverriding;

// methodOverriding is also an example of Run Time Polymorphism (Late Binding)

public class HDFC {

	public void homeLoanROI() {

		System.out.println("rate of interest for home loan is 8%");
	}

	static void method() {
		System.out.println("HDFC method");
	}

	final void method1() {
		System.out.println("Final of HDFC");
	}
}
