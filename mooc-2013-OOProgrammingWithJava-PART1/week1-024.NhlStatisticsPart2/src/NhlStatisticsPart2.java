
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class NhlStatisticsPart2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");

        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                System.out.println("Top 10 players by points");
                NHLStatistics.sortByPoints();
                NHLStatistics.top(10);

            } else if (command.equals("goals")) {
                System.out.println("Top 10 players by goals");
                NHLStatistics.sortByGoals();
                NHLStatistics.top(10);

            } else if (command.equals("assists")) {
                System.out.println("Top 10 players sorted by assists");
                NHLStatistics.sortByAssists();
                NHLStatistics.top(10);

            } else if (command.equals("penalties")) {
                System.out.println("Top 10 players sorted by penalties");
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);

            } else if (command.equals("player")) {
                // Ask the user first which player's statistics are needed and then print them.
                System.out.println("Which player's statistics you want to view?");
                String playerName = reader.nextLine();
                NHLStatistics.searchByPlayer(playerName);


            } else if (command.equals("club")) {
                // Ask the user first which club's statistics are needed and then print them.
                System.out.println("Which club's statistics you want to view");
                String clubName = reader.nextLine();
                NHLStatistics.sortByPoints();
                NHLStatistics.teamStatistics(clubName);

                // Note: When printing statistics they should be ordered by points (so the players with the most points come first).
            }

        }
    }
}
