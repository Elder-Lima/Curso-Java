package aulas;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        // Array bi-dimensional
        int[][] mat = new int[n][n];

        for(int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                mat[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Main Diagonal: ");

        for(int i=0; i<n; i++) {
            System.out.print(mat[i][i] + " ");
        }

        int negativos = 0;
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if(mat[i][j] < 0) {
                    negativos ++;
                }
            }
        }

        entrada.nextLine();
        System.out.print("Negative numbers = " + negativos);

        entrada.close();
    }
}