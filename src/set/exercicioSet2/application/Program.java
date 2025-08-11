package set.exercicioSet2.application;

import set.exercicioSet2.entities.Courses;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Set<Courses> courses = new HashSet<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("How many students for courses A? ");
        int a = entrada.nextInt();
        for (int x = 1; x <= a; x++) {
            int codStudent = entrada.nextInt();
            courses.add(new Courses(codStudent));
        }

        System.out.println("How many students for courses B? ");
        int b = entrada.nextInt();
        for (int x = 1; x <= b; x++) {
            int codStudent = entrada.nextInt();
            courses.add(new Courses(codStudent));
        }

        System.out.println("How many students for courses C? ");
        int c = entrada.nextInt();
        for (int x = 1; x <= c; x++) {
            int codStudent = entrada.nextInt();
            courses.add(new Courses(codStudent));
        }

        System.out.println("Total students: " + courses.size());
    }
}
