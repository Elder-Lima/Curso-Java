package exerc_polimorfismo.application;

import exerc_polimorfismo.entities.Employee;
import exerc_polimorfismo.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = entrada.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Employee #"+i+" data: ");
            System.out.print("Outsourced (y/n)? ");
            char ch = entrada.next().charAt(0);

            System.out.print("Name: ");
            String name = entrada.next();

            System.out.print("Hours: ");
            int hours = entrada.nextInt();

            System.out.print("Value per Hour: ");
            double valuePerHour = entrada.nextDouble();

            if(ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = entrada.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            }else {
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }

        System.out.println();
        System.out.println("Payments: ");

        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ "+ String.format("%.2f", emp.payment()));
        }



        entrada.close();
    }
}
