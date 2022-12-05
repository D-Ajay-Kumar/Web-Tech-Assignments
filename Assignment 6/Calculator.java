import java.util.Scanner;

class CalculatorClass {
    private int num1;
    private int num2;

    public CalculatorClass(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

 	public int add() {
 		int result = num1 + num2;
		return result;
	}
	
	public int subtract() {
		int result = num1 - num2;
		return result;
	}
	
	public double divide() {
		double result = (double) num1 / num2;
		return result;
	}
	
	public int multiply() {
		int result = num1 * num2;
	    return result;
	}
 }

public class Calculator {
	 public static void main(String ar[]) {
		 Scanner scanner = new Scanner(System.in);
		 int num1, num2;

         // try catch block to catch number format exception
		 try {
			 num1 = Integer.parseInt(scanner.nextLine());
			 num2 = Integer.parseInt(scanner.nextLine());
			 
			 CalculatorClass obj1 = new CalculatorClass(num1, num2);
			 int addResult = obj1.add();
             System.out.println(addResult);
			 
			 num1 = Integer.parseInt(scanner.nextLine());
			 num2 = Integer.parseInt(scanner.nextLine());
			 
			 CalculatorClass obj2 = new CalculatorClass(num1, num2);
			 int subResult = obj2.subtract();
             System.out.println(subResult);
			 
			 num1 = Integer.parseInt(scanner.nextLine());
			 num2 = Integer.parseInt(scanner.nextLine());
			 
			 CalculatorClass obj3 = new CalculatorClass(num1, num2);
			 int multResult = obj3.multiply();
             System.out.println(multResult);
			 
			 num1 = Integer.parseInt(scanner.nextLine());
			 num2 = Integer.parseInt(scanner.nextLine());
			 
			 CalculatorClass obj4 = new CalculatorClass(num1, num2);
			 double divResult = obj4.divide();
             System.out.println(divResult);

             scanner.close();
		 } catch(NumberFormatException e) {
			 System.out.println("Non-integral input error " + e);
		 }
	 }
}