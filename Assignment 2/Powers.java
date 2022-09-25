import java.util.Scanner;

public class Powers {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        // close scanner to avoid memory leaks
        scanner.close();

        System.out.println("n    n^2    n^3    n^4");

        for(int i=1; i<=n; i++) {
            System.out.print(i + "    " + Math.pow(i, 2) + "    " + Math.pow(i, 3) + "    " + Math.pow(i, 4));
            System.out.println();
        }
    }
}
