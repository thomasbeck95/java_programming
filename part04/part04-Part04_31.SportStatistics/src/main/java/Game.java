public class Game {
    String team1;
    String team2;
    int t1Points;
    int t2Points;

    public Game(String team1, String team2, int t1Points, int t2Points) {
        this.team1 = team1;
        this.team2 = team2;
        this.t1Points = t1Points;
        this.t2Points = t2Points;
    }

    public static String winner(String team1, String team2, String t1Points, String t2Points) {
        if (Integer.valueOf(t1Points) > Integer.valueOf(t2Points)) {
            return team1;
        } else {
            return team2;
        }
    }

    public static String loser(String team1, String team2, String t1Points, String t2Points) {
        if (Integer.valueOf(t1Points) < Integer.valueOf(t2Points)) {
            return team1;
        } else {
            return team2;
        }
    }

}
