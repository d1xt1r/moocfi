import java.util.Scanner;


public class LastCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name:");
        String name = reader.nextLine();
        System.out.println("Last character from your name is: " + lastCharacter(name));
    }

    public static char lastCharacter(String name){
        char character = name.charAt(name.length()-1);
        return character;
    }
}
