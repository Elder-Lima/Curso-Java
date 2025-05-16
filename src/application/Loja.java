package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = entrada.nextLine();

        System.out.print("Price: ");
        double price = entrada.nextDouble();

        // System.out.print("Quantity in stock: ");
        // int quantity = entrada.nextInt();

        Product product = new Product(name, price);

        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());

        System.out.println("Product data: " + product);

        product.setPrice(1000.00);
        System.out.println("UPDATED Price: " + product.getPrice());

        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = entrada.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = entrada.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        entrada.close();
    }
}
