package application;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        double[] vect = new double[n];
        double media = 0;

        for (int i=0; i < n; i++) {
            vect[i] = entrada.nextDouble();
            media += vect[i];
        }

        media /= n;
        System.out.println("Average Height = " + String.format("%.2f", media));

        entrada.close();

    }
}
