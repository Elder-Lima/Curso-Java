package Interface.Locadora.solucao1.src.application;

import Interface.Locadora.solucao1.src.model.entities.CarRental;
import Interface.Locadora.solucao1.src.model.entities.Vehicle;
import Interface.Locadora.solucao1.src.model.services.BrazilTaxService;
import Interface.Locadora.solucao1.src.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");

        System.out.print("Modelo do carro: ");
        String carModel = entrada.nextLine();

        System.out.println("Retirada (dd/MM/yyyy): ");
        LocalDateTime start = LocalDateTime.parse(entrada.next(), fmt);

        System.out.print("Retorno (dd/MM/yyyy): ");
        LocalDateTime finish = LocalDateTime.parse(entrada.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por Hora: ");
        double pricePerHour = entrada.nextDouble();

        System.out.print("Entre o preço por Dia: ");
        double pricePerDay = entrada.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("Fatura: ");
        System.out.println("Pagamento básico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Pagamento Total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        entrada.close();
    }
}
