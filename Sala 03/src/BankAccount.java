public class BankAccount {
    private double balance;
    private String name;
    private int acctNum;
    private double limit;

    public void setAcctNum(int acctNum) {
        this.acctNum = acctNum;
    }

    public int getAcctNum() {
        return acctNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return balance;
        } else {
            return balance;
        }
    }

    public double withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return balance;
        } else {
            return balance;
        }
    }

    public void consult() {
        System.out.println("Your balance is: " + balance);
    }
}