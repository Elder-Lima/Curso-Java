package application;

import entities.Retangle;

import java.util.Locale;
import java.util.Scanner;

public class CalRetangulo {
    public static void  main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Enter rectangle width and height: ");

        Scanner entrada = new Scanner(System.in);

        Retangle retangle = new Retangle();

        System.out.print("Width: ");
        retangle.width = entrada.nextDouble();

        System.out.print("Height: ");
        retangle.height = entrada.nextDouble();


        System.out.println(retangle);

        entrada.close();

    }
}
