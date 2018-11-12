
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here

        Account accountA = new Account("Account A",100.0);
        Account accountB = new Account("Account B",0);
        Account accountC = new Account("Account C",0);

        transfer(accountA,accountB,50.0);
        transfer(accountB,accountC,25.0);

        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);

        }

    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

}

