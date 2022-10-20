package methodOverriding;

public class SBI extends HDFC {

	public void homeLoanROI() {

		System.out.println("rate of interest for home loan is 10%");
	}

	static void method() {
		System.out.println("SBI method");
	}

	/*
	 * final void method1() { System.out.println("Final of SBI"); }
	 */

	public static void main(String[] args) {

		HDFC obj = new SBI();

		obj.homeLoanROI();

		obj.method();

	}

}
