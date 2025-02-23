import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        // TRY
        // Paths getter: Scanner(Paths.get(name.ext))
        // error: I had Scanner.Paths.get rather than Scanner(Paths.get())
        try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }

        // CATCH (Exception e)
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
