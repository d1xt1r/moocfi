import java.util.ArrayList;
import java.util.Scanner;

public class MoreThanOnce {

    public static boolean moreThanOnce(ArrayList<Integer> list, int searched) {

        int moreThanOnce = 0; // loop index
        for(int numberInList : list){ // loop through all numbers in the list
            if(numberInList == searched){ // if any number in the list is equal to the searched number
                moreThanOnce++; // increase loop index by 1
            }
            if(moreThanOnce >= 2){ // if moreThanOnce is equal or bigger than 2 the number appears on the list more than once
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once. ");
        }
    }
}
