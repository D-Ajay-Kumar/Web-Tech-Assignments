import java.util.Scanner;
import java.util.Arrays;

public class StringSort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Taking string update
        String str = scanner.nextLine();
        scanner.close();

        // change it to char array
        char arr[] = str.toCharArray();

        // apply the sort method to sort the array
        Arrays.sort(arr);

        //Add result to the string 
        str = new String(arr);

        System.out.println(str);
    }
}