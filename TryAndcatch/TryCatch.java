package TryAndcatch;

public class TryCatch {

	public static void main(String[] args) {
		try {
			System.out.println(divide(20, 5));
			System.out.println(divide(20, 0));
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
	}

	public static double divide(int x, int y) {
		return x / y;
	}

}