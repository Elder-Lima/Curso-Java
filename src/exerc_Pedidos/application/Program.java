package exerc_Pedidos.application;

import enumeracoes.entities.enums.OrderStatus;
import exerc_Pedidos.entities.Client;
import exerc_Pedidos.entities.Order;
import exerc_Pedidos.entities.OrderItem;
import exerc_Pedidos.entities.Product;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Enter client data: ");

        System.out.print("Name: ");
        String name = entrada.nextLine();

        System.out.print("Email: ");
        String email = entrada.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date date = sdf.parse(entrada.next());

        Client client = new Client(name, email, date);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");

        OrderStatus status = OrderStatus.valueOf(entrada.next());

        Order order  = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = entrada.nextInt();

        for (int x=1; x<=n; x++) {
            System.out.println("Enter #"+ x +" data: ");

            System.out.print("Product name: ");
            String nameProduct = entrada.next();

            entrada.nextLine();

            System.out.print("Product price: ");
            Double price = entrada.nextDouble();

            Product product = new Product(nameProduct, price);

            System.out.print("Quantity: ");
            int quantity = entrada.nextInt();

            OrderItem item = new OrderItem(quantity, price, product);

            order.addItem(item);
        }

        System.out.println();
        System.out.println(order);

        entrada.close();
    }
}