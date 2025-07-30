package heranca.application;

import heranca.entities.Account;
import heranca.entities.BusinessAccount;
import heranca.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING: É quando um objeto de uma subclasse é convertido para um tipo da superclasse.
        // Isso é automático e seguro, pois toda subclasse é também uma instância da superclasse.

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING: É quando você tenta converter um objeto da superclasse para uma subclasse.
        //Isso precisa ser feito explicitamente e só funciona se o objeto realmente for da subclasse.

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // ERROR: BusinessAccount acc5 = (BusinessAccount) acc3;|
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        Account acc5 = new Account(1005, "Cris", 1000.0);
        acc5.withdraw(200.0);
        System.out.println(acc5.getBalance());

        Account acc6 = new SavingsAccount(1006, "Maria", 1000.0, 0.1);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

        Account acc7 = new BusinessAccount(1007, "Bob", 1000.0, 500.0);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());

        // Polimorfismo: Muitas formas
        // result: x = 945 / y = 950
        Account x = new Account(1020, "Endrick", 1000.0);
        Account y = new SavingsAccount(1021, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);
        System.out.println(x.getBalance());
        System.out.println(y.getBalance());


    }
}
