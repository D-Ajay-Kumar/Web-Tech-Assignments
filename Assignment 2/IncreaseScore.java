import java.util.Scanner;

public class IncreaseScore {
    public static void main(String[] args) {
        // var to store score input from user
        double score;
        Scanner scanner = new Scanner(System.in);

        // take input
        score = scanner.nextDouble();

        // close scanner to avoid memory leak
        scanner.close();

        if(score > 80 && score < 90) {
            score += 5;
        }

        System.out.println("Final Score: " + score);
    }   
}
