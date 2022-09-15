public class Main {
    public static void main(String[] args) {
        int num1 = 10, num2 = 3;
        
        double quotient, remainder;
        
        // convert one number to double to get 
        // double as result
        quotient = (double) num1/num2;
        
        remainder = num1 % num2;
        
        //printing the result
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
    }
}