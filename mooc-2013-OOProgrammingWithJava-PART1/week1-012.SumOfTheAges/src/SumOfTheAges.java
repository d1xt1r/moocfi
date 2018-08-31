
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.println("Type your name:");
        String personOneName = reader.nextLine();
        System.out.println("Type your age:");
        int personOneAge = Integer.parseInt(reader.nextLine());

        System.out.println("Type your name:");
        String personTwoName = reader.nextLine();
        System.out.println("Type your age:");
        int personTwoAge = Integer.parseInt(reader.nextLine());

        int sumOfAges = personOneAge + personTwoAge;

        System.out.println(personOneName + " and " + personTwoName + " are " + sumOfAges + " old in total.");

    }
}
