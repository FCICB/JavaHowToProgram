package chap15;

public class Account {
    private int accountNumber;
    private String name;
    private double balance;

    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
//method is used to update the account balance based on a transaction record.
    public void combine(TransactionRecord transaction) {
        balance += transaction.getAmount();
    }
// custom string representation of the account.
    @Override
    public String toString() {
        return accountNumber + " " + name + " " + balance;
    }
}
