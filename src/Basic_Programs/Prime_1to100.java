package Basic_Programs;

public class Prime_1to100 {

	public static boolean isPrimeNumber(int num) {

		if (num <= 1) {

			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void getPrimeNumbers(int num) {
		for (int i = 2; i <= num; i++) {

			if (isPrimeNumber(i))
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		getPrimeNumbers(7);
		//System.out.println("5 is prime number " + isPrimeNumber(5));
	}

}
