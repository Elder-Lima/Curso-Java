package generics.ex1.src.application;

import generics.ex1.src.services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService();

        System.out.print("How many values? ");
        int n = entrada.nextInt();


        for (int i=0; i<n; i++) {
            int value = entrada.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.first();
        System.out.println("First: " + x);

        entrada.close();
    }
}
