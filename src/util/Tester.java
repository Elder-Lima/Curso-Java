package util;
import ExerciciosLeet.vetores.vetor3;

public class Tester {
    public static void main(String[] args) {
        long inicio = System.nanoTime();
// Vetor1: 13769300 ns
// Vetor2: 19718900 ns
// Código a ser testado
        vetor3.main(null);

        long fim = System.nanoTime();
        long duracao = fim - inicio;

        System.out.println("Tempo de execução: " + duracao + " ns");
    }
}
