package exerc_taxpayer.application;

import exerc_taxpayer.entities.Company;
import exerc_taxpayer.entities.Individual;
import exerc_taxpayer.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int n = entrada.nextInt();

        for (int x=1; x<=n; x++) {
            System.out.println("Tax payer #"+x+" data: ");
            System.out.print("Individual or company (i/c)? ");
            char type = entrada.next().charAt(0);
            System.out.print("Name: ");
            String name = entrada.next();
            System.out.print("Anual Income: ");
            double anualIncome = entrada.nextDouble();
            switch (type) {
                case 'i': {
                    System.out.print("Health expenditures: ");
                    double healthExpenditures = entrada.nextDouble();
                    TaxPayer taxPayer = new Individual(name, anualIncome, healthExpenditures);
                    list.add(taxPayer);
                    break;
                }
                case 'c': {
                    System.out.println("Number of employees: ");
                    int numberEmployees = entrada.nextInt();
                    TaxPayer taxPayer = new Company(name, anualIncome, numberEmployees);
                    list.add(taxPayer);
                    break;
                }
            }
        }

        System.out.println("TAXES PAID: ");
        for (TaxPayer payer : list) {
            System.out.println(payer.getName() +": $ "+ String.format("%.2f", payer.tax()));
        }

        double sum = 0;
        for (TaxPayer payer : list) {
            sum += payer.tax();
        }
        System.out.print("TOTAL TAXES: "+sum);
    }
}
