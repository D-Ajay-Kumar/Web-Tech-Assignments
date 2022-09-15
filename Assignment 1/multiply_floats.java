public class Main {
    public static void main(String[] args) {
        // Java converts float to double automatically
        // hence the "f" indicating to keep it float
        float num1 = 10.2f, num2 = 3.23f;
        float product;

        product = num1 * num2;

        //printing the result
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);
    }
}