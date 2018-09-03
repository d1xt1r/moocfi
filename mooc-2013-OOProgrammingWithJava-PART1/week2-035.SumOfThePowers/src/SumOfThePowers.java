
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int n = Integer.parseInt(reader.nextLine()); // value entered by the user. It will be used as an upper limit.
        int result = 0; // variable to store the final result

        int number = 0; // variable "number" will be used for indexing loop iteration
        while (number <= n){ // until "number" is less than or equal to n (what user have entered) while loop will continue
            int power = (int) Math.pow(2, number); // calculating the power based on the base(2) and the exponent("number")
            result += power; // during the loop "result" is incremented by the value of power on each iteration
            number++; // each time the condition in the while loop brackets is true, "number" will be incremented by 1
        }
        System.out.println("The result is " + result); // printing final result
    }
}
