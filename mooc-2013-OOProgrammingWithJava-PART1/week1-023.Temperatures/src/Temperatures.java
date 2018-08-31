
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.

        while(true){
            System.out.println("Please enter temperature between -30.0 and +40.0");
            double temperature = Double.parseDouble(reader.nextLine());

            if(temperature >= -30 && temperature <= 40){
                Graph.addNumber(temperature);
            } else {
                System.out.println("Temperature should be between -30.0 and +40.0");

            }
        }

        // Graph is used as follows:
        //Graph.addNumber(7);
        //double value = 13.5;
        //Graph.addNumber(value);
        //value = 3;
        //Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}
