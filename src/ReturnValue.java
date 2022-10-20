							/*Return the value from the method*/
public class ReturnValue {

		public static void main(String[] args) {

			ReturnValue r = new ReturnValue();

			int sum = r.add(10, 15);
			System.out.println("Result of sum is"+ sum);

			double sub = r.sub(14.50, 12.50);
			System.out.println("Result of sub is" + sub);
			
		}
		public int add(int a, int b) {

			int c= a+b;

			return c;
		}

		public double sub(double x, double y) {

			double result = x-y;

			return result;
		}
}
