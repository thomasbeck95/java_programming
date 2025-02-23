
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers,
        // and lastly the one that tracks the sum of odd numbers!

        Statistics num = new Statistics();
        Statistics numEven = new Statistics();
        Statistics numOdd = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            String value = scanner.nextLine();
            if (value.equals("-1")) {
                break;
            }
            int v = Integer.parseInt(value);
            num.addNumber(v);
            if (v % 2 == 0) {
                numEven.addNumber(v);
            } else {
                numOdd.addNumber(v);
            }
        }
        System.out.println("Sum: " + num.sum());
        System.out.println("Sum of even numbers: " + numEven.sum());
        System.out.println("Sum of odd numbers: " + numOdd.sum());
    }
}
