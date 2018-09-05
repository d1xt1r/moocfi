import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers: ");

        int sum = 0;
        int count = 0;
        double average;
        int evenCounter = 0;
        int oddCounter = 0;

        while (true){
            int number = Integer.parseInt(reader.nextLine());
            if(number == -1){
                break;
            }
            sum = sum + number;
            count++;
            if (number % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }

        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        average = (double) sum / count;
        System.out.println("Average:" + average);
        System.out.println("Even numbers: " + evenCounter);
        System.out.println("Odd numbers: " + oddCounter);
    }
}
