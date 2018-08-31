
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number:");
        int dividend = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number:");
        int divisor = Integer.parseInt(reader.nextLine());

        double quotient = (double) dividend / divisor;

        System.out.println("Division: " + dividend + " / " + divisor + " = " + quotient);
    }
}
