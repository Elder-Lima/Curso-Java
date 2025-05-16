package aulas;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Insira 3 números para soma:");
        int a = entradaDados.nextInt();
        int b = entradaDados.nextInt();
        int c = entradaDados.nextInt();

        int soma = somarNumeros(a, b, c);

        mostrarResultados(soma);

        entradaDados.close();
    }

    public static int somarNumeros(int x, int y, int z) {
        int somaTotal;
        somaTotal = x + y + z;
        return somaTotal;
    }

    public static void mostrarResultados(int value) {
        System.out.println("Soma dos 3 numeros: "+ value);
    }
}
