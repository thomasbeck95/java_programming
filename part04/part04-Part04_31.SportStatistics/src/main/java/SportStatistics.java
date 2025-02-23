import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        int games = 0;
        int win = 0;
        int lose = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = scan.nextLine();
        System.out.println("Team: ");
        String teamName = scan.nextLine();
        try {
            Scanner in = new Scanner(Paths.get(fileName));

            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] parts = line.split(",");
                if (parts[0].equals(teamName) || parts[1].equals(teamName)) {
                    games++;
                    String winner = Game.winner(parts[0], parts[1], parts[2], parts[3]);
                    if (teamName.equals(winner)) {
                        win++;
                    } else {
                        lose++;
                    }
                }
            }
            System.out.println("Games: " + games);
            System.out.println("Wins: " + win);
            System.out.println("Losses: " + lose);
        } catch (Exception e) {
        }
    }

}
