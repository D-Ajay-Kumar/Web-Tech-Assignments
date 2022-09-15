import java.util.Scanner;

public class AddTwo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num1, num2, sum;

    num1 = scanner.nextInt();
    num2 = scanner.nextInt();

    // close scanner to avoid resources leak
    scanner.close();

    //calculating the sum of num1 and num2 and
    //storing the result in the variable sum
    sum = num1 + num2;

    //printing the result
    System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
  }
}