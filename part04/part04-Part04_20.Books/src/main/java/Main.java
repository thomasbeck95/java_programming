import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // implement here the program that allows the user to enter
        // book information and to examine them

        // state
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = in.nextLine();

            if (title.equals("")) {
                break;
            }
            System.out.print("Pages: ");
            String pages = in.nextLine();
            int pageNum = Integer.valueOf(pages);
            System.out.print("Publication year: ");
            String year = in.nextLine();
            int yearNum = Integer.valueOf(year);

            Book book = new Book(title, pageNum, yearNum);
            books.add(book);
        }

        System.out.print("What information will be printed? ");
        String option = in.nextLine();

        if (option.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (option.equals("name")) {
            for (Book book : books) {
                System.out.print(book.title);
            }
        }
    }
}
