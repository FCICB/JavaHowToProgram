package chap15;

public class TransactionRecord {
    private int accountNumber;
    private double amount;

    public TransactionRecord(int accountNumber,double amount){
        this.accountNumber=accountNumber;
        this.amount=amount;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public double getAmount(){
        return amount;
    }
}
