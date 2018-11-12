
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here

        Account dexAccount = new Account("Dex's account",100.0);
        dexAccount.deposit(20.0);

        System.out.println(dexAccount);
    }
}
