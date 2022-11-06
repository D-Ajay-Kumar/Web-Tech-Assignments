import java.util.Scanner;
import java.util.Vector;

class VectorClass{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Size of vector
        int size = scanner.nextInt();

        Vector<Integer> vector = new Vector<Integer>(size + 1);

        // Elements of vector
        for(int i =0;i<=size;i++) {
            int elem = scanner.nextInt();
            vector.addElement(elem);
        }

        scanner.close();

        // Print vector
        for(int i =0; i<=size; i++) {
           System.out.println(vector.elementAt(i));
        }
    }
}