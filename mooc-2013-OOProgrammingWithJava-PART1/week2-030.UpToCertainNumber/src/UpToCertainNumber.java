
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write your code here
        System.out.println("What is the upper limit?");

        int number = 1;
        int limit = Integer.parseInt(reader.nextLine());

        while (number <= limit){
            System.out.println(number);
            number++;
        }
    }
}
