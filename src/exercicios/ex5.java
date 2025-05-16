package exercicios;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.print("How many rooms will  be rented: ");
        n = entrada.nextInt();

        while (n < 1 || n > 9) {
            System.out.println("Invalid number! Please enter a number between 1 and 9.");
            System.out.print("How many rooms will be rented: ");
            n = entrada.nextInt();
        }

        boolean disponivel = false;
        Pensionato[] hospedes = new Pensionato[10];

        entrada.nextLine();
        for(int x=1; x<=n; x++) {
            System.out.println("Rent #"+ x +":");
            System.out.print("Name: ");
            String name = entrada.nextLine();

            System.out.print("Email: ");
            String email = entrada.nextLine();

            while (!disponivel) {
                System.out.print("Room: ");
                int room = entrada.nextInt();

                if (room >= hospedes.length || room < 1) {
                    System.out.println("Numero do Quarto Incorreto! Digite Novamente.");
                    System.out.println("Quartos Disponíveis: ");
                    for (int i = 1; i < hospedes.length; i++) {
                        if (hospedes[i] == null) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                } else if (hospedes[room] == null) {
                    hospedes[room] = new Pensionato(room, name, email);
                    disponivel = true;
                } else {
                    System.out.println("Quarto " + room + " NÃO está Disponível");
                    System.out.print("Quartos Disponíveis: ");
                    for (int i = 1; i < hospedes.length; i++) {
                        if (hospedes[i] == null) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                }
            }
            disponivel = false;
            entrada.nextLine();
        }

        System.out.println("Busy room: ");

        for(int i=0; i < 10; i++) {
            if(hospedes[i] != null) {
                System.out.println(hospedes[i]);
            }
        }

    }
}
