package class_abstract.application;

import class_abstract.entities.Account;
import class_abstract.entities.BusinessAccount;
import class_abstract.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        //Erro porque a class account é abstrata: Account acc1 = new Account(1001, "Alex", 1000.0);
        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        Account acc3 = new BusinessAccount(1003, "João", 1000.0, 500.0);

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1004, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1005, "Cristiano", 1000.00, 400.0));
        list.add(new SavingsAccount(1006, "Ney", 300.00, 0.01));
        list.add(new BusinessAccount(1007, "Livia", 9500.00, 500.0));

        double sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }

        System.out.println(sum);

        for (Account acc : list) {
            acc.withdraw(10.0);
        }

        for (Account acc : list) {
            System.out.println("Updated balance for account "+ acc.getNumber() + ": "+ acc.getBalance());
        }

    }
}
