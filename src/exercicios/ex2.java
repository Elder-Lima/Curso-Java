package exercicios;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos numeros você vai digitar: ");

        int n = entrada.nextInt();
        double soma = 0;
        double media = 0;
        double [] vetor = new double[n];

        for (int x=0; x<n; x++) {
            vetor[x] = entrada.nextDouble();
        }

        System.out.print("Valores: ");

        for (int x=0; x<n; x++) {
            System.out.print(vetor[x]+" ");
        }
        System.out.println();
        System.out.print("Soma: ");

        for (int x=0; x<n; x++) {
            soma += vetor[x];
        }

        System.out.print(soma);
        System.out.println();
        System.out.print("Media: ");

        for (int x=0; x<n; x++) {
            media += vetor[x];
        }
        System.out.print(media / n);

    }
}
