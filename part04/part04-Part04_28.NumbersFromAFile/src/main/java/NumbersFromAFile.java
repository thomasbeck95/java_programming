
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try {
            Scanner in = new Scanner(Paths.get(file));
            while (in.hasNextLine()) {
                int value = Integer.valueOf(in.nextLine());
                list.add(value);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /*
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }; */

        int count = 0;
        for (int num : list) {
            if (num >= lowerBound && num <= upperBound) {
                count++;
            }
        }
        System.out.println("Numbers: " + count);
    }

}
