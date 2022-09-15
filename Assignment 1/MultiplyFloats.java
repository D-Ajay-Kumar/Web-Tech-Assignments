import java.util.Scanner;

public class MultiplyFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num1, num2;
        float product;

        num1 = scanner.nextFloat();
        num2 = scanner.nextFloat();

        // close scanner to avoid resources leak
        scanner.close();

        product = num1 * num2;

        //printing the result
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);

        // Double check types of values
        System.out.println(num1 + " is of type " + ((Object)num1).getClass().getSimpleName());
        System.out.println(num2 + " is of type " + ((Object)num2).getClass().getSimpleName());
        System.out.println(product + " is of type " + ((Object)product).getClass().getSimpleName());
    }
}