public class Main {
    public static void main(String[] args) {
        int num1 = 13, num2 = 38, temp;
        
        System.out.println("Before Swapping:");
        System.out.println("Num1: " + num1 + " Num2: " + num2);
        
        // store num2 in temp
        temp = num2;
        
        // change num2 to num1
        num2 = num1;
        
        // replace num1 with temp which has num2
        num1 = temp;
        
        System.out.println("After Swapping:");
        System.out.println("Num1: " + num1 + " Num2: " + num2);
    }
}