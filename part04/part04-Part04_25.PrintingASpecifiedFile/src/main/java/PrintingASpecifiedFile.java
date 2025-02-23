import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its content printed?");

        String fName = scanner.nextLine();
        try (Scanner in = new Scanner(Paths.get(fName))) {
            while (in.hasNextLine()) {
                System.out.println(in.nextLine());
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
