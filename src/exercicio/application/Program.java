package exercicio.application;

import exercicio.entities.Department;
import exercicio.entities.HourContract;
import exercicio.entities.Worker;
import exercicio.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String department = entrada.nextLine();

        System.out.println("Enter worker data: ");

        System.out.print("Name: ");
        String name = entrada.nextLine();

        System.out.print("Level: ");
        String level = entrada.nextLine();

        System.out.print("Base salary: ");
        Double baseSalary = entrada.nextDouble();

        System.out.print("How many contracts to this worker: ");
        int n = entrada.nextInt();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));

        System.out.println();

        for (int x=1; x<=n; x++) {
            System.out.println("Enter contract #"+x+" data:");

            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(entrada.next());

            System.out.print("Value per hour: ");
            Double valuePerHour = entrada.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = entrada.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = entrada.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for "+monthAndYear+ ": " + String.format("%.2f", worker.income(year, month)));

        System.out.println();

        entrada.close();
    }
}
