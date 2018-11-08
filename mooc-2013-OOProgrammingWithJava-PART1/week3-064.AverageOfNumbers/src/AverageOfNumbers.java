
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int sumOfNumbers = 0;
        for (int number : list){
            sumOfNumbers = sumOfNumbers + number;
        }
        return sumOfNumbers;
    }
    

    public static double average(ArrayList<Integer> list) {
        // write code here
        double itemsInList = list.size();
        double avgOfNumbers = sum(list) / itemsInList;
        return avgOfNumbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
