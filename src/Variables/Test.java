package Variables;

// To know about Variables refer : https://www.geeksforgeeks.org/variable-scope-in-java/
public class Test {

	static int x = 11;
	private int y = 33;

	public void method1(int x) {
		Test t = new Test();
		this.x = 22;
		y = 44;

		// Static int z= 20; Static local variables are not allowed

		System.out.println("Test.x: " + Test.x);
		System.out.println("t.x: " + t.x);
		System.out.println("t.y: " + t.y);
		System.out.println("y: " + y);
	}

	public static void main(String args[]) {
		Test t = new Test();
		t.method1(5);

	}

}
