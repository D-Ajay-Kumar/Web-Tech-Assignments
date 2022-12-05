import java.util.Scanner;

public class DivideMultiply {
	public static double division(int num1, int num2) { 
		// if num1 or num2 equals to zero then it throws an arithmetic exception
        if(num1 == 0 || num2 == 0) {
			throw new ArithmeticException("Numbers cannot be zero");
		} else {
		    double result = (double) num1 / num2;
		    return result;
		}
	}
	
	public static int multiply(int num1, int num2) {
		if(num1 == 0 || num2 == 0) {
			throw new ArithmeticException("Numbers cannot be zero");
		} else {
			int result = num1 * num2; 
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
			double divResult = division(num1, num2); 
            System.out.println(divResult);

			double multResult = multiply(num1, num2);
            System.out.println(multResult);
		} catch(ArithmeticException e) {
			System.out.println(e);
		}
	}

}