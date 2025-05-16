package application;

import entities.Salario;

import java.util.Locale;
import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Salario salario = new Salario();

        System.out.print("Name: ");
        salario.name = entrada.nextLine();

        System.out.print("Gross salary: ");
        salario.grossSalary = entrada.nextDouble();

        System.out.print("Tax: ");
        salario.tax = entrada.nextDouble();

        System.out.println("Employee: "+ salario);

        System.out.print("Which perentage to increase salary? ");
        double percentage = entrada.nextDouble();

        salario.IncreaseSalary(percentage);

        System.out.println("Updated data: " + salario);
        System.out.println(salario.grossSalary);

        entrada.close();
    }
}
