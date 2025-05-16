package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class MediaNota {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Nome: ");
        aluno.name = entrada.nextLine();

        System.out.print("Notas: ");
        aluno.nota1 = entrada.nextDouble();
        aluno.nota2 = entrada.nextDouble();
        aluno.nota3 = entrada.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", aluno.finalGrade());

        if (aluno.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());
        }else {
            System.out.println("PASS");
        }

        entrada.close();

    }
}
