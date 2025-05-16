package aulas;

public class Funcoes {

    public static void main(String[] args) {

        String original = "abcdeFGHIJ ABC abc DEFG";
        System.out.println(original);

        // Converter todas as strings para minúsculas:
        String s01 = original.toLowerCase();
        System.out.println(s01);

        // Converter todas as strings para Maiúsculas:
        String s02 = original.toUpperCase();
        System.out.println(s02);

        // REMOVER OS ESPAÇOS NOS CANTOS DA VARIÁVEL
        String s03 = original.trim();
        System.out.println(s03);

        // PEGAR SOMENTE OS CARACTERES APARTIR DE UM INDICE ESPECIFICO
        String s04 = original.substring(2);
        System.out.println(s04);

        String s05 = original.substring(2, 5);
        System.out.println(s05);

        // Trocar um caracter especifico por outro:
        String s07 = original.replace("a", "x").replace("A", "X");
        System.out.println(s07);

        String s06 = original.replaceAll("(?i)a", "x");
        System.out.println(s06);

        String cpf = "789.456.123-78";
        String cpfFormatado = cpf.replace(".", "").replace("-", "");
        System.out.println(cpfFormatado);

        // Separar por um determinado caracter:
        String s = "potato apple lemon";

        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println("Word1: " + word1 + "| Word2: " + word2 + "| word3: " + word3);



    }

}
