import java.util.Scanner;

public class ProductRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        // close scanner to avoid resources leak
        scanner.close();
        
        double quotient, remainder;
        
        // convert one int to double to get 
        // double as result
        quotient = (double) num1/num2;
        
        remainder = num1 % num2;
        
        //printing the result
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
    }
}