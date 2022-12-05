import java.util.Scanner;

public class AddSubtract {
	public static int add(int num1, int num2) {
        // if numbers are negative then throw arithmetic exception
		if(num1 < 0 || num2 < 0) {
			throw new ArithmeticException("Numbers cannot be negative");
		} else {
			int result = num1 + num2;
			return result;
		}
	}
	
	public static int subtract(int num1, int num2) {
		if(num1 < 0 || num2 < 0) {
			throw new ArithmeticException("Numbers cannot be negative");
		}
		else {
			int result = num1 - num2;
			return result;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

        scanner.close();

		// try catch block to monitor for errors
		try {
			int addResult = add(num1, num2);
            System.out.println(addResult);

			int subResult = subtract(num1, num2);
            System.out.println(subResult);
		} catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}