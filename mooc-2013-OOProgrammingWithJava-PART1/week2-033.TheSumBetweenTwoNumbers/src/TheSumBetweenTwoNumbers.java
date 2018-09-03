
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;

        System.out.println("Please enter lower limit");
        int lowerLimit = Integer.parseInt(reader.nextLine());

        System.out.println("Please enter upper limit");
        int upperLimit = Integer.parseInt(reader.nextLine());

        while (upperLimit >= lowerLimit){
            sum = sum + lowerLimit;
            lowerLimit++;
        }
        System.out.println("Sum is " + sum);
    }
}
