import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

        System.out.println("Top ten players by goals:");
        System.out.println();
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println();

        System.out.println("Top ten players by penalty amounts:");
        System.out.println();
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println();

        System.out.println("Statistics for Sidney Crosby:");
        System.out.println();
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println();

        System.out.println("Statistics for Philadelphia Flyers:");
        System.out.println();
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        System.out.println();

        System.out.println("Statistics for Anaheim Ducks:");
        System.out.println();
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
        System.out.println();


    }
}
