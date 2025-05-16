package exercicios;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos numeros você vai digitar? ");
        int n = entrada.nextInt();

        double[] array = new double[n];

        for(int i=0; i< array.length; i++) {
           array[i] = entrada.nextDouble();
        }

        System.out.println("Numeros Negativos: ");

        for (double v : array) {
            if (v < 0) {
                System.out.println(v);
            }
        }

    }
}
