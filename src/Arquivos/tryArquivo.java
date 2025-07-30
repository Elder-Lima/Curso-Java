package Arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class tryArquivo {
    public static void main(String[] args) {

        // Criando a pasta e o Arquivo:
        File dir = new File("C:\\out");
        if (!dir.exists()) {
            dir.mkdirs(); // cria a pasta
        }

        File file = new File("C:\\out\\summary.csv");
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("Arquivo criado: " + file.getAbsolutePath());
            } catch (IOException e) {
                System.out.println("Erro ao criar arquivo: " + e.getMessage());
            }
        }

        // Verificando se o arquivo Existe e Lendo o Arquivo

        File file2 = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file2);
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e) {
            System.out.println("Error opening file: "+ e.getMessage());
        }
        finally{
            if (sc!= null) {
                sc.close();
            }
            System.out.println("Finally block executed");
        }
    }
}

