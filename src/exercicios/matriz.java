package exercicios;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        int y = entrada.nextInt();

        int[][] matriz = new int[x][y];

        for(int i=0; i<x; i++) {
            for(int j=0; j<y; j++) {
                matriz[i][j] = entrada.nextInt();
                System.out.println(matriz[i][j]);
            }
        }

        for (int p=0; p<x; p++) {
            for (int k=0; k<y; k++) {
                System.out.print(matriz[p][k] + " ");
            }
            System.out.println();
        }


        int num = entrada.nextInt();

        for(int i=0; i<x; i++) {
            for(int j=0; j<y; j++) {
                if(matriz[i][j] == num) {
                    System.out.println("Position: " + i+','+j);

                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                    if (j < matriz[i].length-1) { 
                        System.out.println("Right: " + matriz[i][j+1] +" " + matriz[i].length +" " + i +"," +j);
                    }
                    if (i < matriz.length-1) {
                        System.out.println("Down:" + matriz[i+1][j]);
                    }
                }
            }
        }

    }
}
