package application;

import entities.Cotacao;
import java.util.Locale;
import java.util.Scanner;

public class Cambio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double price = entrada.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double real = entrada.nextDouble();

        double conversao = Cotacao.CalculoDolar(price, real);
        System.out.printf("Amount to be paid in reais = " + String.format("%.2f", conversao));

        entrada.close();
    }
}