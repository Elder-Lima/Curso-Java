package map.ex3.src.application;

import map.ex3.src.entities.Urna;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Map<String, Integer> votos = new HashMap<>();

        System.out.println("Enter file full path: ");
        String path = entrada.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");

                //Os dois Funcionam:
                votos.compute(fields[0], (key, val) -> (val == null) ? Integer.parseInt(fields[1]) : val + Integer.parseInt(fields[1]));
                //votos.merge(fields[0], Integer.parseInt(fields[1]), Integer::sum);

                line = br.readLine();

            }
            for (String key : votos.keySet()) {
                System.out.println(key + ": " + votos.get(key));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        entrada.close();
    }
}
