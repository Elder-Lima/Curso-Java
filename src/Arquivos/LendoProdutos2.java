package Arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LendoProdutos2 {
    public static void main(String[] args) {

        String path = "c:\\out\\summary.csv";
        List<Produtos> produtosList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] produtos = line.split(",");

                String nome = produtos[0];
                Double preco = Double.parseDouble(produtos[1]);
                Integer estoque = Integer.parseInt(produtos[2]);

                Produtos produto = new Produtos(nome, preco, estoque);
                produtosList.add(produto);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (Produtos p : produtosList) {
            System.out.println(p);
        }



    }
}
