
 /*Calling non static method with the object*/

public class MethodCall {
	
	int x=90;
	int y=91;

	public static void main(String[] args) {
		
		MethodCall mc = new MethodCall();
		mc.sum();

	}
	
	//non static method
	public void sum() {
		
		int a=10;
		int b=15;
		int c=a+b;
		
		System.out.println("sum of two number is"+c);
	}

}
