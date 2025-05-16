package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        BankAccount bankAccount;

        System.out.print("Enter account number: ");
        int account = entrada.nextInt();

        System.out.print("Enter account holder: ");
        String holder = entrada.next();

        System.out.print("Is there na initial deposit (y/n)?");
        String initialDeposit = entrada.next();

        switch (initialDeposit.toUpperCase()) {
            case "Y":
                System.out.print("Enter initial deposit value: ");
                double initialBalance = entrada.nextDouble();
                bankAccount = new BankAccount(account, holder, initialBalance);
                break;
            case "N":
                bankAccount = new BankAccount(account, holder);
                break;
            default:
                bankAccount = new BankAccount(account, holder);
                break;
        }

        System.out.println(bankAccount);

        System.out.print("Enter a deposit value: ");
        double balance = entrada.nextDouble();

        bankAccount.deposit(balance);

        System.out.println(bankAccount);

        System.out.print("Enter a withdraw value: ");
        double withdraw = entrada.nextDouble();

        bankAccount.withdraw(withdraw);

        System.out.println(bankAccount);

        entrada.close();
    }
}
