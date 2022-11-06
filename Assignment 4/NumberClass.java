import java.util.Scanner;

class Number {
    private double value;

    public Number(double d) {
        value = d;
    }

    public boolean isZero() {
        if (value == 0.0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPositive() {
        if (value > 0.0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNegative() {
        if (value < 0.0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isodd() {
        if (value % 2 != 0.0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEven() {
        if (value % 2 == 0.0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPrime(int n) {
        if (n <= 1)
            return false;

        // Check from 2 to square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isAmstrong() {
        if (value == 0.0) {
            return true;
        } else {
            return false;
        }
    }

    public int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public int getReverse(int num) {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    public double getSqr() {
        double d = value * value;
        return d;
    }

    public double getSqrt() {
        double d = Math.sqrt(value);
        return d;
    }

    public void dispBinary(int n) {
        System.out.println("ByteValue of long_val :" + Integer.toBinaryString(n));
    }

    public int getFactorial(int num) {

        return (num == 1 || num == 0) ? 1 : num * getFactorial(num - 1);

    }
}

class NumberClass {
        public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();

        double value = scanner.nextDouble();

        Number number = new Number(value);

        int num = (int) value;
        System.out.println("isZero " + number.isZero());
        System.out.println("isPositive " + number.isPositive());
        System.out.println("isNegative " + number.isNegative());
        System.out.println("isOdd " + number.isodd());
        System.out.println("isEven " + number.isEven());
        System.out.println("isPrime " + number.isPrime(num));
        System.out.println("getFactorial " + number.getFactorial(num));
        System.out.println("getSqrt " + number.getSqrt());
        System.out.println("getSqr " + number.getSqr());
        System.out.println("sumDigits " + number.sumDigits(num));
        System.out.println("getReverse " + number.getReverse(num));
        number.dispBinary(num);
        System.out.println(" isPrime " + number.isPrime(num));
    }
}