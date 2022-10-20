					/*Passing parameters from the method*/
 public class PassParam {


	public static void main(String[] args) {

		PassParam p = new PassParam();

		p.add(10, 15);

		p.sub(14.50, 12.50);
		
	}
	public void add(int a, int b) {

		int c= a+b;

		System.out.println("result is"+c);
	}

	public void sub(double x, double y) {

		double result = x-y;

		System.out.println("result is"+result);
	}

}
