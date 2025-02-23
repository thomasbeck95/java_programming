
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }
            String[] array = str.split(" ");
            for (String a : array) {
                if (a.contains("av")) {
                    System.out.println(a);
                }
            }
        }
    }
}
