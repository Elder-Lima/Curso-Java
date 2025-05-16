package application;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {

        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        System.out.print("How many employees will be regitered: ");
        int n = entrada.nextInt();

        for(int x = 1; x<=n; x++) {
            System.out.println("Emplyoo #" + x);

            System.out.print("Id: ");
            int id = entrada.nextInt();
            while (hasId(listaFuncionarios, id)) {
                System.out.println("Esse id ja Existe! Digite Outro ID.");
                System.out.print("Id: ");
                id = entrada.nextInt();
            }
            entrada.nextLine();
            System.out.print("Name: ");
            String name = entrada.nextLine();

            System.out.print("Salary: ");
            double salary = entrada.nextDouble();

            Funcionario funcionario = new Funcionario(id, name, salary);
            listaFuncionarios.add(funcionario);

        }

        Optional<Funcionario> funcionario = Optional.empty();

        while (true) {
            System.out.print("Enter the employee id that will have salary increase: ");
            int id = entrada.nextInt();

            funcionario = listaFuncionarios.stream().filter(x -> x.getId() == id).findFirst();
            if (funcionario.isPresent()) {
                break;
            } else {
                System.out.println("Funcionário "+ id + " não Existe!");
            }

        }

        System.out.print("Enter the percentage: ");
        double percentage = entrada.nextDouble();

        funcionario.get().increaseSalary(percentage);

        System.out.println("List of employees: ");

        for (Funcionario p : listaFuncionarios) {
            System.out.println(p);
        }

        entrada.close();
    }
    
    public static boolean hasId(ArrayList<Funcionario> funcionario, int id) {
        Funcionario funcionarioId = funcionario.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return funcionarioId != null;
    }
}
