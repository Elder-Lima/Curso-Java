package Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LendoProdutos {
    public static void main(String[] args) {
        String path = "c:\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] produtos = line.split(",");

                String nome = produtos[0];
                double preco = Double.parseDouble(produtos[1]);
                double estoque = Double.parseDouble(produtos[2]);

                double valueTotal = preco * estoque;

                System.out.println(nome + ", " + String.format("%.2f", valueTotal));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
