package Pagamentos.src.application;

import Pagamentos.src.model.entities.Contract;
import Pagamentos.src.model.entities.Installment;
import Pagamentos.src.model.services.ContractService;
import Pagamentos.src.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        int number = entrada.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(entrada.next(), fmt);

        System.out.print("Valor do contrato: ");
        double totalValue = entrada.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Entre com o numero de parcelas: ");
        int n = entrada.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, n);
        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstalments()) {
            System.out.println(installment);
        }

        entrada.close();
    }
}
