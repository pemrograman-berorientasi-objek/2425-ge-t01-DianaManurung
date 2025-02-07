package fintech.driver;

import fintech.model.Account;
import fintech.model.Transaction;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author 12S23040 Diana Manurung
 * @author 12S23047 Jennifer Sihotang
 */
public class Driver2 {
    public static void main(String[] _args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Account> accounts = new HashMap<>();

        String accountCommand = sc.nextLine();
        if (accountCommand.equals("create-account")) {
            String owner = sc.nextLine();
            String accountname = sc.nextLine();

            Account account = new Account(accountname, owner);
            accounts.put(accountname, account);
            System.out.println(account.toString());
        }

        String transactionCommand = sc.nextLine();
        if (transactionCommand.equals("create-transaction")) {
            String accountname = sc.nextLine();
            double amount = Double.parseDouble(sc.nextLine());
            String postedAt = sc.nextLine();
            String note = sc.nextLine();

            Account account = accounts.get(accountname);
            if (account != null) {
                Transaction transaction = new Transaction(accountname, amount, postedAt, note);
                account.addTransaction(transaction);

                System.out.println(transaction.toString() + "|" + account.getbalance());
            } else {
                System.out.println("Akun tidak ditemukan");
            }
        }

        sc.close();
    }
}