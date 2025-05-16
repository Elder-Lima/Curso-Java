package exercicios;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numerosPares = 0;
        System.out.print("Quantos numeros voce vai digitar: ");
        int n = entrada.nextInt();
        entrada.nextLine();

        int [] numeros = new int[n];

        for(int x=0; x<n; x++) {
            System.out.print("Digite um numero: ");
            numeros[x] = entrada.nextInt();
        }

        System.out.print("Numeros pares: ");

        for(int x=0; x<n; x++) {
            if((numeros[x] % 2) == 0) {
                System.out.print(numeros[x]+" ");
                numerosPares += 1;
            }
        }
        System.out.println();
        System.out.print("Quantidade de numeros Pares: " + numerosPares);
        entrada.close();
    }
}
