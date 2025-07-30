package Arquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        // Exemplo entre com: c:\temp / ira retornar todas as pastas dentro de temp
        String strPath = entrada.next();

        File path = new File(strPath);

        // Vetor contendo caminho das pastas
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("Folders: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        // Mostrar todos os arquivos dentro de temp
        File[] files = path.listFiles(File::isFile);

        System.out.println("Files: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);

        entrada.close();
    }
}
