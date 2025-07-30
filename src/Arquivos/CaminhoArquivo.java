package Arquivos;

import java.io.File;
import java.util.Scanner;

public class CaminhoArquivo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = entrada.nextLine();

        File path = new File(strPath);
        // Pegar o nome do Arquivo:
        System.out.println("getName: " + path.getName());

        // Pegar o nome da pasta:
        System.out.println("getParent: " + path.getParent());

        // Pegar todo o caminho:
        System.out.println("getPath: " + path.getPath());

        entrada.close();
    }
}
