package exercicios;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double mediaAltura = 0;
        double menores16 = 0;

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = entrada.nextInt();
        entrada.nextLine();
        Aluno[] alunos = new Aluno[n];

        for(int x=0; x<n; x++) {
            System.out.println("Dados da "+ (x+1) + "a pessoa:");
            System.out.print("Nome: ");
            String nome = entrada.nextLine();

            System.out.print("Idade: ");
            int idade = entrada.nextInt();

            System.out.print("Altura: ");
            double altura = entrada.nextDouble();
            mediaAltura += altura;
            entrada.nextLine();

            alunos[x] = new Aluno(nome, idade, altura);
        }

        mediaAltura /= n;
        System.out.println("Altura média: " + String.format("%.2f", mediaAltura));

        for (int x=0; x<n; x++) {
            if(alunos[x].getIdade() < 16) {
                menores16 += 1;
            }
        }
        menores16 = menores16 / n * 100;
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", menores16) +"%");
        for (int x=0; x<n; x++) {
            if(alunos[x].getIdade() < 16) {
                System.out.println(alunos[x].getNome());
            }
        }

    }
}
