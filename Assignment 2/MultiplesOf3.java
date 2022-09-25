public class MultiplesOf3 {
    public static void main(String[] args) {
        int multiplier = 1;

        // multiply 3 by multiplier (starting from 1)
        // increase the multiplier by 1 each loop
        // do this until multiplier exceeds 12, as per question
        do {
            System.out.print(3*multiplier + " ");
            multiplier += 1;
        } while(multiplier <= 12);
    }
}
