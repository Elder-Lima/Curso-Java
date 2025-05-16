package entities;

import java.util.Date;

public class BankAccount {
    private int account;
    private String holder;
    private double balance;
    private Date data;
    final int tax = 5;

    public BankAccount(int account, String holder) {
        this.account = account;
        this.holder = holder;
        this.data = new Date();
    }

    public BankAccount(int account, String holder, double balance) {
        this.account = account;
        this.holder = holder;
        deposit(balance);
        this.data = new Date();
    }

    public Date getData() {
        return this.data;
    }

    public int getAccount() {
        return this.account;
    }

    public String setHolder(String holder) {
        return this.holder = holder;
    }

    public String getHolder() {
        return this.holder;
    }

    public void deposit(double deposit) {
        if(deposit > 0) {
            this.balance += deposit;
            this.data = new Date();
        } else {
            System.out.println("Deposito Invalido!");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void withdraw(double withdraw) {
        if(withdraw > 0) {
            this.data = new Date();
            this.balance -= (withdraw + tax);
        }else {
            System.out.println("Saque Invalido!");
        }
    }

    public String toString() {
        return "Update Account data: "+ getData() + " Account: " + getAccount() + ", Holder: " + getHolder() + ", Balance: $" + String.format("%.2f", getBalance());
    }
}
