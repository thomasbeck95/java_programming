
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file

        try {
            Scanner in = new Scanner(Paths.get(file));
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] arr = line.split(",");
                String name = arr[0];
                int age = Integer.valueOf(arr[1]);
                Person p = new Person(name, age);
                persons.add(p);
            }
        } catch (Exception e) {
        }
        // and printing the read records
        return persons;

    }
}
