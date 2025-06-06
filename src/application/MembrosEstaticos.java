package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class MembrosEstaticos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = entrada.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);


        entrada.close();
    }
}
