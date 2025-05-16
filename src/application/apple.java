package application;

import entities.Celulares;

import java.util.Locale;
import java.util.Scanner;

public class apple {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Coloque os dados do Produto: ");
        System.out.print("Modelo: ");
        String modelo = entrada.nextLine();

        System.out.print("Preço: ");
        double preco = entrada.nextDouble();

        System.out.print("Quantidade em Estoque: ");
        int quantidade = entrada.nextInt();

        Celulares celulares = new Celulares(modelo, preco, quantidade);

        System.out.println("Produtos: " + celulares);

        System.out.print("Adicionar no Estoque: ");
        quantidade = entrada.nextInt();

        celulares.addEstoque(quantidade);

        System.out.println("Produtos: " + celulares);

        System.out.println("Remova do estoque: ");
        quantidade = entrada.nextInt();

        celulares.removeEstoque(quantidade);

        System.out.println("Produtos: " + celulares);

        entrada.close();
    }
}