
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here

        System.out.println("Please enter lower limit:");
        int lowerLimit = Integer.parseInt(reader.nextLine());
        System.out.println("Please enter upper limit:");
        int upperLimit = Integer.parseInt(reader.nextLine());

        while (upperLimit >= lowerLimit){
            System.out.println(lowerLimit);
            lowerLimit++;
        }
    }
}
