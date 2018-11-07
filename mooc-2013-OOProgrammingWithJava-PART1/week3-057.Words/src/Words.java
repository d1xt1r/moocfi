import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Type a word: ");
        String userWord = reader.nextLine();

        while (!userWord.isEmpty()){
            words.add(userWord);
            System.out.println("Type a word: ");
            userWord = reader.nextLine();
        }

        for (String word : words){
            System.out.println("You typed the following words: " + word);
        }
    }
}
