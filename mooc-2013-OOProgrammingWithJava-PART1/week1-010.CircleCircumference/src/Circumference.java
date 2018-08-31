
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here
        System.out.println("Type the radius:");
        int number = Integer.parseInt(reader.nextLine());

        double radius = 2 * Math.PI * number;

        System.out.print("Circumference of the circle: " + radius);
    }
}
