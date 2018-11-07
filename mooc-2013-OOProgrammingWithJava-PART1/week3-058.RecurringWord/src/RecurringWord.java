
import java.util.ArrayList;
        import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList

        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Type a word: ");
        String userWord = reader.nextLine();

        while (true){
            words.add(userWord);
            System.out.println("Type a word: ");
            userWord = reader.nextLine();
            if(words.contains(userWord)){
                System.out.println("You gave the word " + userWord + " twice");
                break;
            }
        }
    }
}
