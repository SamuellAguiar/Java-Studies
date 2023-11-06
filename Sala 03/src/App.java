import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.println("J--------------------------Welcome to the Bank of Java--------------------------J");

        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("\n");

        System.out.println("Please enter your account number: ");
        int acctNum = sc.nextInt();
        System.out.println("\n");

        System.out.println("Please enter your account limit: ");
        double limit = sc.nextDouble();
        System.out.println("\n");

        System.out.println("Please enter your account balance: ");
        double balance = sc.nextDouble();
        System.out.println("\n");

        account.setName(name);
        account.setAcctNum(acctNum);
        account.setLimit(limit);
        account.setBalance(balance);


        System.out.println("Your account has been created.");
        System.out.println("\n");

        System.out.println("Your account name is: " + account.getName());
        System.out.println("Your account number is: " + account.getAcctNum());
        System.out.println("Your account limit is: " + account.getLimit());
        System.out.println("Your account balance is: " + account.getBalance());
        System.out.println("\n");

        System.out.println("Please enter the amount you would like to deposit: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println("\n");

        System.out.println("Your new balance is: " + account.getBalance());
        System.out.println("\n");

        System.out.println("Please enter the amount you would like to withdraw: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println("\n");

        System.out.println("Your new balance is: " + account.getBalance());
        account.consult();
        System.out.println("\n");

        System.out.println("J-------------------------------------------------------------------------------J");

        sc.close();

    }
}