package chap15;

import java.io.*;
import java.util.Scanner;

public class FileMatch {
    public static void main(String[] args) {
        try {
            //oldmast.txt and trans.txt for reading.
            //newmast.txt and log.txt for writing.
            Scanner inOldMaster = new Scanner(new File("oldmast.txt"));
            Scanner inTransaction = new Scanner(new File("trans.txt"));
            PrintWriter outNewMaster = new PrintWriter("newmast.txt");
            PrintWriter logFile = new PrintWriter("log.txt");

            while (inOldMaster.hasNext() && inTransaction.hasNext()) {
                Account account = new Account(inOldMaster.nextInt(), inOldMaster.next(), inOldMaster.nextDouble());
                TransactionRecord transaction = new TransactionRecord(inTransaction.nextInt(), inTransaction.nextDouble());

                if (account.getAccountNumber() == transaction.getAccountNumber()) {
                    account.combine(transaction);
                } else {
                    logFile.println("Unmatched transaction record for account number: " + transaction.getAccountNumber());
                }

                outNewMaster.println(account.toString());
            }

            // Process remaining records in oldmast.txt
            while (inOldMaster.hasNext()) {
                Account account = new Account(inOldMaster.nextInt(), inOldMaster.next(), inOldMaster.nextDouble());
                outNewMaster.println(account.toString());
            }

            inOldMaster.close();
            inTransaction.close();
            outNewMaster.close();
            logFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
