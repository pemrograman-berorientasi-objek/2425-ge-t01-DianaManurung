package fintech.driver;

import fintech.model.Account;

import java.util.Scanner;

/**
 * @author 12S23040 Diana Manurung
 * @author 12S23047 Jennifer Sihotang
 */
public class Driver1 {

    public static void main(String[] _args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();
        String owner = sc.nextLine();
        String accountname = sc.nextLine();

        if(command.equals("create-account")){
            Account account = new Account(accountname, owner);
            System.out.println(account.toString());
        }else{
            System.out.println("command tidak sesuai");
        }

        sc.close();
    }

}