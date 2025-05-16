package aulas;

import java.util.Scanner;

public class doWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número positivo: ");
            numero = scanner.nextInt();
        } while (numero < 50);

        System.out.println("Você digitou: " + numero);
        scanner.close();
    }


}
