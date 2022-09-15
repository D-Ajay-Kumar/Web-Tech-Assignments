import java.util.Scanner;

public class SubtractTwo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // a variable "diff" to store the difference
    int num1, num2, diff;

    num1 = scanner.nextInt();
    num2 = scanner.nextInt();

    // close scanner to avoid resources leak
    scanner.close();

    //calculating the difference of num1 and num2 and
    //storing the result in the variable diff
    diff = num1 - num2;

    //printing the result
    System.out.println("Difference of "+num1+" and "+num2+" is: "+diff);
  }
}