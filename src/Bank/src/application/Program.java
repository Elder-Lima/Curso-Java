package Bank.src.application;

import Bank.src.model.entities.Account;
import Bank.src.model.exceptions.DomainExceptions;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = entrada.nextInt();

            System.out.print("Holder: ");
            String holder = entrada.next();

            entrada.nextLine();

            System.out.print("Initial balance: ");
            double balance = entrada.nextDouble();

            System.out.print("Withdraw Limit: ");
            double withdrawLimit = entrada.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.print("Enter amount for withdraw: ");
            double amount = entrada.nextDouble();

            account.withdraw(amount);

            System.out.println(account);

        }catch (DomainExceptions e) {
            System.out.println("Erro de saque: " + e.getMessage());
        }catch (RuntimeException e) {
            System.out.println("Erro inesperado.");
        }
    }
}
