package default_methods.src.application;

import default_methods.src.services.BrazilInterestService;
import default_methods.src.services.InterestService;
import default_methods.src.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = entrada.nextDouble();

        System.out.print("Months: ");
        int months = entrada.nextInt();

        InterestService is = new UsaInterestService(1.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + "months: ");
        System.out.println(String.format("%.2f", payment));

        entrada.close();
    }
}
