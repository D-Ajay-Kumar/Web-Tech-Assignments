import java.util.Scanner;

class Hailstone {
    // function to print hailstone numbers recursively
    void printHailstone(int input) {
        System.out.print(input + " ");
 
        // when input is already 1
        if (input == 1) {
            return;
        }
        
        // if input is even then divide by 2 and call
        // printHailstone on next number
        else if (input % 2 == 0) {
            printHailstone(input / 2);
        }
        
        // if input is odd then multiply by 3, add 1 and
        // call printHailstone on new number
        else if (input % 2 != 0) {
            printHailstone(3 * input + 1);
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        Hailstone hailstone = new Hailstone();
 
        // Function to generate Hailstone Numbers
        hailstone.printHailstone(input);
    }
}