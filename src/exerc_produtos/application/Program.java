package exerc_produtos.application;

import exerc_produtos.entities.ImportedProduct;
import exerc_produtos.entities.Product;
import exerc_produtos.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        List<Product> produtos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = entrada.nextInt();
        entrada.nextLine();

        for (int x=1; x<=n; x++) {
            System.out.println("Product #"+x+" data:");
            System.out.print("Common, used or imported (c, u, i): ");
            char type = entrada.next().charAt(0);
            System.out.print("Name: ");
            entrada.nextLine();
            String name = entrada.next();
            entrada.nextLine();
            System.out.print("Price: ");
            double price = entrada.nextDouble();

            switch (type) {
                case 'c': {
                    Product produto = new Product(name, price);
                    produtos.add(produto);
                    break;
                }
                case 'u': {
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    LocalDate date = LocalDate.parse(entrada.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    Product produto = new UsedProduct(name, price, date);
                    produtos.add(produto);
                    break;
                }
                case 'i': {
                    System.out.print("Customs fee: ");
                    Double customsFee = entrada.nextDouble();
                    Product product = new ImportedProduct(name, price, customsFee);
                    produtos.add(product);
                }
            }
        }

        System.out.println("PRICE TAGS: ");

        for (Product p : produtos) {
            System.out.println(p.priceTag());
        }

        entrada.close();
    }
}
