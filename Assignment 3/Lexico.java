import java.util.Scanner;

public class Lexico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // scanning strings to compare
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        scanner.close();

        int str1_len = str1.length();
        int str2_len = str2.length();

        // Checking for length difference
        if(str1_len > str2_len){
            System.out.println(str1_len - str2_len);
        } else if(str1_len < str2_len){
            System.out.println(str1_len - str2_len);
        } else{
            // Find index where the str1 and str2 differ to return the difference
            for(int i=0; (i<str1_len) && (i<str2_len); i++){
                if((int)str1.charAt(i) == (int)str2.charAt(i)) {
                    continue;
                } else {
                    System.out.println((int)str1.charAt(i) - (int)str2.charAt(i));
                    break;
                }
            }
        }
    }
}